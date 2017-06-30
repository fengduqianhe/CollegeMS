package com.College.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.CollegeMS.bean.Manger;
import com.CollegeMS.bean.Student;
import com.CollegeMS.util.DBManger;
import com.CollegeMS.util.UDBmanger;

/**
 * 学生登录操作
 * 
 * @author me
 * 
 */
public class StudentLogin extends HttpServlet {
	/**
	 * 获取数据
	 * 
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// response.setCharacterEncoding("GBK");
		// 获取jsp页面用户名和密码
		String Sno = request.getParameter("Sno");
		System.out.println(Sno);

		String password = request.getParameter("password");
		System.out.println(password);
		// 获取UserDao实例
		UDBmanger udbmanger = new UDBmanger();

		Student student = udbmanger.login(Sno, password);
		// 判断user是否为空
		if (student != null) {
			// 转发到LoginSuccess.jsp页面
			request.setAttribute("message", "登陆成功！");
			request.setAttribute("student", student);
			// getRequestDispatcher()是请求转发
			request.getRequestDispatcher("Users/CollegeIndex.jsp").forward(request,
					response);
		} else {
			// 登录失败
			request.setAttribute("message", "登陆失败！");
			request.getRequestDispatcher("Failure.jsp").forward(request,
					response);
		}
	}

	/**
	 * 传送数据
	 * 
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}
