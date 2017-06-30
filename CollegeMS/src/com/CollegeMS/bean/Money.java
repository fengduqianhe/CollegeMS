package com.CollegeMS.bean;
/**
 * 财务管理实体类
 * 包括  教材费用   等级考试费用
 * 报名费用 
 * @author me
 *
 */
public class Money {
	private String MID;
	private int Book;
	private int Enexam;
	private int MaExam;
	private int Register;
	
	
	public String getMID() {
		return MID;
	}
	public void setMID(String mID) {
		MID = mID;
	}
	public int getBook() {
		return Book;
	}
	public void setBook(int book) {
		Book = book;
	}
	public int getEnexam() {
		return Enexam;
	}
	public void setEnexam(int enexam) {
		Enexam = enexam;
	}
	public int getMaExam() {
		return MaExam;
	}
	public void setMaExam(int maExam) {
		MaExam = maExam;
	}
	public int getRegister() {
		return Register;
	}
	public void setRegister(int register) {
		Register = register;
	}
	/**
	 * 有参数的构造
	 * @return
	 */
	public Money(String mID, int book, int enexam, int maExam, int register) {
		this.MID = mID;
		this.Book = book;
		this.Enexam = enexam;
		this.MaExam = maExam;
		this.Register = register;
	}
	/**
	 * 无参构造
	 */
	public Money() {
	
	}
}
