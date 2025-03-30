package com.tka.dao;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.tka.entity.StudentEntity;


@Repository
public class StudentDao {

	@Autowired
	SessionFactory factory;

	public String insertData(StudentEntity s) {

		Session ss = factory.openSession();
		Transaction tr = ss.beginTransaction();

		ss.persist(s);
		tr.commit();
		ss.close();
		return "data is inserted...";
	}

	public String deleteData(int id) {
		Session ss = factory.openSession();
		Transaction tr = ss.beginTransaction();

		StudentEntity std = ss.get(StudentEntity.class, id);

		ss.remove(std);
		tr.commit();
		ss.close();

		return "Data is deleted..!";
	}

	public String updateData(StudentEntity s, int id) {

		Session ss = factory.openSession();
		Transaction tr = ss.beginTransaction();

		StudentEntity s1 = ss.get(StudentEntity.class, id);
		s1.setName(s.getName());
		s1.setCource(s.getCource());
		s1.setCity(s.getCity());

		ss.merge(s1);
		tr.commit();
		ss.close();

		return "Data is updated...";
	}

}
