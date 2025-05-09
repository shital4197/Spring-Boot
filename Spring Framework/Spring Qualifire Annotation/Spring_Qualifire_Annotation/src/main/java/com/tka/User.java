package com.tka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class User {

	@Qualifier("Airtel")
	@Autowired
	private Sim sim1;
	
	@Qualifier("Jio")
	@Autowired
	private Sim sim2;

	public Sim getSim1() {
		return sim1;
	}

	public void setSim1(Sim sim1) {
		this.sim1 = sim1;
	}

	public Sim getSim2() {
		return sim2;
	}

	public void setSim2(Sim sim2) {
		this.sim2 = sim2;
	}

	@Override
	public String toString() {
		return "User [sim1=" + sim1 + ", sim2=" + sim2 + "]";
	}

}
