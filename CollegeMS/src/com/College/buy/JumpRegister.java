package com.College.buy;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.CollegeMS.bean.ClassMessage;
import com.CollegeMS.bean.Money;
import com.CollegeMS.util.DBconnection;
import com.CollegeMS.util.UDBmanger;

/**
 * 根据学生点击
 * 获取所需费用
 * 
 * @author me
 *
 */
public class JumpRegister extends HttpServlet {
	
	
	 

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String Sno=req.getParameter("Sno");
		UDBmanger udBmanger=new UDBmanger();
		Money money=udBmanger.getMoney();
		int cost=money.getRegister();
		req.setAttribute("cost",cost);
		req.setAttribute("Sno",Sno);
		req.getRequestDispatcher("Users/RegisterCost.jsp").forward(req,resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}

}
