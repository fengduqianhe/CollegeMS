package com.College.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.CollegeMS.bean.Working;
import com.CollegeMS.util.MBmanger;

public class ShowWorking extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		   MBmanger mBmanger=new MBmanger();
		   List<Working>working=mBmanger.getAllWorking();
	        req.setAttribute("working",working);
	        req.getRequestDispatcher("WorkingManger/WorkingMessage.jsp").forward(req,resp);
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}
	

}
