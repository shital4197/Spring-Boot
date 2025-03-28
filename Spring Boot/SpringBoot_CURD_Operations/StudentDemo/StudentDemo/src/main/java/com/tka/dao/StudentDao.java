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

}
