package com.College.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.CollegeMS.bean.Money;
import com.CollegeMS.bean.NewStudent;
import com.CollegeMS.util.SDBmanger;

/**
 * 显示报考新生表
 * @author me
 *
 */
public class ShowNewStudent extends HttpServlet{
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		SDBmanger sdbmanger = new SDBmanger();
		List<NewStudent> newstudent =sdbmanger.getAllNewStudent();
		req.setAttribute("newstudent", newstudent);
		req.getRequestDispatcher("NewStudentManger/NewStudentMessage.jsp").forward(req,
				resp);
	}


}
