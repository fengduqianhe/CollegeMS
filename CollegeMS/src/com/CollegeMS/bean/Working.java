package com.CollegeMS.bean;



/**
 * 勤工俭学岗位管理
 * @author me
 *
 */
public class Working {
	private int ID;
	private String job;
	private String place;
	private int Salery;
	
	public Working(int iD, String job, String place, int salery) {
		ID = iD;
		this.job = job;
		this.place = place;
		Salery = salery;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public int getSalery() {
		return Salery;
	}
	public void setSalery(int salery) {
		Salery = salery;
	}
}
