package com.College.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.CollegeMS.util.MBmanger;

public class DeleteWorking extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String id = req.getParameter("HID");
		MBmanger mBmanger = new MBmanger();
		mBmanger.deletejob(id);
		req.getRequestDispatcher("WorkingManger/DeleteSuccess.jsp").forward(
				req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}

}
