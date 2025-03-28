package com.tka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tka.entity.Vehicle;
import com.tka.service.VehicleService;

@RestController
public class VehicleController {

	@Autowired
	VehicleService service;

	@PostMapping("/savedata")
	public String insertData(@RequestBody Vehicle vehicle) {
		String msg = service.insertData(vehicle);
		return msg;
	}
}
