package com.tka.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Library {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String city;
	private String state;
	private int totalbooks;

	public Library() {

	}

	public Library(int id, String name, String city, String state, int totalbooks) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.state = state;
		this.totalbooks = totalbooks;
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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getTotalbooks() {
		return totalbooks;
	}

	public void setTotalbooks(int totalbooks) {
		this.totalbooks = totalbooks;
	}

	@Override
	public String toString() {
		return "Library [id=" + id + ", name=" + name + ", city=" + city + ", state=" + state + ", totalbooks="
				+ totalbooks + "]";
	}

}
