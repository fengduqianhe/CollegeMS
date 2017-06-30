package com.College.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.CollegeMS.bean.Room;
import com.CollegeMS.bean.Score;
import com.CollegeMS.util.MBmanger;
import com.CollegeMS.util.SDBmanger;
/**
 * 显示分数表
 * @author me
 *
 */
public class ShowScore extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		     MBmanger mbmanger=new MBmanger();
	        /**
	         * 封装 List  传送到JSP
	         */
	        List<Score>score=mbmanger.getAllScore();
	        req.setAttribute("score",score);
	        System.out.println("keyi");
	        req.getRequestDispatcher("ScoreManger/ScoreMessage.jsp").forward(req,resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}

}
