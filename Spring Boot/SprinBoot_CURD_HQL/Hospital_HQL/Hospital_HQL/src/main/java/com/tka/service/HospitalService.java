package com.tka.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tka.dao.HospitalDao;
import com.tka.entity.Hospital;

@Service
public class HospitalService {

	@Autowired
	HospitalDao dao;

	public String insertData(Hospital h) {

		String msg = dao.insertData(h);
		return msg;
	}

	public String deleteData(int id) {

		String msg = dao.deleteData(id);
		return msg;
	}

	public String updatedata(Hospital h, int id) {
		String msg = dao.updataData(h, id);
		return msg;
	}

	public Hospital getsingleData(int id) {
		Hospital msg = dao.getsingleData(id);
		return msg;
	}

	public List<Hospital> getalldata(Hospital h) {

		List<Hospital> msg = dao.getallData(h);
		return msg;
	}

}
