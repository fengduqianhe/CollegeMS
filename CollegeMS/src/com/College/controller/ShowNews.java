package com.College.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.CollegeMS.bean.Annoucent;
import com.CollegeMS.util.DBManger;

public class ShowNews extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		 DBManger dBmanger=new DBManger();
	        Annoucent annoucent=dBmanger.getAllAnnoucent();
	        System.out.println(annoucent.getId());
	        req.setAttribute("annoucent",annoucent);
	        req.getRequestDispatcher("Users/SchoolPage.jsp").forward(req,resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}
}
