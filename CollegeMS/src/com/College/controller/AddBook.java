package com.College.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.CollegeMS.util.MBmanger;

public class AddBook extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String major=req.getParameter("major");
		String name=req.getParameter("name");
		String message=req.getParameter("message");
		int cost=Integer.parseInt(req.getParameter("cost"));
		MBmanger mBmanger=new MBmanger();
		int num=mBmanger.addBook(major, name, message, cost);
			req.getRequestDispatcher("BookManger/AddSuccess.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}
}
