package com.tka.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class StudentEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String city;
	private String cource;

	public StudentEntity() {

	}

	public StudentEntity(int id, String name, String city, String cource) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.cource = cource;
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

	public String getCource() {
		return cource;
	}

	public void setCource(String cource) {
		this.cource = cource;
	}

	@Override
	public String toString() {
		return "StudentEntity [id=" + id + ", name=" + name + ", city=" + city + ", cource=" + cource + "]";
	}

}
