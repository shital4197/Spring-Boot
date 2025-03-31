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
import com.tka.entity.Library;
import com.tka.service.LibraryService;

@RestController
@RequestMapping(value = "/libraryinfo")
public class LibraryController {

	@Autowired
	LibraryService service;

	@PostMapping("/savedata")
	public String insertData(@RequestBody Library l) {
		String msg = service.insertData(l);
		return msg;
	}

	@DeleteMapping("/deletedata/{id}")
	public String deleteData(@PathVariable int id) {
		String msg = service.deleteData(id);
		return msg;
	}

	@PutMapping("/update/{id}")
	public String updateData(@RequestBody Library l, @PathVariable int id) {
		String msg = service.updatedata(l, id);
		return msg;
	}

	@GetMapping("/getsingledata")
	public Library getSingleData(@RequestParam int id) {
		Library l1 = service.getSingleData(id);
		return l1;
	}

	@GetMapping("/getalldata")
	public List<Library> getallData(Library l) {
		List<Library> list = service.getAllRecord(l);
		return list;
	}

}
