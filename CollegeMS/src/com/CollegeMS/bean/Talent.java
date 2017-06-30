package com.CollegeMS.bean;

public class Talent {
	private int id;
	private String Sno;
	private String Sname ;
	private Double Grade;
	private String Message;
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
	public String getSname() {
		return Sname;
	}
	public void setSname(String sname) {
		Sname = sname;
	}
	public Double getGrade() {
		return Grade;
	}
	public void setGrade(Double grade) {
		Grade = grade;
	}
	public String getMessage() {
		return Message;
	}
	public void setMessage(String message) {
		Message = message;
	}
	public Talent(int id, String sno, String sname, Double grade, String message) {
		this.id = id;
		Sno = sno;
		Sname = sname;
		Grade = grade;
		Message = message;
	}
	
}