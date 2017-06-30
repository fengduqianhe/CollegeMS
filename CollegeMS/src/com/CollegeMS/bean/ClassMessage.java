package com.CollegeMS.bean;
/**
 * 班级信息 实体类
 * @author me
 *
 */
public class ClassMessage {
	private int cid;
	private String college=null;
	private String major=null;
	private String message=null;
	public int getNumber() {
		return number;
	}


	public void setNumber(int number) {
		this.number = number;
	}


	private int number;
	private int numcollege;
	private int nummajor;
	private int numclass;
	private int numpeople;
	
	
	public ClassMessage(int cid, String college, String major, String message,int number,
			int numcollege, int nummajor, int numclass, int numpeople) {
		this.cid = cid;
		this.college = college;
		this.major = major;
		this.message = message;
		this.number=number;
		this.numcollege = numcollege;
		this.nummajor = nummajor;
		this.numclass = numclass;
		this.numpeople = numpeople;
	}


	public int getCid() {
		return cid;
	}


	public void setCid(int cid) {
		this.cid = cid;
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


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}


	public int getNumcollege() {
		return numcollege;
	}


	public void setNumcollege(int numcollege) {
		this.numcollege = numcollege;
	}


	public int getNumajor() {
		return nummajor;
	}


	public void setNummajor(int nummajor) {
		this.nummajor = nummajor;
	}


	public int getNumclass() {
		return numclass;
	}


	public void setNumclass(int numclass) {
		this.numclass = numclass;
	}


	public int getNumpeople() {
		return numpeople;
	}


	public void setNumpeople(int numpeople) {
		this.numpeople = numpeople;
	}


	/**
	 * 无参数
	 */
	public ClassMessage(){
		
	} 

}
