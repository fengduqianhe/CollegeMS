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
 * 将学生的信息写入 离校登记表
 * @author me
 *
 */
public class StudentLeaving  extends HttpServlet{
	private String SQL1="";

	/**
	 * 将数据写入离校登记表表
	 * @param Sno
	 * @param Sname
	 * @param Scollege
	 * @param Smajor
	 * @return
	 */
	public int addLeaving(String Sno,String Sname,String Scollege,String Smajor) {
        int num = 0;
        SQL1 = "insert into leaving(Lsno,Lname,Lcollege,Lmajor)values(?,?,?,?)";
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        //Statement stmt=connection.createStatement();   //用于保存查询结果的变量声明与定义
        connection = DBconnection.getConnection();
        try {
            preparedStatement = connection.prepareStatement(SQL1);

            preparedStatement.setString(1, Sno);

            preparedStatement.setString(2, Sname);
            
            preparedStatement.setString(3, Scollege);
            
            preparedStatement.setString(4, Smajor);

            //num=preparedStatement.executeUpdate(SQL1);
            num = preparedStatement.executeUpdate();
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
        return num;
    }
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String Sno=req.getParameter("sno");
		String Sname=req.getParameter("sname");
		String Scollege=req.getParameter("scollege");
		String Smajor=req.getParameter("smajor");
		int num=addLeaving(Sno, Sname, Scollege, Smajor);
		if(num>0){
			req.getRequestDispatcher("Users/Leaving.jsp").forward(req, resp);
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}
	
}
