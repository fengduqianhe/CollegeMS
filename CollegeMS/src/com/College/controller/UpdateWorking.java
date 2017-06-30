package com.College.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.CollegeMS.util.DBManger;
import com.CollegeMS.util.MBmanger;

/**
 * 更新岗位
 * @author me
 *
 */
public class UpdateWorking extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		/**
		 * 接受表单传来的数据
		 */
		int id = Integer.parseInt(req.getParameter("id"));
		String major = req.getParameter("job");
		String place = req.getParameter("place");
	    int  salery = Integer.parseInt(req.getParameter("salery"));
		MBmanger  mBmanger=new MBmanger();
	    mBmanger.updateWorking(id, major, place, salery);
	    req.getRequestDispatcher("WorkingManger/EditSuccess.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}

}
