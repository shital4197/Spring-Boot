package com.tka.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tka.entity.StudentEntity;
import com.tka.service.StudentService;

@RestController
@RequestMapping(value="/studentinfo")
public class StudentController {
	
	@Autowired
	StudentService service;
	
	@PostMapping("/savedata")
	public String insertData(@RequestBody StudentEntity s) {
		String msg = service.insertData(s);
		return msg;
	}
	
	@DeleteMapping("/deletedata/{id}")
//	public String deleteData(@PathVariable int id ) {
	public String deleteData(@PathVariable int id) {
		String msg = service.deleteData(id);
		return msg;
	}
	
	@PutMapping("/update/{id}")
	public String updateData(@RequestBody StudentEntity s, @PathVariable int id) {
		String msg = service.updatedata(s, id);
		return msg;
	}
}
