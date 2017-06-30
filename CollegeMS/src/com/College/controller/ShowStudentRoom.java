package com.College.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.CollegeMS.bean.Student;
import com.CollegeMS.bean.StudentRoom;
import com.CollegeMS.util.FBManger;
import com.CollegeMS.util.SDBmanger;

public class ShowStudentRoom  extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
	     FBManger fbmanger=new FBManger();
	        /**
	         * 封装 List  传送到JSP
	         */
	        List<StudentRoom>studentRoom=fbmanger.getAllStudentRoom();
	        req.setAttribute("studentRoom",studentRoom);
	        System.out.println("keyi");
	        req.getRequestDispatcher("StudentRoom/StudentRoomMessage.jsp").forward(req,resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}
	

}
