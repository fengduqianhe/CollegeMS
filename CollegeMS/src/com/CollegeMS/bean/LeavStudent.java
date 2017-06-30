package com.CollegeMS.bean;


/**
 * 申请离校学生名单
 * @author me
 *
 */
public class LeavStudent {
	private int  id;
	private String Sno;
	private String Sname;
	private String college;
	private String major;
	
	

	public LeavStudent(int id, String sno, String sname, String college,
			String major) {
		this.id = id;
		Sno = sno;
		Sname = sname;
		this.college = college;
		this.major = major;
	}
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
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	
	

}
