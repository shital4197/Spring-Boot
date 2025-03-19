package com.entity;

public class Car {

	private int id;
	private String carname;

	public Car() {

	}

	public Car(int id, String carname) {
		super();
		this.id = id;
		this.carname = carname;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCarname() {
		return carname;
	}

	public void setCarname(String carname) {
		this.carname = carname;
	}

	@Override
	public String toString() {
		return "Car [id=" + id + ", carname=" + carname + "]";
	}

}
