package com.entity;

public class Students {

	private int sid;
	private String sname;
	private String contact;
	
	private City city;

	public Students() {

	}

	public Students(int sid, String sname, String contact, City city) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.contact = contact;
		this.city = city;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Students [sid=" + sid + ", sname=" + sname + ", contact=" + contact + ", city=" + city + "]";
	}
	
	
	
}
