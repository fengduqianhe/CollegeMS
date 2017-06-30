package com.College.controller;

import java.io.IOException;
/**
 * 显示奖学金信息
 */
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.CollegeMS.bean.Money;
import com.CollegeMS.bean.Reward;
import com.CollegeMS.util.MBmanger;
import com.CollegeMS.util.SDBmanger;


/**
 * 显示奖学金信息
 * @author me
 *
 */
public class ShowReward extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		MBmanger dbmanger = new MBmanger();
		List<Reward> reward = dbmanger.getAllReward();
		req.setAttribute("reward", reward);
		req.getRequestDispatcher("RewardManger/RewardMessage.jsp").forward(req,
				resp);
	
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}

}
