package com.College.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.CollegeMS.bean.ClassMessage;
import com.CollegeMS.bean.Student;
import com.CollegeMS.util.DBManger;
import com.CollegeMS.util.SDBmanger;

/**
 * 显示学生信息
 * @author me
 *
 */
public class ShowStudent extends HttpServlet {
	 private static final long serialVersionUID=1L;
	    @Override
	    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	    }

	    @Override
	    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	        SDBmanger sdbmanger=new SDBmanger();
	        /**
	         * 封装 List  传送到JSP
	         */
	        List<Student>student=sdbmanger.getAll();
	        req.setAttribute("student",student);
	        System.out.println("keyi");
	        req.getRequestDispatcher("StudentManger/StudentMessage.jsp").forward(req,resp);
	    }

}
