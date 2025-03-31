package com.tka.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.tka.entity.Employee;

@Repository
public class EmployeeDao {

	@Autowired
	SessionFactory factory;

	public String insertData(Employee e) {

		Session ss = factory.openSession();
		Transaction tr = ss.beginTransaction();

		ss.persist(e);
		tr.commit();
		ss.close();
		return "Data is inserted successfully in your database !";
	}

	public String deleteData(int id) {

		Session ss = factory.openSession();
		Transaction tr = ss.beginTransaction();

		Employee e = ss.get(Employee.class, id);
		ss.remove(e);
		tr.commit();
		ss.close();

		return "Employee data deleted!";
	}

	public String updateData(Employee e, int id) {

		Session ss = factory.openSession();
		Transaction tr = ss.beginTransaction();

		Employee e1 = ss.get(Employee.class, id);
		e1.setFname(e.getFname());
		e1.setLname(e.getLname());
		e1.setCity(e.getCity());
		e1.setState(e.getState());
		e1.setRole(e.getRole());
		e1.setSalary(e.getSalary());
		e1.setContact(e.getContact());

		ss.merge(e1);
		tr.commit();
		ss.close();
		return "Employee data updated";
	}

	public Employee getsingleData(int id) {

		Session ss = factory.openSession();
		Transaction tr = ss.beginTransaction();

		Employee e2 = ss.get(Employee.class, id);
		tr.commit();
		ss.close();
		return e2;

	}

	public List<Employee> getAllData(Employee e) {

		Session ss = factory.openSession();
		Transaction tr = ss.beginTransaction();

		String hqlQuery = "from Employee";

		Query<Employee> query = ss.createQuery(hqlQuery, Employee.class);
		List<Employee> list = query.list();

		tr.commit();
		ss.close();

		return list;

	}

}
