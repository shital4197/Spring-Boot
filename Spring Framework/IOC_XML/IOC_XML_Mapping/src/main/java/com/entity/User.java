package com.entity;

public class User {

	private int uid;
	private String username;
	private String contact;
	private String city;

	private Car car;

	public User() {

	}

	public User(int uid, String username, String contact, String city, Car car) {
		super();
		this.uid = uid;
		this.username = username;
		this.contact = contact;
		this.city = city;
		this.car = car;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
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

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	@Override
	public String toString() {
		return "User [uid=" + uid + ", username=" + username + ", contact=" + contact + ", city=" + city + ", car="
				+ car + "]";
	}

}
