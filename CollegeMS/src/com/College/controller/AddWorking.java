package com.College.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.CollegeMS.util.MBmanger;

/**
 * 添加岗位细信息
 * @author me
 *
 */
public class AddWorking extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String job=req.getParameter("job");
		System.out.println(job);
		String place=req.getParameter("place");
		int salery=Integer.parseInt(req.getParameter("salery"));
		MBmanger mBmanger=new MBmanger();
		int num=mBmanger.addWorking(job, place, salery);
			req.getRequestDispatcher("WorkingManger/EditSuccess.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}

}
