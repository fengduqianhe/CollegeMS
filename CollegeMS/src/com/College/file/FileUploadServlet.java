package com.College.file;

import java.io.File;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.lang3.StringUtils;


public class FileUploadServlet extends HttpServlet {

	//private static final long serialVersionUID = 5921986335210326590L;
    private static final String INIT_PARAM_SAVE_DIR_KEY = "UPLOAD_SAVE_DIR";
    private File tempDir;
    private File saveDir;

    public void init(ServletConfig config) throws ServletException {
        String saveDirStr = config.getInitParameter(INIT_PARAM_SAVE_DIR_KEY);
        if (StringUtils.isEmpty(saveDirStr)) {
            saveDirStr = new StringBuffer(config.getServletContext().getRealPath("/")).append("\\saved").toString();
        }
        saveDir = new File(saveDirStr);
        saveDir.mkdir();
        String tempDirStr = new StringBuffer(saveDirStr).append("\\temp").toString();
        tempDir = new File(tempDirStr);
        tempDir.mkdir();
    }

    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException {
    	String path="";
        DiskFileItemFactory factory = new DiskFileItemFactory(DiskFileItemFactory.DEFAULT_SIZE_THRESHOLD, tempDir);
        ServletFileUpload upload = new ServletFileUpload(factory);
        String client = req.getRemoteHost();
        try {
            List items = upload.parseRequest(req);
            Iterator iter = items.iterator();
            int index = 0;
            while (iter.hasNext()) {
                FileItem item = (FileItem) iter.next();
                if (!item.isFormField()) {
                    String originalPath = item.getName();
                    String originalFileName = originalPath.substring(originalPath.lastIndexOf('\\') + 1);
                    Calendar cal = Calendar.getInstance();
                    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
                    String dateStr = formatter.format(cal.getTime());
                    File uploadedFile = new File(saveDir.getPath() + "\\" + originalFileName + "." + dateStr + "("
                            + client + "." + (index++) + ")");
                    uploadedFile.createNewFile();
                    System.out.println(uploadedFile);
                    path=uploadedFile.toString();
                    item.write(uploadedFile);
                }
            }
            resp.setContentType("text/html");
            PrintWriter out = resp.getWriter();
            Date date = new Date();
            out.println("upload file: " + date + "上传路径:"+path);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
	
	
}
