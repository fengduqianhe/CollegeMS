package com.CollegeMS.bean;

public class Room {

	public Room(int iD, String floor, String dorm, String dormNum) {
		this.ID = iD;
		this.Floor = floor;
		this.Dorm = dorm;
		this.DormNum = dormNum;
	}

	private int ID;
	private String Floor;
	private String Dorm;
	private String DormNum;

	public Room() {

	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getFloor() {
		return Floor;
	}

	public void setFloor(String floor) {
		Floor = floor;
	}

	public String getDorm() {
		return Dorm;
	}

	public void setDorm(String dorm) {
		Dorm = dorm;
	}

	public String getDormNum() {
		return DormNum;
	}

	public void setDormNum(String dormNum) {
		DormNum = dormNum;
	}

}