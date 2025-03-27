package com.tka.SpringDemo;

import java.net.Authenticator.RequestorType;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.fasterxml.jackson.annotation.JacksonInject.Value;

@RestController
@RequestMapping(value="/MakeMyTrip")
public class MyCotroller {

	// Make my trip web  API  

	@RequestMapping(value = "/fligth", method = RequestMethod.GET)
	public String firstMethod() {
		return " Filgths booking ..!";
	}

	@RequestMapping(value = "/train", method = RequestMethod.POST)
	public String secondMethod() {
		return " train booking ..!";
	}

	@RequestMapping(value = "/bus", method = RequestMethod.PUT)
	public String thirdMethod() {
		return " bus booking ..!";
	}

	@RequestMapping(value = "/cabs", method = RequestMethod.DELETE)
	public String fourthMethod() {
		return " cab booking ..!";
	}

	// Mapping method

	@GetMapping("/metro")
	public String fifthMethod() {
		return " metro booking ..!";
	}

	@PostMapping("/hotels")
	public String sixthhMethod() {
		return " hotel booking ..!";
	}

	@PutMapping("/alloffers")
	public String seventhMethod() {
		return " All offers are here ..!";
	}

	@DeleteMapping("/payment")
	public String eigthMethod() {
		return "here is paymenets ..!";
	}

}
