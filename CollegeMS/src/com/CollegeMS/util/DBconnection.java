package com.CollegeMS.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *连接类
 * @author me
 *
 */
public class DBconnection {
	 //定义数据库连接信息
    private static String USER = "root";
    private static String PASSWORD = "123456";
    private static String DB_URL = "jdbc:mysql://127.0.0.1:3306/collegems?characterEncoding=utf8&useSSL=true";
    private static String DB_DRIVER = "com.mysql.jdbc.Driver";
    private static Connection connection = null;
    //连接数据库

    /**
     *将数据库连接封装成连接类的静态方法  返回连接对象
     * @return
     */
    public static Connection getConnection(){

        try {
            Class.forName(DB_DRIVER);
            connection = DriverManager.getConnection(DB_URL, USER, PASSWORD);
        } catch (Exception e) {
            System.out.println("数据库连接异常");
            e.printStackTrace();
        }
        return connection;
    }

    /**
     * 关闭数据库
     * @param connection
     */
    public  static void closeConnection(Connection connection){

        if(connection != null){
            try {
                connection.close(); // 关闭数据库连接
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

}
