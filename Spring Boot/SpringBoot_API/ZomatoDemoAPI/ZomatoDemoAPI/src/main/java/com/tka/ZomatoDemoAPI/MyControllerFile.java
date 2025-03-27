package com.tka.ZomatoDemoAPI;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/zomato")
public class MyControllerFile {

	// Zomato web API

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String loginApi() {
		return "Login Successfully...";
	}

	@RequestMapping(value = "/order", method = RequestMethod.POST)
	public String orderApi() {
		return "Your order is here...";
	}

	@RequestMapping(value = "/cupan", method = RequestMethod.PUT)
	public String cupanApi() {
		return "Cupan is here...";
	}

	@RequestMapping(value = "/menu", method = RequestMethod.DELETE)
	public String menuApi() {
		return "Your Menu...";
	}

	// mapping method

	@GetMapping("/rating")
	public String ratingApi() {
		return " Rating ....";
	}

	@PostMapping("/review")
	public String reviewApi() {
		return " Reviews is here...";
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
