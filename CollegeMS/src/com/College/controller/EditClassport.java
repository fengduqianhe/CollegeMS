package com.College.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * 修改操作
 * 跳转
 * @author me
 *
 */
public class EditClassport extends HttpServlet {
	
	@Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	req.setCharacterEncoding("UTF-8");
    	resp.setContentType("text/html;charset=UTF-8");
    	/**
    	 * 接受URL传值的参数
    	 */
        String college=req.getParameter("college");
       // String College=new String(college.getBytes("UTF-8"),"ISO8859-1");
        System.out.println(	college);
        String major=req.getParameter("numclass");
       // String Major=new String(major.getBytes("UTF-8"),"ISO8859-1");
        System.out.println(major);
        String cid=req.getParameter("cid");
      //   String CID=new String(cid.getBytes("UTF-8"),"ISO8859-1");
        System.out.println(cid);
        /**
         * 传输数据
         */
        req.setAttribute("college",college);
        req.setAttribute("cid",cid);
        req.setAttribute("major",major);
        req.getRequestDispatcher("RecruitManger/EditClass.jsp").forward(req,resp);
    }
}
