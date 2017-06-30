package com.College.process;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class StudentEditPsd extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String Psd = req.getParameter("psd");
		String Sno = req.getParameter("sno");
		req.setAttribute("psd", Psd);
		req.setAttribute("sno", Sno);
		System.out.println(Psd);
		req.getRequestDispatcher("Users/EditPasswords.jsp").forward(req,
				resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}
	
}
