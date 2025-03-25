package com.tka;

import org.springframework.stereotype.Component;

@Component("CashPayment")
public class CashPayment implements Payment {

	@Override
	public String myPayment() {
		return "Cash Payment Successful..!";
	}

}
