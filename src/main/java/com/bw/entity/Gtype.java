package com.bw.entity;

public class Gtype {
	private Integer tid;
	private String tname;
	public Integer getTid() {
		return tid;
	}
	public void setTid(Integer tid) {
		this.tid = tid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public Gtype(Integer tid, String tname) {
		super();
		this.tid = tid;
		this.tname = tname;
	}
	public Gtype() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "gtype [tid=" + tid + ", tname=" + tname + "]";
	}
	
}
