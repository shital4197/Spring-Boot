package com.tka.service;

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
}
