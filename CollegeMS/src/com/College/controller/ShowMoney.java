package com.College.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.*;
import javax.servlet.http.*;

import com.CollegeMS.bean.ClassMessage;
import com.CollegeMS.bean.Money;
import com.CollegeMS.util.DBManger;
import com.CollegeMS.util.SDBmanger;

/**
 * 显示财务信息
 * @author me
 *
 */
public class ShowMoney extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		SDBmanger dbmanger = new SDBmanger();
		List<Money> money = dbmanger.getAllMoney();
		req.setAttribute("money", money);
		req.getRequestDispatcher("MoneyManger/MoneyMessage.jsp").forward(req,
				resp);
	}

}
