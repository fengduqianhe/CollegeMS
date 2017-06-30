package com.College.buy;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.CollegeMS.bean.Money;
import com.CollegeMS.util.UDBmanger;

public class JumpExam extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String Sno=req.getParameter("sno");
		UDBmanger udBmanger=new UDBmanger();
		Money money=udBmanger.getMoney();
		int macost=money.getMaExam();
		int encost=money.getEnexam();
		req.setAttribute("macost",macost);
		req.setAttribute("encost",encost);
		req.setAttribute("sno",Sno);
		req.getRequestDispatcher("Users/ExamCost.jsp").forward(req,resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}
}
