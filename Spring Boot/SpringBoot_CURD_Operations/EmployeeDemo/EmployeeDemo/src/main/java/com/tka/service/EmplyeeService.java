package com.tka.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tka.dao.EmployeeDao;
import com.tka.entity.Employee;


@Service
public class EmplyeeService {
	
	@Autowired
	EmployeeDao dao;
	
	public String insertData(Employee e) {

		String msg = dao.insertData(e);
		return msg;
	}

	public String deleteData(int id) {
		String msg = dao.deleteData(id);
		return msg;
	}

	public String updateData(Employee e, int id) {
		String msg = dao.updateData(e, id);
		return msg;
	}

	public Employee getsingleData(int id) {
		Employee e = dao.getsingleData(id);
		return e;
	}

	public List<Employee> getallData(Employee e) {
		List<Employee> list = dao.getAllData(e);
		return list;
	}
	

}
