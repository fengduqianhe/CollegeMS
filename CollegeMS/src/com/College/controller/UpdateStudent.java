package com.College.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.CollegeMS.util.DBManger;
import com.CollegeMS.util.SDBmanger;

public class UpdateStudent extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String sno=req.getParameter("sno");
		String college=req.getParameter("college");
		String major=req.getParameter("major");
        SDBmanger sdbmanger=new SDBmanger();
        sdbmanger.upDateStudent(sno, college, major);
		req.getRequestDispatcher("StudentManger/UpdateSuccess.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}
	

}
