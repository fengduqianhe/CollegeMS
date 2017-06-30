package com.College.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.CollegeMS.bean.Friend;
import com.CollegeMS.bean.Money;
import com.CollegeMS.util.FBManger;
import com.CollegeMS.util.SDBmanger;

/**
 * 校友信息显示
 * @author me
 *
 */
public class ShowFriend extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		FBManger fbManger=new FBManger();
		List<Friend> friend = fbManger.getAllFriend();
		req.setAttribute("friend", friend);
		req.getRequestDispatcher("FriendManger/FriendMessage.jsp").forward(req,
				resp);

		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}

}
