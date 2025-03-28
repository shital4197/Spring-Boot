package com.tka.service;

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
}
