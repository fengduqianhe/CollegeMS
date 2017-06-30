package com.CollegeMS.bean;

public class StudentRoom {
	private int id;
	private String Sno;
	private String Dorm;
	private String Number;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSno() {
		return Sno;
	}
	public void setSno(String sno) {
		Sno = sno;
	}
	public String getDorm() {
		return Dorm;
	}
	public void setDorm(String dorm) {
		Dorm = dorm;
	}
	public String getNumber() {
		return Number;
	}
	public void setNumber(String number) {
		Number = number;
	}
	public StudentRoom(int id, String sno, String dorm, String number) {
		this.id = id;
		Sno = sno;
		Dorm = dorm;
		Number = number;
	}

}