package com.tka.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.dao.VehicleDao;
import com.tka.entity.Vehicle;

@Service
public class VehicleService {

	@Autowired
	VehicleDao dao;

	public String insertData(Vehicle vehicle) {

		String msg = dao.insertData(vehicle);
		return msg;
	}

	public String deleteData(int id) {
		String msg = dao.deleteData(id);
		return msg;
	}

	public String updateData(Vehicle vehicle, int id) {
		String msg = dao.updateData(vehicle, id);
		return msg;
	}

	public Vehicle getSingleData(int id) {
		Vehicle v = dao.getSingleData(id);
		return v;
	}

	public List<Vehicle> getAllRecord(Vehicle v) {
		List<Vehicle> list = dao.getAllData(v);
		return list;
	}
}
