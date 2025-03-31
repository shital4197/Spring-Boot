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

import com.tka.entity.Employee;
import com.tka.service.EmplyeeService;

@RestController
@RequestMapping(value = "/employeeinfo")
public class EmployeeController {

	@Autowired
	EmplyeeService service;

	@PostMapping("/savedata")
	public String insertData(@RequestBody Employee e) {
		String msg = service.insertData(e);
		return msg;
	}

	@DeleteMapping("/deletedata/{id}")
	public String deleteData(@PathVariable int id) {
		String msg = service.deleteData(id);
		return msg;
	}

	@PutMapping("/updatedata/{id}")
	public String updateData(@RequestBody Employee e, @PathVariable int id) {
		String msg = service.updateData(e, id);
		return msg;
	}

	@GetMapping("/getsingledata")
	public Employee getSingleData(@RequestParam int id) {
		Employee v = service.getsingleData(id);
		return v;
	}

	@GetMapping("/getalldata")
	public List<Employee> getallData(Employee e) {
		List<Employee> list = service.getallData(e);
		return list;
	}

}
