package com.CollegeMS.bean;

/**
 * 实体类
 * 管理员类
 * 用户名   密码
 * @author me
 *
 */
public class Manger {
	  private String username;
	  private String password;
	  /**
	   * 构造方法
	   * @param username
	   * @param passwords
	   */
	  public Manger(String username,String password){
		  this.username=username;
		  this.password=password;
	  }
	  /**
	   * 无参数
	   */
	  public Manger(){
		  
	  }
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	 
}
