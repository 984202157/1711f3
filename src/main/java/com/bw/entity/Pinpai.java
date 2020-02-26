package com.bw.entity;

public class Pinpai {
	private Integer pid;
	private String pname;
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public Pinpai(Integer pid, String pname) {
		super();
		this.pid = pid;
		this.pname = pname;
	}
	public Pinpai() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Pinpai [pid=" + pid + ", pname=" + pname + "]";
	}
	
}
