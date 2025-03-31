package com.tka.dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tka.entity.Vehicle;

@Repository
public class VehicleDao {

	@Autowired
	SessionFactory factory;

	public String insertData(Vehicle v) {

		Session ss = factory.openSession();
		Transaction tr = ss.beginTransaction();

		ss.persist(v);
		tr.commit();
		ss.close();
		return "Data is inserted successfully in your database !";
	}

	public String deleteData(int id) {

		Session ss = factory.openSession();
		Transaction tr = ss.beginTransaction();

		Vehicle ve = ss.get(Vehicle.class, id);

		ss.remove(ve);
		tr.commit();
		ss.close();

		return "Data is deleted..!";
	}

	public String updateData(Vehicle v, int id) {

		Session ss = factory.openSession();
		Transaction tr = ss.beginTransaction();

		Vehicle v1 = ss.get(Vehicle.class, id);
		v1.setType(v.getType());
		v1.setName(v.getName());
		v1.setColor(v.getColor());

		ss.merge(v1);
		tr.commit();
		ss.close();

		return "Data is updated...";
	}

	public Vehicle getSingleData(int id) {

		Session ss = factory.openSession();
		Transaction tr = ss.beginTransaction();

		Vehicle s2 = ss.get(Vehicle.class, id);

		tr.commit();
		ss.close();

		return s2;
	}

	public List<Vehicle> getAllData(Vehicle v) {

		Session ss = factory.openSession();
		Transaction tr = ss.beginTransaction();

		String hqlQuery = "from Vehicle";

		Query<Vehicle> query = ss.createQuery(hqlQuery, Vehicle.class);
		List<Vehicle> list = query.list();

		tr.commit();
		ss.close();

		return list;

	}

}
