package com.College.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 实现修改学生 学院  专业
 * @author me
 *
 */
public class EditStudentport extends HttpServlet{
	@Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	req.setCharacterEncoding("UTF-8");
    	resp.setContentType("text/html;charset=UTF-8");
    	/**
    	 * 接受URL传值的参数
    	 */
        String Sno=req.getParameter("Sno");
       // String College=new String(college.getBytes("UTF-8"),"ISO8859-1");
        System.out.println(Sno);
        String College=req.getParameter("College");
       // String Major=new String(major.getBytes("UTF-8"),"ISO8859-1");
        System.out.println(College);
        String Major=req.getParameter("Major");
      //   String CID=new String(cid.getBytes("UTF-8"),"ISO8859-1");
        System.out.println(Major);
        /**
         * 传输数据
         */
        req.setAttribute("Sno",Sno);
        req.setAttribute("College",College);
        req.setAttribute("Major",Major);
        req.getRequestDispatcher("StudentManger/EditStudent.jsp").forward(req,resp);
    }
}
