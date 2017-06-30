package com.CollegeMS.bean;
/**
 * 学生实体类
 * @author me
 *
 */
public class Student {
	private String Sno;
	private String Name;
	private String Passwords;
    private String Sex;
	private String Stime;
	private String College;
	private String Major;
	private String SClass;
	private String Sphone;
	private int card;
	
	public Student(String Sno,String Passwords,String Name,String Sex,String Stime,String College,String Major,String SClass,int card,String Phone) {
		this.Sno=Sno;
		this.Passwords=Passwords;
		this.Name=Name;
		this.Sex=Sex;
		this.Stime=Stime;
		this.College=College;
		this.Major=Major;
		this.SClass=SClass;
		this.card=card;
		this.Sphone=Phone;
	}
	/**无参构造
	 * 
	 * @return
	 */
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public int getCard() {
		return card;
	}
	public void setCard(int card) {
		this.card = card;
	}
	public String getSno() {
		return Sno;
	}
	public void setSno(String sno) {
		Sno = sno;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getSex() {
		return Sex;
	}
	public void setSex(String sex) {
		Sex = sex;
	}
	public String getStime() {
		return Stime;
	}
	public String getSphone() {
		return Sphone;
	}
	public void setSphone(String sphone) {
		Sphone = sphone;
	}
	public void setStime(String stime) {
		Stime = stime;
	}
	public String getCollege() {
		return College;
	}
	public void setCollege(String college) {
		College = college;
	}
	public String getMajor() {
		return Major;
	}
	public void setMajor(String major) {
		Major = major;
	}
	public String getSClass() {
		return SClass;
	}
	public void setSClass(String class1) {
		SClass = class1;
	}
	public String getPasswords() {
		return Passwords;
	}
	public void setPasswords(String passwords) {
		Passwords = passwords;
	}
}
