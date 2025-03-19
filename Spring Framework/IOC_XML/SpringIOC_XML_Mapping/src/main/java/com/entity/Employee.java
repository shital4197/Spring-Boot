package com.entity;

public class Employee {

	private int eid;
	private String ename;
	private String salary;

	private Country con;

	public Employee() {

	}

	public Employee(int eid, String ename, String salary, Country con) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
		this.con = con;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public Country getCon() {
		return con;
	}

	public void setCon(Country con) {
		this.con = con;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", salary=" + salary + ", con=" + con + "]";
	}

}