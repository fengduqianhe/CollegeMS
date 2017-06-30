package com.College.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.CollegeMS.bean.Working;

public class EditWorkingport extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
	    int id=Integer.parseInt(req.getParameter("HID"));
		String job=req.getParameter("job");
		String place=req.getParameter("place");
		int salery=Integer.parseInt(req.getParameter("salery"));
		System.out.println(job);
		Working working =new Working(id,job,place,salery);
		req.setAttribute("working", working);
		req.getRequestDispatcher("WorkingManger/EditWorking.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}
}
