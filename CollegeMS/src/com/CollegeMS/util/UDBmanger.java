package com.CollegeMS.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.CollegeMS.bean.ClassMessage;
import com.CollegeMS.bean.Money;
import com.CollegeMS.bean.Student;

public class UDBmanger {
	private String SQL1="";
	private String SQL2="";
	/**
	 * 学生登陆
	 * @param username
	 * @param password
	 * @return
	 */
	public Student login(String Sno, String password) {
        Student student = null;
        SQL1 = "select * from Student where Sno = ? and Psd = ?";
        Connection connection = null;
        PreparedStatement pstmt = null;  //与占位符连用
        try {
            connection = DBconnection.getConnection();
            pstmt = connection.prepareStatement(SQL1);
            //这里的意思将用户名和密码填到SQL语句的问号处   占位符
            pstmt.setString(1, Sno);
            pstmt.setString(2, password);
            ResultSet rSet = pstmt.executeQuery();//得到数据库的查询结果,一个数据集
            //判断结果集是否有效
            if (rSet.next()) {
                System.out.println("ok");
                student =new Student();
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
            DBconnection.closeConnection(connection);   //在finally模块中关闭数据库
        }
        return student;
    }
	/**
	 * 获取 金额
	 * @return
	 * @throws SQLException 
	 */

	public Money getMoney() {
		 Money money=null;
	        SQL2= "select * from money";
	        
	        Connection connection = null;
	        PreparedStatement pstmt = null;  //与占位符连用
	        try {
	            connection = DBconnection.getConnection();
	            
	            pstmt = connection.prepareStatement(SQL2);
	           
	            
	            ResultSet resultSet = pstmt.executeQuery();//得到数据库的查询结果,一个数据集
	            //判断结果集是否有效
	            if (resultSet.next()) {
	            	
	            	String mid = resultSet.getString("MID");
	            	System.out.println(mid);
	                int book = resultSet.getInt("Book");
	                int maexam = resultSet.getInt("Maexam");
	                int enexam = resultSet.getInt("Enexam");
	                int register = resultSet.getInt("Register");
	            /**
	             * 初始化对象
	             */
	                 money=new Money(mid,book,enexam,maexam,register);
	        
	            }              
	            connection.close();
	            pstmt.close();
	        } catch (Exception e) {
	            // TODO: handle exception
	            e.printStackTrace();
	        } finally {
	            DBconnection.closeConnection(connection);   //在finally模块中关闭数据库
	        }
	        return money;
	    }
	}
		
        
		