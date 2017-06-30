package com.College.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.CollegeMS.bean.Talent;
import com.CollegeMS.util.MBmanger;


/**
 * 显示人才信息
 * 
 * @author me
 *
 */
public class ShowTalent extends HttpServlet {
	 private static final long serialVersionUID=1L;
	    @Override
	    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	    }

	    @Override
	    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	        MBmanger dBmanger=new MBmanger();
	        List<Talent>talent=dBmanger.getAllTalent();
	        req.setAttribute("talent",talent);
	        System.out.println("keyi");
	        req.getRequestDispatcher("TalentManger/TalentMessage.jsp").forward(req,resp);
	    }
}
