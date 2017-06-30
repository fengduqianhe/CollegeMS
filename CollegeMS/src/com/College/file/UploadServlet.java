package com.College.file;


import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;


public class UploadServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost( request,  response);

	}

	public void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		resp.getWriter().print("上传成功");
			//  1.创建工厂
			FileItemFactory factory = new DiskFileItemFactory();
			/*
			 * 2.创建解析器对象
			 */
			ServletFileUpload sfu = new ServletFileUpload(factory);
			sfu.setFileSizeMax(2 * 1024 * 1024);		//最大值2M
			/*
			 * 3.解析request得到List<FileItem>
			 */
			List<FileItem> fileItemList = null;
			try {
				fileItemList = sfu.parseRequest(req);
			} catch (FileUploadException e) {
				//如果出现异常，说明单个文件超出80KB
				e.printStackTrace();
			}
			/*
			 * 4.2把上传的图片保存起来
			 *   >获取文件名，截取之
			 *   >给文件添加前缀，使用uuid前缀，避免文件同名
			 *   >校验文件的扩展名，只能是jpg
			 *   >校验图片的尺寸
			 *   >指定图片的保存路径，ServletContext.getRealPath()
			 *   >保存之
			 *   >把图片的路径设给book对象
			 */
			//  获取文件名
			FileItem fileItem = fileItemList.get(0);//获取大图
			String filename = fileItem.getName();
			System.out.println("filename 1 :" + filename);
			//截取文件名，部分浏览器上传的是绝对路径
			int index = filename.lastIndexOf("\\");
			if(index != -1){
				filename = filename.substring(index + 1);
			}
			System.out.println("filename 2 :" + filename);
			//校验文件名称的扩展名
			if(!filename.toLowerCase().endsWith(".jpg")){
				System.out.println("文件类型不是jpg");
				return;
			}
			//  校验图片的尺寸
			//  保存上传的图片，把图片new成图片对象：Image、Icon、ImageIcon、BufferedImage、ImageIO...
			/*
			 * 保存图片：
			 * 1.获取真实路径
			 */
			String savepath = this.getServletContext().getRealPath("/");
			System.out.println("savepath : " + savepath);
			/*
			 * 2.创建目标文件
			 */
			File destFile = new File(savepath,filename);
			/*
			 * 3.保存文件
			 */
			try {
				fileItem.write(destFile);//  把临时文件保存到指定的路径,再删除临时文件
			} catch (Exception e) {
				e.printStackTrace();
			}
	}

}
