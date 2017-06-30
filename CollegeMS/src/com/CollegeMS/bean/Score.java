package com.CollegeMS.bean;

/**
 * 学生分数实体类
 * @author me
 *
 */
public class Score {
	private int id;
	private String Sno;
	private String Sname;
	private int ma;
	private int en;
	private int ph;
	private int pe;
	private int ce;
	private int me;
	private int ge;
	
	public Score(int id,String sno, String sname, int ma, int en, int ph, int pe,
			int ce, int me, int ge) {
		this.id=id;
		Sno = sno;
		Sname = sname;
		this.ma = ma;
		this.en = en;
		this.ph = ph;
		this.pe = pe;
		this.ce = ce;
		this.me = me;
		this.ge = ge;
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
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getMa() {
		return ma;
	}
	public void setMa(int ma) {
		this.ma = ma;
	}
	public int getEn() {
		return en;
	}
	public void setEn(int en) {
		this.en = en;
	}
	public int getPh() {
		return ph;
	}
	public void setPh(int ph) {
		this.ph = ph;
	}
	public int getPe() {
		return pe;
	}
	public void setPe(int pe) {
		this.pe = pe;
	}
	public int getCe() {
		return ce;
	}
	public void setCe(int ce) {
		this.ce = ce;
	}
	public int getMe() {
		return me;
	}
	public void setMe(int me) {
		this.me = me;
	}
	public int getGd() {
		return ge;
	}
	public void setGd(int gd) {
		this.ge = ge;
	}
	
}
