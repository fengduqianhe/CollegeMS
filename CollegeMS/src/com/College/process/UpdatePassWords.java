package com.College.process;

import static java.lang.System.out;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.CollegeMS.util.DBconnection;

/**
 * 修改密码
 * @author me
 *
 */
public class UpdatePassWords extends HttpServlet {
	private String SQL1="";
    
	/**
	 * 插入学生表
	 */
public void updatePsd(String Psd,String Sno) {
		
        SQL1 = "update student set Psd=? where Sno=?";
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        //Statement stmt=connection.createStatement();   //用于保存查询结果的变量声明与定义
        connection = DBconnection.getConnection();
        try {
            preparedStatement = connection.prepareStatement(SQL1);

            preparedStatement.setString(1, Psd);

            preparedStatement.setString(2, Sno);

            preparedStatement.executeUpdate();
            out.println("sql语句已执行");

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String psd=req.getParameter("psd");
		String sno=req.getParameter("sno");
		updatePsd(psd, sno);
		req.getRequestDispatcher("Users/EditScuess.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}
	

}
