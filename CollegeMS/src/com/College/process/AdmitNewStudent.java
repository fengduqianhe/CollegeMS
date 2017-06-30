package com.College.process;

import static java.lang.System.out;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.CollegeMS.bean.ClassMessage;
import com.CollegeMS.bean.NewStudent;
import com.CollegeMS.util.DBconnection;

/**
 * 根据报考学生报考的学院
 * 专业 生成学号
 * 将该学生从新生表中删除，并将其写入新表
 * @author me
 *
 */
public class AdmitNewStudent extends HttpServlet {
	
	/**
	 * 直接进行数据库操作
	 * 查找数据
	 */
	private String SQL1="";
	private String SQL2="";
	private String SQL3="";
	private String SQL4="";
	private String SQL5="";
	private String SQL6="";
	private String SQL7="";
	private NewStudent newstudent=null;
	/**
	 * 从新生数据表中获取  学院专业信息
	 * @param NID
	 * @return
	 */
	 public NewStudent getMessage(String NID) {
	        NewStudent student = null;
	        SQL1 = "select * from NewStudent where NID = ?";
	        Connection connection = null;
	        PreparedStatement pstmt = null;  //与占位符连用
	        try {
	            connection = DBconnection.getConnection();
	            pstmt = connection.prepareStatement(SQL1);
	            //这里的意思将用户名和密码填到SQL语句的问号处   占位符
	            pstmt.setString(1, NID);
	            ResultSet resultSet = pstmt.executeQuery();//得到数据库的查询结果,一个数据集
	            //判断结果集是否有效
	            if (resultSet.next()) {
	                String id = resultSet.getString("NID");
	                
	                String name = resultSet.getString("NName");
	                
	                String sex = resultSet.getString("NSex");
	               
	                String time = resultSet.getString("NTime");
	                
	                String phone = resultSet.getString("NPhone");
	                
	                String college = resultSet.getString("NCollege");
	              
	                String major = resultSet.getString("NMajor");
	               
	                int score = resultSet.getInt("NScore");
	                
	                int nclass = resultSet.getInt("NClass");
	           
	               	      
	                /**
	                 * 初始化财务对象
	                 */
	                 newstudent=new NewStudent(id,name,sex,time,phone,college,major,nclass,score);
	            }              
	            connection.close();
	            pstmt.close();
	        } catch (Exception e) {
	            // TODO: handle exception
	            e.printStackTrace();
	        } finally {
	            DBconnection.closeConnection(connection);   //在finally模块中关闭数据库
	        }
	        return newstudent;
	    }
	 /**
	  * 根据学院专业  去匹配学院专业表
	  * 获取学院号  专业号   班级号 
	  * @param NID
	  * @return
	  */
	 public ClassMessage getNumber(String College,String Major,int Numclass) {
	        
		 ClassMessage classmessage=null;
	        SQL4= "select * from Class where college = ? AND Major=? AND Numclass=?";
	        
	        Connection connection = null;
	        PreparedStatement pstmt = null;  //与占位符连用
	        try {
	            connection = DBconnection.getConnection();
	            
	            pstmt = connection.prepareStatement(SQL4);
	            //这里的意思将用户名和密码填到SQL语句的问号处   占位符
	            pstmt.setString(1, College);
	            
	            pstmt.setString(2, Major);
	            
	            pstmt.setInt(3, Numclass);
	            
	            ResultSet resultSet = pstmt.executeQuery();//得到数据库的查询结果,一个数据集
	            //判断结果集是否有效
	            if (resultSet.next()) {
	            	
	            	int cid = resultSet.getInt("CID");
	                String college = resultSet.getString("College");
	                String major = resultSet.getString("Major");
	                String message = resultSet.getString("Message");
	                int number = resultSet.getInt("Number");
	                int numcollege = resultSet.getInt("Numcollege");
	                int nummajor = resultSet.getInt("Nummajor");
	                int numclass = resultSet.getInt("Numclass");
	                int numpeople= resultSet.getInt("Numpeople");
	            /**
	             * 初始化对象
	             */
	                 classmessage=new ClassMessage(cid,college,major,message,number,
	                		numcollege,nummajor,numclass,numpeople);
	        
	            }              
	            connection.close();
	            pstmt.close();
	        } catch (Exception e) {
	            // TODO: handle exception
	            e.printStackTrace();
	        } finally {
	            DBconnection.closeConnection(connection);   //在finally模块中关闭数据库
	        }
	        return classmessage;
	    }
	 
	 /**
	  * 向学生表中添加  信息  
	  * 信息来源  生成的学号
	  * 指定的密码
	  * 从新生表中获取的各数据
	  * @param username
	  * @param password
	  * @return
	  */
	 public int addStudent(String Sno,String psd,String name,String Sex,int Sclass,String Stime,String College,String Major,int card,String Phone) {
	        int num = 0;
	        SQL2 = "insert into Student(Sno,Psd,Name,Sex,Sclass,Stime,College,Major,Card,Phone) values(?,?,?,?,?,?,?,?,?,?)";
	        Connection connection = null;
	        PreparedStatement preparedStatement = null;
	        connection = DBconnection.getConnection();
	        try {
	            preparedStatement = connection.prepareStatement(SQL2);

	            preparedStatement.setString(1, Sno);

	            preparedStatement.setString(2, psd);
	            
	            preparedStatement.setString(3, name);
	            
	            preparedStatement.setString(4, Sex);
	            
	            preparedStatement.setInt(5,Sclass);
	            
	            preparedStatement.setString(6, Stime);
	            
	            preparedStatement.setString(7, College);
	            
	            preparedStatement.setString(8, Major);
	            
	            preparedStatement.setInt(9, card);
	            
	            preparedStatement.setString(10, Phone);
	            
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
	 
	 /**
	  * 删除新生信息
	  * 
	  */
	 
	 public void deleteNewStudent(int id) {
	        Connection connection = null;
	        PreparedStatement preparedStatement = null;
	        SQL5 = "DELETE FROM newstudent WHERE NID=?";
	        connection = DBconnection.getConnection();
	        try {
	            preparedStatement = connection.prepareStatement(SQL5);

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
	 
	 /**
	  * 插入学生宿舍表
	  */
	 public void addStudentRoom(String Sno) {
	        Connection connection = null;
	        PreparedStatement preparedStatement = null;
	        SQL6 = "INSERT INTO studentroom (Sno) VALUES(?)";
	        connection = DBconnection.getConnection();
	        try {
	            preparedStatement = connection.prepareStatement(SQL6);

	            //preparedStatement.setInt(1,CID);
	            preparedStatement.setString(1,Sno);
	            
	             preparedStatement.executeUpdate();
	            System.out.println("添加SQL语句已执行");
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
	 
	 /**
	  * 更新人数
	  * @param College
	  * @param Major
	  * @param Numclass
	  * @return
	  */
	 public void updateNumber(String College,String Major,int Numclass,int people) {
	        
	        SQL7= "Update Class set numpeople=? where college = ? AND Major=? AND Numclass=?";
	        
	        Connection connection = null;
	        PreparedStatement pstmt = null;  //与占位符连用
	        try {
	            connection = DBconnection.getConnection();
	            
	            pstmt = connection.prepareStatement(SQL7);
	            //这里的意思将用户名和密码填到SQL语句的问号处   占位符
	            pstmt.setInt(1, people);
	            
	            pstmt.setString(2, College);
	            
	            pstmt.setString(3, Major);
	            
	            pstmt.setInt(4, Numclass);
	            
	            pstmt.executeUpdate();//得到数据库的查询结果,一个数据集
	            System.out.println("人数加一");    
	            connection.close();
	            pstmt.close();
	        } catch (Exception e) {
	            // TODO: handle exception
	            e.printStackTrace();
	        } finally {
	            DBconnection.closeConnection(connection);   //在finally模块中关闭数据库
	        }
	    }
	 
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		String nid=req.getParameter("nid");
		
		NewStudent newstudent=getMessage(nid);
		String name=this.newstudent.getNName();
		String Sex=this.newstudent.getNsex();
		String Time=this.newstudent.getNTime();
		/**
		 * 默认密码 123
		 */
		String psd="123";
		int card=0;
		String College=this.newstudent.getNCollege();
		String Major=this.newstudent.getNMajor();
		int Sclass=this.newstudent.getNClass();
		String Phone=this.newstudent.getNPhone();
		
		System.out.println(College);
		System.out.println(Major);
		System.out.println(Sclass);
		
		ClassMessage classmessage=getNumber(College, Major,Sclass);
		
		System.out.println(classmessage.getNumcollege());
		System.out.println(classmessage.getNumajor());
		System.out.println(classmessage.getNumclass());
		System.out.println(classmessage.getNumpeople());
		
		String Sno=("2017"+classmessage.getNumcollege()+classmessage.getNumajor()+classmessage.getNumclass()+classmessage.getNumpeople());
		
		System.out.println("学号"+Sno);
		
		deleteNewStudent(Integer.parseInt(nid));
		
		int num=addStudent(Sno, psd, name, Sex, Sclass, Time, College, Major, card, Phone);
		
		updateNumber(College, Major, Sclass, classmessage.getNumpeople()+1);
		addStudentRoom(Sno);
		if(num>0){
			System.out.println("ok");
	       req.getRequestDispatcher("NewStudentManger/AdmitSuccess.jsp").forward(req,resp);
		}
	
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}
}
