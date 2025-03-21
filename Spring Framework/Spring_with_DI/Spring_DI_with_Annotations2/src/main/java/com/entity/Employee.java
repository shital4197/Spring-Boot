package com.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	
	@Value("11255")
	private int id;
	@Value("Priti")
	private String name;
	@Value("89946998957")
	private String contact;
	@Value("Nashik")
	private String city;

	@Autowired
	private Country con;

	public Employee() {

	}

	public Employee(int id, String name, String contact, String city, Country con) {
		super();
		this.id = id;
		this.name = name;
		this.contact = contact;
		this.city = city;
		this.con = con;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Country getCon() {
		return con;
	}

	public void setCon(Country con) {
		this.con = con;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", contact=" + contact + ", city=" + city + ", con=" + con
				+ "]";
	}

}
