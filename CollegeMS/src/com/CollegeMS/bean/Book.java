package com.CollegeMS.bean;
/**
 * 教材实体类
 * @author user
 *
 */
public class Book {
	private int id;
	private String major;
	private String name;
	private  int cost;
	private String message;
	
	public Book(int id, String major, String name, int cost, String message) {
		this.id = id;
		this.major = major;
		this.name = name;
		this.cost = cost;
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
}
