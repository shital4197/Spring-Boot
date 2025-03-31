package com.tka.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tka.entity.Vehicle;
import com.tka.service.VehicleService;

@RestController
@RequestMapping(value = "/vehicleinfo")
public class VehicleController {

	@Autowired
	VehicleService service;

	@PostMapping("/savedata")
	public String insertData(@RequestBody Vehicle v) {
		String msg = service.insertData(v);
		return msg;
	}

	@DeleteMapping("/deletedata/{id}")
//	public String deleteData(@RequestParam int id ) {
	public String deleteData(@PathVariable int id) {
		String msg = service.deleteData(id);
		return msg;
	}

	@PutMapping("/updatedata/{id}")
	public String updateData(@RequestBody Vehicle vehicle, @PathVariable int id) {
		String msg = service.updateData(vehicle, id);
		return msg;
	}

	@GetMapping("/getsingledata")
	public Vehicle getSingleData(@RequestParam int id) {
		Vehicle v = service.getSingleData(id);
		return v;
	}

	@GetMapping("/getalldata")
	public List<Vehicle> getallData(Vehicle v) {
		List<Vehicle> list = service.getAllRecord(v);
		return list;
	}

}
