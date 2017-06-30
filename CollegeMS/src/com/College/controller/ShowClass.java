package com.College.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.CollegeMS.util.DBManger;
import com.CollegeMS.bean.ClassMessage;

/**
 * 显示班级信息
 * 
 * @author me
 *
 */
public class ShowClass extends HttpServlet {
	 private static final long serialVersionUID=1L;
	    @Override
	    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	    }

	    @Override
	    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	        DBManger dBmanger=new DBManger();
	        List<ClassMessage>classMessage=dBmanger.getAllClass();
	        req.setAttribute("classMessage",classMessage);
	        req.getRequestDispatcher("RecruitManger/Recruit.jsp").forward(req,resp);
	    }
}
