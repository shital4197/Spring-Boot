package com.tka;

import org.springframework.stereotype.Component;

@Component("Airtel")
public class Airtel implements Sim{

	@Override
	public String myCalling() {
		
		return "You are calling Airtel sim!";
	}

}
