package com.bw.entity;

public class Condition1 {
	private String tid;
	private String pid;
	private Integer pageNum;
	private String price1;
	private String price2;
	private String gname;
	public String getTid() {
		return tid;
	}
	public void setTid(String tid) {
		this.tid = tid;
	}
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public Integer getPageNum() {
		return pageNum;
	}
	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}
	public String getPrice1() {
		return price1;
	}
	public void setPrice1(String price1) {
		this.price1 = price1;
	}
	public String getPrice2() {
		return price2;
	}
	public void setPrice2(String price2) {
		this.price2 = price2;
	}
	public String getGname() {
		return gname;
	}
	public void setGname(String gname) {
		this.gname = gname;
	}
	public Condition1(String tid, String pid, Integer pageNum, String price1, String price2, String gname) {
		super();
		this.tid = tid;
		this.pid = pid;
		this.pageNum = pageNum;
		this.price1 = price1;
		this.price2 = price2;
		this.gname = gname;
	}
	public Condition1() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Condition1 [tid=" + tid + ", pid=" + pid + ", pageNum=" + pageNum + ", price1=" + price1 + ", price2="
				+ price2 + ", gname=" + gname + "]";
	}
	
	
}
