package com.College.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.CollegeMS.bean.Friend;
import com.CollegeMS.bean.LeavStudent;
import com.CollegeMS.util.FBManger;

public class ShowLeavStudent extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		FBManger fbManger=new FBManger();
		List<LeavStudent> leastudent = fbManger.getAllLeavStudent();
		req.setAttribute("leastudent", leastudent);
		req.getRequestDispatcher("LeavStudentManger/LeavStudentMessage.jsp").forward(req,
				resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}

	
}
