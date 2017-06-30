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
 * 将离校登记表中的人
 * 写入校友表中
 */
public class AdmitFriend extends HttpServlet{
	private String SQL1="";	
	private String SQL2="";	
	/**
	 * 进行x校友表的插入
	 */
	public void addFriend(String name,String Sno,String College,String Major) {
		
        SQL1 = "insert into friend(Name,Fno,College,Major) values(?,?,?,?)";
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        //Statement stmt=connection.createStatement();   //用于保存查询结果的变量声明与定义
        connection = DBconnection.getConnection();
        try {
            preparedStatement = connection.prepareStatement(SQL1);

            preparedStatement.setString(1, name);

            preparedStatement.setString(2, Sno);
            
            preparedStatement.setString(3, College);
            
            preparedStatement.setString(4, Major);

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
	
	
	/**
	 * 原离校表的删除
	 */
	public void deleteLeaving(int id) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        SQL2 = "DELETE FROM leaving WHERE LID=?";
        connection = DBconnection.getConnection();
        try {
            preparedStatement = connection.prepareStatement(SQL2);

            preparedStatement.setInt(1,id);
            preparedStatement.executeUpdate();
            System.out.println("删除SQL语句已执行");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            try{
                if(connection!=null){
                    connection.close();
                }
            }
            catch (SQLException e){
                e.printStackTrace();
            }
            try{
                if(preparedStatement!=null){
                    preparedStatement.close();
                }
            }
            catch (SQLException e){
                e.printStackTrace();
            }
        }
    }
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		int id=Integer.parseInt(req.getParameter("lid"));
		String Sno=req.getParameter("sno");
		String name=req.getParameter("name");
		String college=req.getParameter("college");
		String major=req.getParameter("major");
		addFriend(name, Sno, college, major);
		deleteLeaving(id);
		req.getRequestDispatcher("LeavStudentManger/LeavSuccess.jsp").forward(req,resp);
			
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}
	

}
