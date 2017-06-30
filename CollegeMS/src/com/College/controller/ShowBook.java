package com.College.controller;

import java.io.IOException;
import java.util.List;

import javax.management.MBeanAttributeInfo;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.CollegeMS.bean.Book;
import com.CollegeMS.bean.ClassMessage;
import com.CollegeMS.util.MBmanger;
/**
 * 显示教材信息表
 * @author user
 *
 */
public class ShowBook extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		MBmanger mBmanger=new MBmanger();
		 List<Book>book=mBmanger.getAllBook();
		 /**
		  * 发送List对象到 指定的jsp页面
		  */
	        req.setAttribute("book",book);
	        req.getRequestDispatcher("BookManger/BookMessage.jsp").forward(req,resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}
}
