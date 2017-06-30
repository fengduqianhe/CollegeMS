package com.College.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.CollegeMS.util.DBManger;

public class AddClass extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String   College=req.getParameter("college");
		System.out.println(College);
		String   Major=req.getParameter("major");
		String   Message=req.getParameter("message");
		Integer  Number=Integer.parseInt(req.getParameter("number"));
		Integer  NumCollege=Integer.parseInt(req.getParameter("numcollege"));
		Integer  NumMajor=Integer.parseInt(req.getParameter("nummajor"));
		Integer  NumClass =Integer.parseInt(req.getParameter("numclass"));
		Integer  NumPeople=Integer.parseInt(req.getParameter("numpeople"));
		
		
		DBManger dbManger=new DBManger();
		 int num=dbManger.addClass(College, Major, Message, Number, NumCollege, NumMajor, NumClass, NumPeople);
		if(num>0){
			  req.setAttribute("addmessage", "添加成功");
			  req.getRequestDispatcher("RescruitManger/Recruit.jsp").forward(req, resp);
		}
		else{
			req.setAttribute("addmessage", "添加失败");
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}
	
}
