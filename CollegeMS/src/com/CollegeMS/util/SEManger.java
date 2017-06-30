package com.CollegeMS.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.CollegeMS.bean.Book;
import com.CollegeMS.bean.NewStudent;
import com.CollegeMS.bean.Student;



/**
 * 搜索操作
 * @author me
 *
 */
public class SEManger {
	
	private String SQL1;
	private String SQL2;
	private String SQL3;
	  /**
     * 新生信息  模糊搜索
     * @return
     */
    public List<NewStudent> getPartNewStudent(String sname) {
        List<NewStudent> lnewstudent = new ArrayList<>();
        SQL1 = "SELECT * FROM NewStudent WHERE NName LIKE ?";
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        connection = DBconnection.getConnection();
        
        try {
            preparedStatement = connection.prepareStatement(SQL1);
            //这里的意思将用户名填到SQL语句的问号处   进行模糊查询
            preparedStatement.setString(1, sname);
            
            resultSet = preparedStatement.executeQuery();  //得到数据结果集
            while (resultSet.next()) {
                /**
                 * 获取数据  写入List
                 */
                String id = resultSet.getString("NID");
                System.out.println(id);
                String name = resultSet.getString("NName");
                System.out.println(name);
                String sex = resultSet.getString("NSex");
                System.out.println(name);
                String time = resultSet.getString("NTime");
                System.out.println(name);
                String phone = resultSet.getString("NPhone");
                System.out.println(name);
                String college = resultSet.getString("NCollege");
                System.out.println(name);
                String major = resultSet.getString("NMajor");
                System.out.println(name);
                int score = resultSet.getInt("NScore");
                System.out.println(name);
                int nclass = resultSet.getInt("NClass");
                /**
                 * 初始化财务对象
                 */
                NewStudent newstudent=new NewStudent(id,name,sex,time,phone,college,major,nclass,score);
                lnewstudent.add(newstudent);
            }
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
                if (resultSet != null) {
                    resultSet.close();
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
        return lnewstudent;
    }
    
    /**
     * 学生管理模糊搜索
     * @param Sno
     * @param Sname
     * @return
     */
    
    public List<Student> getPartStudent(String Sno,String Sname) {
        List<Student> lstudent = new ArrayList<>();
        SQL2 = "SELECT * FROM Student WHERE Sno LIKE ? AND Name LIKE ?";
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        connection = DBconnection.getConnection();
        
        try {
            preparedStatement = connection.prepareStatement(SQL2);
            //这里的意思将用户名填到SQL语句的问号处   进行模糊查询
            preparedStatement.setString(1, Sno);
            
            preparedStatement.setString(2, Sname);
            
            resultSet = preparedStatement.executeQuery();  //得到数据结果集
            while (resultSet.next()) {
                /**
                 * 获取数据  写入List
                 */
                String sno = resultSet.getString("Sno");
                String Name = resultSet.getString("Name");
                String Passwords = resultSet.getString("Psd");
                String College = resultSet.getString("College");
                String Sclass = resultSet.getString("Sclass");
                String Major = resultSet.getString("Major");
                String Sex = resultSet.getString("Sex");
                String Stime = resultSet.getString("Stime");
                int Card = resultSet.getInt("Card");
                String Phone=resultSet.getString("Phone");
                Student student=new Student(sno,Passwords,Name,Sex,College,Major,Stime,Sclass,Card,Phone);
                /**
                 * 初始化财务对象
                 */
                lstudent.add(student);
            }
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
                if (resultSet != null) {
                    resultSet.close();
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
        return lstudent;
    }
    /**
     * 模糊搜索  教材
     * @param major
     * @param name
     * @param message
     * @return
     */
      
    public List<Book> getPartBook(String major,String name,String message) {
        List<Book> lbook = new ArrayList<>();
        SQL3 = "SELECT * FROM Book WHERE major LIKE ? AND name LIKE ? AND message LIKE ?" ;
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        connection = DBconnection.getConnection();
        
        try {
            preparedStatement = connection.prepareStatement(SQL3);
            //这里的意思将用户名填到SQL语句的问号处   进行模糊查询
            preparedStatement.setString(1, major);
            
            preparedStatement.setString(2, name);
            
            preparedStatement.setString(3, message);
            
            
            resultSet = preparedStatement.executeQuery();  //得到数据结果集
            while (resultSet.next()) {
                /**
                 * 获取数据  写入List
                 */
                int id = resultSet.getInt("BID");
                String smajor = resultSet.getString("major");
                String sname= resultSet.getString("name");
                String smessage = resultSet.getString("message");
                int cost = resultSet.getInt("cost");
                /**
                 * 初始化教材对象
                 */
                Book book=new Book(id,smajor,sname,cost,message);
                lbook.add(book);
               
            }
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
                if (resultSet != null) {
                    resultSet.close();
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
        return lbook;
    }
}
