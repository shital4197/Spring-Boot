package com.tka.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.MutationQuery;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tka.entity.Hospital;

@Repository
public class HospitalDao {

	@Autowired
	SessionFactory factory;

	public String insertData(Hospital h) {

		Session ss = factory.openSession();
		Transaction tr = ss.beginTransaction();

		String hqlQuery = "insert into Hospital(name,location,contact,email)values(:name,:location,:contact,:email)";

		MutationQuery query = ss.createNativeMutationQuery(hqlQuery);
		query.setParameter("name", h.getName());
		query.setParameter("location", h.getLocation());
		query.setParameter("contact", h.getContact());
		query.setParameter("email", h.getEmail());
		query.executeUpdate();

		tr.commit();
		ss.close();

		return "Hospital data inserted";

	}

	public String deleteData(int id) {

		Session ss = factory.openSession();
		Transaction tr = ss.beginTransaction();

		Hospital h1 = ss.get(Hospital.class, id);
		String hqlQuery = "delete from Hospital where id =:id";
		MutationQuery query = ss.createMutationQuery(hqlQuery);
		query.setParameter("id", id);
		query.executeUpdate();

		tr.commit();
		ss.close();
		return "Hospital data is deleted....";

	}

	public String updataData(Hospital h, int id) {

		Session ss = factory.openSession();
		Transaction tr = ss.beginTransaction();

		Hospital h1 = ss.get(Hospital.class, id);
		String hqlQuery = "update Hospital set name=:name, location=:location where id=:id";
		MutationQuery query = ss.createQuery(hqlQuery);
		query.setParameter("name", h.getName());
		query.setParameter("location", h.getLocation());
//		query.setParameter("contact", h.getContact());
//		query.setParameter("email", h.getEmail());
		query.setParameter("id", id);
		query.executeUpdate();

		tr.commit();
		ss.close();
		return "Hospital data is updated....";
	}

	public Hospital getsingleData(int id) {

		Session ss = factory.openSession();
		Transaction tr = ss.beginTransaction();

		String hqlQuery = "from Hospital where id=:id";
		Query<Hospital> query = ss.createQuery(hqlQuery, Hospital.class);
		query.setParameter("id", id);
		Hospital h1 = query.getSingleResult();

		tr.commit();
		ss.close();
		return h1;

	}

	public List<Hospital> getallData(Hospital h) {

		Session ss = factory.openSession();
		Transaction tr = ss.beginTransaction();

		String hqlQuery = "from Hospital";
		Query<Hospital> query = ss.createQuery(hqlQuery, Hospital.class);
		List<Hospital> list = query.list();

		tr.commit();
		ss.close();
		return list;

	}

}
