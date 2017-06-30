package com.College.process;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 实现学生登录后对自己 手机号码的修改
 * 
 * @author me
 * 
 */
public class StudentEditPhone extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String Phone = req.getParameter("phone");
		String Sno=req.getParameter("sno");
		req.setAttribute("Phone", Phone);
		req.setAttribute("sno", Sno);
		req.getRequestDispatcher("Users/EditPhone.jsp").forward(req,
				resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}

}
