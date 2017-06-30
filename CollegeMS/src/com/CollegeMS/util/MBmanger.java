package com.CollegeMS.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.CollegeMS.bean.Book;
import com.CollegeMS.bean.Reward;
import com.CollegeMS.bean.Room;
import com.CollegeMS.bean.Score;
import com.CollegeMS.bean.Talent;
import com.CollegeMS.bean.Working;

/**
 * 人才培养  岗位申请    奖学金管理   处分管理
 * 
 * @author me
 *
 */
public class MBmanger {
	
	private String SQL1="";
	private String SQL2="";
	private String SQL3="";
	private String SQL4="";
	private String SQL5="";
	private String SQL6="";
	private String SQL7="";
	private String SQL8="";
	private String SQL9="";
	private String SQL10="";
	private String SQL11="";
	 /**
     * 人才学号 姓名  绩点
     * @return
     */
    public List<Talent> getAllTalent() {
        List<Talent> ltalent = new ArrayList<>();
        SQL1 = "SELECT * FROM Talent";
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
            	int id = resultSet.getInt("SID");
                String Sno = resultSet.getString("Sno");
                System.out.println(Sno);
                Double Grade = resultSet.getDouble("Grade");
                System.out.println(Grade);
                String Sname= resultSet.getString("Sname");
                String Smessage = resultSet.getString("Smessage");
      
                /**
                 * 初始化人才对象
                 */
                Talent talent=new Talent(id, Sno, Sname, Grade, Smessage);
                ltalent.add(talent);
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
        return ltalent;
    }
    
    /**
     * 勤工俭学岗位查找
     */
    public List<Working> getAllWorking() {
        List<Working> lworking = new ArrayList<>();
        SQL2 = "SELECT * FROM Working";
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
                int ID = resultSet.getInt("HID");
                String job = resultSet.getString("post");
                String place= resultSet.getString("place");
                int  salery = resultSet.getInt("salery");
      
                /**
                 * 初始化人才对象
                 */
                Working working=new Working(ID,job,place,salery);
                lworking.add(working);
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
        return lworking;
    }
    /**
     * 岗位删除工作
     */
    public void deletejob(String id) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        SQL3 = "DELETE FROM Working WHERE HID=?";
        connection = DBconnection.getConnection();
        try {
            preparedStatement = connection.prepareStatement(SQL3);

            preparedStatement.setString(1,id);
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
     * 更新岗位信息  
     * @param id
     * @param job
     * @param place
     * @param salery
     */

    public void updateWorking(int id,String job,String place,int salery) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        SQL6 = "UPDATE working set post =?,place=?,salery=? WHERE HID=?";
        connection = DBconnection.getConnection();
        try {
            preparedStatement = connection.prepareStatement(SQL6);

            preparedStatement.setInt(3,salery);
            preparedStatement.setString(1,job);
            preparedStatement.setString(2,place);
            preparedStatement.setInt(4,id);
            
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
     * 添加工作信息
     * @param job
     * @param place
     * @param salery
     * @return
     */

    public int addWorking(String job,String place,int salery) {
    	int num=0;
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        SQL7 = "INSERT INTO working (post,place,salery) VALUES(?,?,?)";
        connection = DBconnection.getConnection();
        try {
            preparedStatement = connection.prepareStatement(SQL7);

            //preparedStatement.setInt(1,CID);
            preparedStatement.setString(1,job);
            preparedStatement.setString(2,place);
            preparedStatement.setInt(3,salery);
            
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
        return num;
    }
    
    
    /**
     * 显示教材管理信息
     * @return
     */
    
    
    public List<Book> getAllBook() {
        List<Book> lbook = new ArrayList<>();
        SQL4 = "SELECT * FROM Book";
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
                int id = resultSet.getInt("BID");
                String major = resultSet.getString("major");
                String name= resultSet.getString("name");
                String message = resultSet.getString("message");
                int cost = resultSet.getInt("cost");
                /**
                 * 初始化教材对象
                 */
                Book book=new Book(id,major,name,cost,message);
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
    /**
     * 删除教材信息
     * @param id
     */
    public void deleteBook(int id) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        SQL5 = "DELETE FROM Book WHERE BID=?";
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
  * 添加教材信息
  * @param major
  * @param name
  * @param message
  * @param salery
  * @return
  */
    public int addBook(String major,String name,String message,int salery) {
    	int num=0;
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        SQL8 = "INSERT INTO Book (major,name,message,cost) VALUES(?,?,?,?)";
        connection = DBconnection.getConnection();
        try {
            preparedStatement = connection.prepareStatement(SQL8);

            //preparedStatement.setInt(1,CID);
            preparedStatement.setString(1,major);
            preparedStatement.setString(2,name);
            preparedStatement.setString(3,message);
            preparedStatement.setInt(4,salery);
            
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
        return num;
    }
    
    
    /**
     * 查询奖学金信息
     */
    
    public List<Reward> getAllReward() {
        List<Reward> lreward = new ArrayList<>();
        SQL9 = "SELECT * FROM reward";
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        connection = DBconnection.getConnection();
        try {
            preparedStatement = connection.prepareStatement(SQL9);
            resultSet = preparedStatement.executeQuery();  //得到数据结果集
            while (resultSet.next()) {
                /**
                 * 获取数据  写入List
                 */
                int id = resultSet.getInt("RID");
                System.out.println(id);
                String Sno = resultSet.getString("Sno");
                String name = resultSet.getString("name");
                System.out.println(name);
                String money= resultSet.getString("money");
                String message = resultSet.getString("message");
      
                /**
                 * 初始化奖学金对象
                 */
                Reward reward = new Reward(id, name, money, message,Sno);
				lreward.add(reward);
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
        return lreward;
    }
    /**
     * 添加奖学金信息
     * @param name
     * @param message
     * @param money
     * @param Sno
     * @return
     */
       
    public int addReward(String name,String message,int money ,String Sno) {
    	int num=0;
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        SQL10 = "INSERT INTO reward (name,message,money,Sno) VALUES(?,?,?,?)";
        connection = DBconnection.getConnection();
        try {
            preparedStatement = connection.prepareStatement(SQL10);

            //preparedStatement.setInt(1,CID);
            preparedStatement.setString(1,name);
            preparedStatement.setString(2,message);
            preparedStatement.setInt(3,money);
            preparedStatement.setString(4,Sno);
            
            num=preparedStatement.executeUpdate();
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
        return num;
    }
    /**
     * 显示成绩信息
     * @return
     */
    
    public List<Score> getAllScore() {
        List<Score> lscore = new ArrayList<>();
        SQL11 = "SELECT * FROM score";
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        connection = DBconnection.getConnection();
        try {
            preparedStatement = connection.prepareStatement(SQL11);
            resultSet = preparedStatement.executeQuery();  //得到数据结果集
            while (resultSet.next()) {
                /**
                 * 获取数据  写入List
                 */
                int id = resultSet.getInt("ID");
              
                String Sno = resultSet.getString("Sno");
                String Sname = resultSet.getString("Sname");
                int ma = resultSet.getInt("ma");
                int en = resultSet.getInt("en");
                int ph = resultSet.getInt("ph");
                int pe = resultSet.getInt("pe");
                int ce = resultSet.getInt("ce");
                int me = resultSet.getInt("me");
                int ge = resultSet.getInt("ge");
      
                /**
                 * 初始化奖学金对象
                 */
                Score score = new Score(id,Sno,Sname,ma,en,ph,pe,ce,me,ge);
                lscore.add(score);
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
        return lscore;
    }
}

