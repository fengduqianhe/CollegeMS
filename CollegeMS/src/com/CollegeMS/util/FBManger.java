package com.CollegeMS.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;





import com.CollegeMS.bean.Friend;
import com.CollegeMS.bean.LeavStudent;
import com.CollegeMS.bean.StudentRoom;


/**
 * 校友管理      学生住宿信息   离校管理
 * @author me
 *
 */
public class FBManger {
	private String SQL1="";
	private String SQL2="";
	private String SQL3="";
	private String SQL4="";
	/**
	 * 校友显示
	 * @return
	 */
	 public List<Friend> getAllFriend() {
	        List<Friend> lfriend = new ArrayList<>();
	        SQL1 = "SELECT * FROM Friend";
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
	            	int fid = resultSet.getInt("FID");
	                String fno = resultSet.getString("Fno");
	                String fname = resultSet.getString("Name");
	                String fcollege = resultSet.getString("College");
	                String fmajor = resultSet.getString("Major");
	                
	                Friend friend=new Friend(fid, fno, fname, fcollege, fmajor);
	                lfriend.add(friend);
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
	        return lfriend;
	    }
	 
	 
	 /**
	  * 学生宿舍信息显示
	  */
	 public List<StudentRoom> getAllStudentRoom() {
	        List<StudentRoom> lstudentRoom = new ArrayList<>();
	        SQL2 = "SELECT * FROM StudentRoom";
	        Connection connection = null;
	        PreparedStatement preparedStatement = null;
	        ResultSet resultSet = null;

	        connection = DBconnection.getConnection();
	        try {
	            preparedStatement = connection.prepareStatement(SQL2);
	            resultSet = preparedStatement.executeQuery();  //得到数据结果集
	            while (resultSet.next()) {
	                /**
	                 * 获取数据  写入List
	                 */
	            	int id = resultSet.getInt("ID");
	                String Sno = resultSet.getString("Sno");
	                String Dorm = resultSet.getString("Dorm");
	                String number = resultSet.getString("Number");
	                
	                StudentRoom studentRoom=new StudentRoom(id,Sno,Dorm,number);
	                lstudentRoom.add(studentRoom);
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
	        return lstudentRoom;
	    }
	 
	 
	 /**
	  * 离校信息
	  * @return
	  */
	 public List<LeavStudent> getAllLeavStudent() {
	        List<LeavStudent> lstudent = new ArrayList<>();
	        SQL3 = "SELECT * FROM leaving";
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
	            	int id = resultSet.getInt("LID");
	                String Sno = resultSet.getString("Lsno");
	                String name = resultSet.getString("Lname");
	                String college = resultSet.getString("Lcollege");
	                String  major= resultSet.getString("Lmajor");
	                
	                LeavStudent student=new LeavStudent(id,Sno,name,college,major);
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
	  * 删除校友信息
	  * @param id
	  */
	 
		public void deleteFriend(String id) {
			Connection connection = null;
			PreparedStatement preparedStatement = null;
			SQL4 = "DELETE FROM friend WHERE FID=?";
			connection = DBconnection.getConnection();
			try {
				preparedStatement = connection.prepareStatement(SQL4);

				preparedStatement.setString(1, id);
				preparedStatement.executeUpdate();
				System.out.println("删除SQL语句已执行");
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


