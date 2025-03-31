package com.tka.cntroller;

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
import com.tka.entity.Hospital;
import com.tka.service.HospitalService;

@RestController
@RequestMapping(value = "/hospitalinfo")
public class HospitalController {

	@Autowired
	HospitalService service;

	@PostMapping("/savedata")
	public String insertData(@RequestBody Hospital h) {
		String msg = service.insertData(h);
		return msg;
	}

	@DeleteMapping("/deletedata/{id}")
//	public String deleteData(@RequestParam int id ) {
	public String deleteData(@PathVariable int id) {
		String msg = service.deleteData(id);
		return msg;
	}

	@PutMapping("/updatedata/{id}")
	public String updateData(@RequestBody Hospital h, @PathVariable int id) {
		String msg = service.updatedata(h, id);
		return msg;
	}

	@GetMapping("/getsingledata")
	public Hospital getSingleData(@RequestParam int id) {
		Hospital h1 = service.getsingleData(id);
		return h1;
	}

	@GetMapping("/getalldata")
	public List<Hospital> getallData(Hospital h) {
		List<Hospital> list = service.getalldata(h);
		return list;
	}

}
