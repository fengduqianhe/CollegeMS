package com.College.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.CollegeMS.bean.Manger;
import com.CollegeMS.util.DBManger;
/**
 *  管理员登录操作
 * @author me
 *
 */
public class LoginServlet  extends HttpServlet {
	  /**
     * 获取数据
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       // response.setCharacterEncoding("GBK");
        //获取jsp页面用户名和密码
        String username = request.getParameter("username");
    
        /**
         * 修改乱码操作
         */
        username=new String(username.getBytes("ISO-8859-1"),"UTF-8");
        System.out.println(username);
        String password = request.getParameter("password");
        System.out.println(password);
        //获取UserDao实例
        DBManger dBmanger= new DBManger();

        Manger manger = dBmanger.login(username,password);
        // 判断user是否为空
        if(manger != null){
        	request.setAttribute("username", username);
            request.getRequestDispatcher("MangerIndex.jsp").forward(request, response);
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