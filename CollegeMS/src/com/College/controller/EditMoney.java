package com.College.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.CollegeMS.bean.Money;

public class EditMoney  extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String id=req.getParameter("id");
		int book=Integer.parseInt(req.getParameter("book"));
		int en=Integer.parseInt(req.getParameter("en"));
		int ma=Integer.parseInt(req.getParameter("ma"));
		int register=Integer.parseInt(req.getParameter("register"));
		Money money =new Money(id, book, en, ma, register);
		req.setAttribute("money", money);
		req.getRequestDispatcher("MoneyManger/EditMoney.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}

}
