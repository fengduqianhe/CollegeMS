package com.College.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.CollegeMS.util.MBmanger;

public class DeleteBook extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		int bid=Integer.parseInt(req.getParameter("bid"));  //返回的object对象   进行转化
		MBmanger mBmanger=new MBmanger();
		/**
		 * 调用方法 执行删除语句
		 */
		mBmanger.deleteBook(bid);
		/**
		 * 转发  页面
		 */
		req.getRequestDispatcher("BookManger/DeletSuccess.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}
}
