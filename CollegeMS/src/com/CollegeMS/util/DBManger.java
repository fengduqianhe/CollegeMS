package com.CollegeMS.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.CollegeMS.bean.Annoucent;
import com.CollegeMS.bean.Manger;
import com.CollegeMS.bean.ClassMessage;

import static java.lang.System.out;

/**
 * 数据库操作 主要实现 管理员登录 注册 招生管理
 * 
 * @author me
 * 
 */
public class DBManger {
	/**
	 * 获取LoginServlet传来的参数 在数据库中进行查找，返回Manger对象
	 * 
	 * @param username
	 * @param password
	 * @return
	 */
	private String SQL1 = "";
	private String SQL2 = "";
	private String SQL3 = "";
	private String SQL4 = "";
	private String SQL5 = "";
	private String SQL6 = "";
	private String SQL7 = "";
	private String SQL8 = "";

	/**
	 * 管理员登陆
	 * 
	 * @param username
	 * @param password
	 * @return
	 */
	public Manger login(String username, String password) {
		Manger manger = null;
		SQL1 = "select * from Manger where username = ? and password = ?";
		Connection connection = null;
		PreparedStatement pstmt = null; // 与占位符连用
		try {
			connection = DBconnection.getConnection();
			pstmt = connection.prepareStatement(SQL1);
			// 这里的意思将用户名和密码填到SQL语句的问号处 占位符
			pstmt.setString(1, username);
			pstmt.setString(2, password);
			ResultSet rSet = pstmt.executeQuery();// 得到数据库的查询结果,一个数据集
			// 判断结果集是否有效
			if (rSet.next()) {
				System.out.println("ok");
				manger = new Manger();
				manger.setUsername(rSet.getString("username"));
				manger.setPassword(rSet.getString("password"));
			}
			connection.close();
			pstmt.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			DBconnection.closeConnection(connection); // 在finally模块中关闭数据库
		}
		return manger;
	}

	/**
	 * 管理员注册 添加
	 * 
	 * @param username
	 * @param password
	 * @return
	 */

	public int addManger(String username, String password) {
		int num = 0;
		Manger manger = login(username, password);
		if (manger != null) {
			num = -1;
			return num;
		}

		else {
			SQL2 = "insert into Manger(username,password) values(?,?)";
			Connection connection = null;
			PreparedStatement preparedStatement = null;
			// Statement stmt=connection.createStatement(); //用于保存查询结果的变量声明与定义
			connection = DBconnection.getConnection();
			try {
				preparedStatement = connection.prepareStatement(SQL2);

				preparedStatement.setString(1, username);

				preparedStatement.setString(2, password);

				out.println(username);
				out.println(password);
				out.println(SQL2);

				// num=preparedStatement.executeUpdate(SQL1);
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

	}

	/**
	 * 招生管理 显示班级信息表 返回一个List
	 * 
	 * @return
	 */
	public List<ClassMessage> getAllClass() {
		List<ClassMessage> lclassMessage = new ArrayList<>();
		SQL3 = "SELECT * FROM Class";
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;

		connection = DBconnection.getConnection();
		try {
			preparedStatement = connection.prepareStatement(SQL3);
			resultSet = preparedStatement.executeQuery(); // 得到数据结果集
			while (resultSet.next()) {
				/**
				 * 获取数据 写入List
				 */
				int cid = resultSet.getInt("CID");
				String college = resultSet.getString("College");
				String major = resultSet.getString("Major");
				String message = resultSet.getString("Message");
				int number = resultSet.getInt("Number");
				int numcollege = resultSet.getInt("Numcollege");
				int nummajor = resultSet.getInt("Nummajor");
				int numclass = resultSet.getInt("Numclass");
				int numpeople = resultSet.getInt("Numpeople");
				ClassMessage classMessage = new ClassMessage(cid, college,
						major, message, number, numcollege, nummajor, numclass,
						numpeople);
				System.out.println(classMessage.getNumclass());
				lclassMessage.add(classMessage);
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
		return lclassMessage;
	}

	/**
	 * 班级信息的删除
	 * 
	 * @return
	 */
	public void deleteClass(String cid) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		SQL4 = "DELETE FROM Class WHERE CID=?";
		connection = DBconnection.getConnection();
		try {
			preparedStatement = connection.prepareStatement(SQL4);

			preparedStatement.setString(1, cid);
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

	/**
	 * 专业信息更新
	 * 
	 * @return
	 */
	public void updateclass(String cid, String college, String major) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		SQL5 = "UPDATE Class SET college=?,major=? WHERE CID=?";
		connection = DBconnection.getConnection();
		try {
			preparedStatement = connection.prepareStatement(SQL5);

			preparedStatement.setString(1, college);
			preparedStatement.setString(2, major);
			preparedStatement.setString(3, cid);

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

	/**
	 * 专业信息的添加
	 * 
	 * @param cid
	 */
	public int addClass(String College, String Major, String Message,
			int Number, int NumCollege, int NumMajor, int NumClass,
			int NumPeople) {
		int num = 0;
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		SQL7 = "INSERT INTO Class (college,major,Message,Number,Numcollege,Nummajor,Numclass,Numpeople) VALUES(?,?,?,?,?,?,?,?)";
		connection = DBconnection.getConnection();
		try {
			preparedStatement = connection.prepareStatement(SQL7);

			// preparedStatement.setInt(1,CID);
			preparedStatement.setString(1, College);
			preparedStatement.setString(2, Major);
			preparedStatement.setString(3, Message);
			preparedStatement.setInt(4, Number);
			preparedStatement.setInt(5, NumCollege);
			preparedStatement.setInt(6, NumMajor);
			preparedStatement.setInt(7, NumClass);
			preparedStatement.setInt(8, NumPeople);

			preparedStatement.executeUpdate();
			System.out.println("添加SQL语句已执行");
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
	 * 招生信息的发布 显示
	 */
	public Annoucent getAllAnnoucent() {
		Annoucent annoucent = null;
		SQL6 = "SELECT * FROM announcement";
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;

		connection = DBconnection.getConnection();
		try {
			preparedStatement = connection.prepareStatement(SQL6);
			resultSet = preparedStatement.executeQuery(); // 得到数据结果集
			while (resultSet.next()) {
				/**
				 * 获取数据
				 */
				String id = resultSet.getString("RID");
				String notice = resultSet.getString("Notice");
				String time = resultSet.getString("Noticetime");
				annoucent = new Annoucent(id, notice, time);
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
		return annoucent;
	}

	/**
	 * 招生信息的更新
	 * 
	 * @param id
	 * @param Notice
	 * @param Noticetime
	 */

	public void updateNotice(String id, String Notice, String Noticetime) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		SQL8 = "UPDATE announcement SET Notice=?,Noticetime=? WHERE RID=?";
		connection = DBconnection.getConnection();
		try {
			preparedStatement = connection.prepareStatement(SQL8);

			preparedStatement.setString(1, Notice);
			preparedStatement.setString(2, Noticetime);
			preparedStatement.setString(3, id);

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
