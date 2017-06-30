package com.College.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.CollegeMS.util.SDBmanger;

/**
 * 更新财务信息
 * @author me
 *
 */
public class UpdateMoney extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String id=req.getParameter("id");
		int book=Integer.parseInt(req.getParameter("book"));
		int en=Integer.parseInt(req.getParameter("en"));
		int ma=Integer.parseInt(req.getParameter("ma"));
		int register=Integer.parseInt(req.getParameter("register"));
		SDBmanger sdBmanger=new SDBmanger();
		sdBmanger.updateMoney(id, book, en, ma, register);
		req.getRequestDispatcher("MoneyManger/UpdateSuccess.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}
	
}
