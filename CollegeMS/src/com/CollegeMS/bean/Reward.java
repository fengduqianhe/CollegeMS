package com.CollegeMS.bean;
/**
 * 奖学金实体类
 * 包括编号，姓名，金额，信息
 * @author user
 *
 */

public class Reward {
	private int id;
	private String name;
	private String money;
	private String message;
	private String Sno;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMoney() {
		return money;
	}
	public void setMoney(String money) {
		this.money = money;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getSno() {
		return Sno;
	}
	public void setSno(String sno) {
		Sno = sno;
	}
	public Reward(int id, String name, String money, String message, String sno) {
		this.id = id;
		this.name = name;
		this.money = money;
		this.message = message;
		Sno = sno;
	}
	
}