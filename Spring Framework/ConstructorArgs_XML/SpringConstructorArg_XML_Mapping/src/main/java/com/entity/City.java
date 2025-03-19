package com.entity;

public class City {

	private int cid;
	private String cname;

	public City() {

	}

	public City(int cid, String cname) {
		super();
		this.cid = cid;
		this.cname = cname;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	@Override
	public String toString() {
		return "City [cid=" + cid + ", cname=" + cname + "]";
	}

}
