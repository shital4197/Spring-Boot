package com.tka.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tka.entity.Library;

@Repository
public class LibraryDao {

	@Autowired
	SessionFactory factory;

	public String insertData(Library l) {

		Session ss = factory.openSession();
		Transaction tr = ss.beginTransaction();

		ss.persist(l);
		tr.commit();
		ss.close();
		return "Library data is inserted...";
	}

	public String deleteData(int id) {
		Session ss = factory.openSession();
		Transaction tr = ss.beginTransaction();

		Library l = ss.get(Library.class, id);

		ss.remove(l);
		tr.commit();
		ss.close();

		return "Library data is deleted..!";
	}

	public String updateData(Library l, int id) {

		Session ss = factory.openSession();
		Transaction tr = ss.beginTransaction();

		Library l1 = ss.get(Library.class, id);
		l1.setName(l.getName());
		l1.setCity(l.getCity());
		l1.setState(l.getState());
		l1.setTotalbooks(l.getTotalbooks());

		ss.merge(l1);
		tr.commit();
		ss.close();

		return "Library data is updated...";
	}

	public Library getSingleData(int id) {

		Session ss = factory.openSession();
		Transaction tr = ss.beginTransaction();

		Library l1 = ss.get(Library.class, id);

		tr.commit();
		ss.close();

		return l1;
	}

	public List<Library> getAllData(Library l) {

		Session ss = factory.openSession();
		Transaction tr = ss.beginTransaction();

		String hqlQuery = "from Library";

		Query<Library> query = ss.createQuery(hqlQuery, Library.class);
		List<Library> list = query.list();

		tr.commit();
		ss.close();

		return list;

	}

}
