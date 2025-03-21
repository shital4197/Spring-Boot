package com.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Students {

	@Value("101")
	private int sid;
	@Value("Kajal")
	private String sname;
	@Value("Pune")
	private String city;

	@Autowired
	private College clg;

	public Students() {

	}

	public Students(int sid, String sname, String city, College clg) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.city = city;
		this.clg = clg;
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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public College getClg() {
		return clg;
	}

	public void setClg(College clg) {
		this.clg = clg;
	}

	@Override
	public String toString() {
		return "Students [sid=" + sid + ", sname=" + sname + ", city=" + city + ", clg=" + clg + "]";
	}

}
