package com.College.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.CollegeMS.util.DBManger;
/**
 * 更新招生信息
 * @author me
 *
 */
public class UpdateNotice extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String id=req.getParameter("id");
		String Notice=req.getParameter("notice");
		String Noticetime=req.getParameter("noticetime");
	    DBManger dbManger=new DBManger();
	    dbManger.updateNotice(id, Notice, Noticetime);
		req.getRequestDispatcher("RecruitManger/UpdateSuccess.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}
	
}
