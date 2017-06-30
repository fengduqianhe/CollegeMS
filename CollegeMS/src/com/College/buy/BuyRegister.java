package com.College.buy;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.CollegeMS.bean.Student;
import com.CollegeMS.util.DBconnection;

public class BuyRegister extends HttpServlet {
	private String SQL1 = "";
	private String SQL2 = "";

	/**
	 * 根据学号 去查找 学生的一卡通余额 返回余额
	 */
	public Student GetCard(String Sno) {
		Student student = null;
		SQL1 = "select * from Student where Sno = ?";
		Connection connection = null;
		PreparedStatement pstmt = null; // 与占位符连用
		try {
			connection = DBconnection.getConnection();
			pstmt = connection.prepareStatement(SQL1);
			// 这里的意思将用户名和密码填到SQL语句的问号处 占位符
			pstmt.setString(1, Sno);
			ResultSet rSet = pstmt.executeQuery();// 得到数据库的查询结果,一个数据集
			// 判断结果集是否有效
			if (rSet.next()) {
				student = new Student();
				student.setSno(rSet.getString("Sno"));
				student.setName(rSet.getString("Name"));
				student.setPasswords(rSet.getString("Psd"));
				student.setSex(rSet.getString("Sex"));
				student.setCollege(rSet.getString("College"));
				student.setStime(rSet.getString("Stime"));
				student.setMajor(rSet.getString("Major"));
				student.setSClass(rSet.getString("Sclass"));
				student.setCard(rSet.getInt("Card"));
				student.setSphone(rSet.getString("Phone"));
			}
			connection.close();
			pstmt.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			DBconnection.closeConnection(connection); // 在finally模块中关闭数据库
		}
		return student;
	}

	/**
	 * 根据学生一卡通余额 与相应费用相减 将余额写入学生表
	 * 
	 */
	public int UpdateCard(String Sno, int card) {
		int num = 0;
		Student student = null;
		SQL2 = "update Student set Card=? where Sno = ?";
		Connection connection = null;
		PreparedStatement pstmt = null; // 与占位符连用
		try {
			connection = DBconnection.getConnection();
			pstmt = connection.prepareStatement(SQL2);
			// 这里的意思将用户名和密码填到SQL语句的问号处 占位符
			pstmt.setInt(1, card);
			pstmt.setString(2, Sno);
			num = pstmt.executeUpdate();// 得到数据库的查询结果,一个数据集
			System.out.println("计算已经执行");
			connection.close();
			pstmt.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			DBconnection.closeConnection(connection); // 在finally模块中关闭数据库
		}
		return num;
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String Sno=req.getParameter("sno");
		String Cost=req.getParameter("cost");
		int cost=Integer.parseInt(Cost);
		System.out.println(cost);
		Student student=GetCard(Sno);
		int card=student.getCard();
		if(card-cost>0){
			System.out.println(card-cost);
			int num=UpdateCard(Sno, card-cost);
			if(num>0){
				req.getRequestDispatcher("Users/CostScuess.jsp").forward(req, resp);
			}
		}
		else{
			req.getRequestDispatcher("Users/BuyFailure.jsp").forward(req, resp);
		}
	
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}

}
