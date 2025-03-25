package com.tka;

import org.springframework.stereotype.Component;

@Component("OnlinePayment")
public class OnlinePayment implements Payment {

	@Override
	public String myPayment() {
		return "Online Payment Successfuly !";
	}

}
