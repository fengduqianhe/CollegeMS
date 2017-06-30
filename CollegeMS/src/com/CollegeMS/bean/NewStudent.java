package com.CollegeMS.bean;


/**
 * 新生实体类
 * @author me
 *
 */
public class NewStudent {
	
	private String NID;
	private String NName;
	private String Nsex;
	private String NTime;
	private String NPhone;
	private String NCollege;
	private String NMajor;
	private int NClass;
	private int NScore;
	
	
	public NewStudent(){
		
	}
	public NewStudent(String nID, String nName, String nsex, String nTime,
			String nPhone, String nCollege, String nMajor,int nclass, int nScore) {
		this.NID = nID;
		this.NName = nName;
		this.Nsex = nsex;
		this.NTime = nTime;
		this.NPhone = nPhone;
		this.NCollege = nCollege;
		this.NMajor = nMajor;
		this.NClass=nclass;
		this.NScore = nScore;
	}
	public String getNID() {
		return NID;
	}
	public void setNID(String nID) {
		NID = nID;
	}
	public String getNName() {
		return NName;
	}
	public void setNName(String nName) {
		NName = nName;
	}
	public String getNsex() {
		return Nsex;
	}
	public void setNsex(String nsex) {
		Nsex = nsex;
	}
	public String getNTime() {
		return NTime;
	}
	public void setNTime(String nTime) {
		NTime = nTime;
	}
	public String getNPhone() {
		return NPhone;
	}
	public void setNPhone(String nPhone) {
		NPhone = nPhone;
	}
	public String getNCollege() {
		return NCollege;
	}
	public void setNCollege(String nCollege) {
		NCollege = nCollege;
	}
	public String getNMajor() {
		return NMajor;
	}
	public void setNMajor(String nMajor) {
		NMajor = nMajor;
	}
	public int getNScore() {
		return NScore;
	}
	public void setNScore(int nScore) {
		NScore = nScore;
	}
	
	public int getNClass() {
		return NClass;
	}
	public void setNClass(int nClass) {
		NClass = nClass;
	}
}
