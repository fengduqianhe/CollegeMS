package com.CollegeMS.bean;
/**
 * 首页招生信息
 * 实体类
 * @author me
 *
 */
public class Annoucent {
	private String id;
	private String notice;
	private String time;
	
	public Annoucent(String id, String notice, String time) {
		this.id = id;
		this.notice = notice;
		this.time = time;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNotice() {
		return notice;
	}
	public void setNotice(String notice) {
		this.notice = notice;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	
}
