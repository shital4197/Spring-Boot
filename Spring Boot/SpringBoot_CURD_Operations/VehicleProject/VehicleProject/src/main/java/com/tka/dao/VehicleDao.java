package com.tka.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tka.entity.Vehicle;

@Repository
public class VehicleDao {
	@Autowired
	SessionFactory factory;

	public String insertData(Vehicle vehicle) {

		Session ss = factory.openSession();
		Transaction tr = ss.beginTransaction();

		ss.persist(vehicle);
		tr.commit();
		ss.close();
		return "Data is inserted successfully in your database !";

	}

}
