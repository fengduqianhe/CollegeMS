package com.College.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.CollegeMS.util.DBManger;
/**
 * 班级信息的删除
 * @author me
 *
 */
public class DeletClass extends HttpServlet {
	 private static final long serialVersionUID=1L;
	    @Override
	    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	    }

	    @Override
	    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	        String cid=req.getParameter("cid");
	        System.out.println(cid);

	        DBManger dBmanger=new DBManger();
	        dBmanger.deleteClass(cid);
	        

	        req.getRequestDispatcher("RecruitManger/DeleteSuccess.jsp").forward(req,resp);
	    }

}
