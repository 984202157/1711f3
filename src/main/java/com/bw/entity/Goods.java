package com.bw.entity;

public class Goods {
	private Integer gid;
	private String gname;
	private String ename;
	private Double gsize;
	private Double price;
	private Integer gcount;
	private String biaoqian;
	private String gpic;
	private Integer tid;
	private Integer pid;
	public Integer getGid() {
		return gid;
	}
	public void setGid(Integer gid) {
		this.gid = gid;
	}
	public String getGname() {
		return gname;
	}
	public void setGname(String gname) {
		this.gname = gname;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public Double getGsize() {
		return gsize;
	}
	public void setGsize(Double gsize) {
		this.gsize = gsize;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Integer getGcount() {
		return gcount;
	}
	public void setGcount(Integer gcount) {
		this.gcount = gcount;
	}
	public String getBiaoqian() {
		return biaoqian;
	}
	public void setBiaoqian(String biaoqian) {
		this.biaoqian = biaoqian;
	}
	public String getGpic() {
		return gpic;
	}
	public void setGpic(String gpic) {
		this.gpic = gpic;
	}
	public Integer getTid() {
		return tid;
	}
	public void setTid(Integer tid) {
		this.tid = tid;
	}
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public Goods(Integer gid, String gname, String ename, Double gsize, Double price, Integer gcount, String biaoqian,
			String gpic, Integer tid, Integer pid) {
		super();
		this.gid = gid;
		this.gname = gname;
		this.ename = ename;
		this.gsize = gsize;
		this.price = price;
		this.gcount = gcount;
		this.biaoqian = biaoqian;
		this.gpic = gpic;
		this.tid = tid;
		this.pid = pid;
	}
	public Goods() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Goods [gid=" + gid + ", gname=" + gname + ", ename=" + ename + ", gsize=" + gsize + ", price=" + price
				+ ", gcount=" + gcount + ", biaoqian=" + biaoqian + ", gpic=" + gpic + ", tid=" + tid + ", pid=" + pid
				+ "]";
	}
	
	
}
