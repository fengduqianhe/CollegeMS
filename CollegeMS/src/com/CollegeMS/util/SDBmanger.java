package com.CollegeMS.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.CollegeMS.bean.ClassMessage;
import com.CollegeMS.bean.Money;
import com.CollegeMS.bean.NewStudent;
import com.CollegeMS.bean.Room;
import com.CollegeMS.bean.Student;
/**
 * 学生管理  宿舍管理  财务管理   新生入学管理  
 * @author me
 *
 */
public class SDBmanger {
	private String SQL1="";
	private String SQL2="";
	private String SQL3="";
	private String SQL4="";
	private String SQL5="";
	private String SQL6="";
	private String SQL7="";
	private String SQL8="";
	/**
	 * 显示学生信息
	 * @return
	 */
	 public List<Student> getAll() {
	        List<Student> lstudent = new ArrayList<>();
	        SQL1 = "SELECT * FROM Student";
	        Connection connection = null;
	        PreparedStatement preparedStatement = null;
	        ResultSet resultSet = null;

	        connection = DBconnection.getConnection();
	        try {
	            preparedStatement = connection.prepareStatement(SQL1);
	            resultSet = preparedStatement.executeQuery();  //得到数据结果集
	            while (resultSet.next()) {
	                /**
	                 * 获取数据  写入List
	                 */
	                String Sno = resultSet.getString("Sno");
	                String Name = resultSet.getString("Name");
	                String Passwords = resultSet.getString("Psd");
	                String College = resultSet.getString("College");
	                String Sclass = resultSet.getString("Sclass");
	                String Major = resultSet.getString("Major");
	                String Sex = resultSet.getString("Sex");
	                String Stime = resultSet.getString("Stime");
	                int Card = resultSet.getInt("Card");
	                String Phone=resultSet.getString("Phone");
	                Student student=new Student(Sno, Passwords, Name, Sex, Stime, College, Major, Sclass, Card, Phone);
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
	     * 学生信息的删除
	     *
	     * @return
	     */
	    public void deleteStudent(String Sno) {
	        Connection connection = null;
	        PreparedStatement preparedStatement = null;
	        SQL2 = "DELETE FROM Student WHERE Sno=?";
	        connection = DBconnection.getConnection();
	        try {
	            preparedStatement = connection.prepareStatement(SQL2);

	            preparedStatement.setString(1,Sno);
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
	     * 更新学生信息
	     * @param Sno
	     * @param College
	     * @param Major
	     */
	    public void upDateStudent(String Sno,String College,String Major) {
	        Connection connection = null;
	        PreparedStatement preparedStatement = null;
	        SQL7 = "UPDATE Student set College=?, Major=? WHERE Sno=?";
	        connection = DBconnection.getConnection();
	        try {
	            preparedStatement = connection.prepareStatement(SQL7);

	            preparedStatement.setString(1,College);
	            preparedStatement.setString(2,Major);
	            preparedStatement.setString(3,Sno);
	            preparedStatement.executeUpdate();
	            System.out.println("更新SQL语句已执行");
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
	     * 宿舍楼  宿舍号的显示
	     * @return
	     */
	    public List<Room> getAllroom() {
	        List<Room> lroom = new ArrayList<>();
	        SQL3 = "SELECT * FROM Room";
	        Connection connection = null;
	        PreparedStatement preparedStatement = null;
	        ResultSet resultSet = null;

	        connection = DBconnection.getConnection();
	        try {
	            preparedStatement = connection.prepareStatement(SQL3);
	            resultSet = preparedStatement.executeQuery();  //得到数据结果集
	            while (resultSet.next()) {
	                /**
	                 * 获取数据  写入List
	                 */
	                int id = resultSet.getInt("ID");
	                System.out.println(id);
	                String Floor = resultSet.getString("Floor");
	                System.out.println(Floor);
	                String Dorm= resultSet.getString("Dorm");
	                String DormNum = resultSet.getString("DormNum");
	      
	                /**
	                 * 初始化教材对象
	                 */
	                Room room=new Room(id, Floor, Dorm, DormNum);
	                lroom.add(room);
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
	        return lroom;
	    }
	    
	   
	    /**
	     * 删除宿舍信息
	     * @param Sno
	     */
	    public void deleteDorm(int id) {
	        Connection connection = null;
	        PreparedStatement preparedStatement = null;
	        SQL6 = "DELETE FROM room WHERE ID=?";
	        connection = DBconnection.getConnection();
	        try {
	            preparedStatement = connection.prepareStatement(SQL6);

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
	     * 财务费用显示
	     * @return
	     */
	    public List<Money> getAllMoney() {
	        List<Money> lmoney = new ArrayList<>();
	        SQL4 = "SELECT * FROM money";
	        Connection connection = null;
	        PreparedStatement preparedStatement = null;
	        ResultSet resultSet = null;

	        connection = DBconnection.getConnection();
	        try {
	            preparedStatement = connection.prepareStatement(SQL4);
	            resultSet = preparedStatement.executeQuery();  //得到数据结果集
	            while (resultSet.next()) {
	                /**
	                 * 获取数据  写入List
	                 */
	                String id = resultSet.getString("MID");
	                System.out.println(id);
	                int book = resultSet.getInt("Book");
	                System.out.println(book);
	                int enexam = resultSet.getInt("Enexam");
	                System.out.println(book);
	                int maexam = resultSet.getInt("Maexam");
	                System.out.println(maexam);
	                int register = resultSet.getInt("Register");
	                System.out.println(register);
	               	      
	                /**
	                 * 初始化财务对象
	                 */
	                Money money=new Money(id,book,enexam,maexam,register);
	                lmoney.add(money);
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
	        return lmoney;
	    }
	    /**
	     * 报考新生信息显示
	     * @return
	     */
	    public List<NewStudent> getAllNewStudent() {
	        List<NewStudent> lnewstudent = new ArrayList<>();
	        SQL5 = "SELECT * FROM NewStudent";
	        Connection connection = null;
	        PreparedStatement preparedStatement = null;
	        ResultSet resultSet = null;

	        connection = DBconnection.getConnection();
	        try {
	            preparedStatement = connection.prepareStatement(SQL5);
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
	                int nclass = resultSet.getInt("NScore");
	               	      
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
	     * 修改财务信息
	     */
	    public void updateMoney(String id, int book,int en,int ma,int register) {
			Connection connection = null;
			PreparedStatement preparedStatement = null;
			SQL8= "UPDATE money SET Book=?,Enexam=?,Maexam=?,Register=? WHERE MID=?";
			connection = DBconnection.getConnection();
			try {
				preparedStatement = connection.prepareStatement(SQL8);

				preparedStatement.setInt(1, book);
				preparedStatement.setInt(2, en);
				preparedStatement.setInt(3, ma);
				preparedStatement.setInt(4, register);
				preparedStatement.setString(5, id);

				preparedStatement.executeUpdate();
				System.out.println("更新SQL语句已执行");
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
}
