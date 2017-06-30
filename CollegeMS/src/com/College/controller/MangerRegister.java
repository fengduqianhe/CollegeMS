package com.College.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.CollegeMS.util.DBManger;
/**
 * 管理员注册
 * @author me
 *
 */
public class MangerRegister extends HttpServlet {
	 /**
     * 获取要注册的数据
     *实现注册的判断
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        //获取jsp页面用户名和密码
        String username = request.getParameter("username");
        username=new String(username.getBytes("ISO-8859-1"),"UTF-8");
        System.out.println(username);
        
        String password = request.getParameter("password");
        
        password=new String(password.getBytes("ISO-8859-1"),"UTF-8");
        System.out.println(password);

        DBManger dBmanger = new DBManger();
        System.out.println(dBmanger.addManger(username, password));
        if(dBmanger.addManger(username, password)>0)
        {
        	request.getRequestDispatcher("RegisterSuccess.jsp").forward(request, response);;
        }
        else{
        	request.getRequestDispatcher("RegisterFailure.jsp").forward(request, response);;
        }
    }

    /**
     * 传送数据
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
