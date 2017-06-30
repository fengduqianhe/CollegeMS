package com.College.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.CollegeMS.util.DBManger;
/**
 * 实现数据的更新
 * @author me
 *
 */
public class UpdateClass extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		/**
		 * 接受表单传来的数据
		 */
		     String cid = req.getParameter("cid");
		     String college = req.getParameter("college");
		     String  major = req.getParameter("major");
	         System.out.println(cid);
	         DBManger dBmanger=new DBManger();
	         dBmanger.updateclass(cid, college, major);
	         req.getRequestDispatcher("RecruitManger/UpdateSuccess.jsp").forward(req,resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
	}

}
