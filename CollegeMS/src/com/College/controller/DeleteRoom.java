package com.College.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.CollegeMS.util.SDBmanger;

public class DeleteRoom extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
	    int id=Integer.parseInt(req.getParameter("id"));
        System.out.println(id);

        SDBmanger sdbmanger=new SDBmanger();
        sdbmanger.deleteDorm(id);

        req.getRequestDispatcher("RoomManger/DeletSuccess").forward(req,resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

	}

}
