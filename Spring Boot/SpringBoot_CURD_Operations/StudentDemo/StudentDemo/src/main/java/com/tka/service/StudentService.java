package com.tka.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.dao.StudentDao;
import com.tka.entity.StudentEntity;

@Service
public class StudentService {

	@Autowired
	StudentDao dao;

	public String insertData(StudentEntity s) {

		String msg = dao.insertData(s);
		return msg;
	}

	public String deleteData(int id) {

		String msg = dao.deleteData(id);
		return msg;
	}

	public String updatedata(StudentEntity s, int id) {

		String msg = dao.updateData(s, id);
		return msg;
	}

	public StudentEntity getSingleData(int id) {
		StudentEntity s2 = dao.getSingleData(id);
		return s2;
	}

	public List<StudentEntity> getAllRecord(StudentEntity s) {
		List<StudentEntity> list = dao.getAllData(s);
		return list;
	}
}
