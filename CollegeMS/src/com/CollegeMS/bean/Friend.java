package com.CollegeMS.bean;


/**
 * 校友实体类
 * @author me
 *
 */
public class Friend {
	private int Fid;
	private String Fno;
	private String Fname;
	private String Fcollege;
	private String Fmajor;
	
	
	public Friend(int fid, String fno, String fname, String fcollege,
			String fmajor) {
		this.Fid = fid;
		this.Fno = fno;
		this.Fname = fname;
		this.Fcollege = fcollege;
		this.Fmajor = fmajor;
	}
	public int getFid() {
		return Fid;
	}
	public void setFid(int fid) {
		Fid = fid;
	}
	public String getFno() {
		return Fno;
	}
	public void setFno(String fno) {
		Fno = fno;
	}
	public String getFname() {
		return Fname;
	}
	public void setFname(String fname) {
		Fname = fname;
	}
	public String getFcollege() {
		return Fcollege;
	}
	public void setFcollege(String fcollege) {
		Fcollege = fcollege;
	}
	public String getFmajor() {
		return Fmajor;
	}
	public void setFmajor(String fmajor) {
		Fmajor = fmajor;
	}
	
}
