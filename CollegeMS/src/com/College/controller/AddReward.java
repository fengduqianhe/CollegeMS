package com.College.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.CollegeMS.util.DBManger;
import com.CollegeMS.util.MBmanger;

public class AddReward  extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String Sno=req.getParameter("sno");
		String name=req.getParameter("name");
		int cost=Integer.parseInt(req.getParameter("cost"));
		String message=req.getParameter("message");
		MBmanger dbManger=new MBmanger();
		int num=dbManger.addReward(name, message, cost, Sno);
		System.out.println(num);
		if(num>0){
			req.getRequestDispatcher("RewardManger/AddSuccess.jsp").forward(req, resp);
		}
		else{
			/**
			 * 添加时  要考虑外键的问题
			 */
			req.getRequestDispatcher("RewardManger/AddFailure.jsp").forward(req, resp);
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}	
}
