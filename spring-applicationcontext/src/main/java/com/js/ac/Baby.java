package com.js.ac;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Baby {

	@Autowired
	@Qualifier(value = "pista") // used to give which class is need to execute
	IceCream cream;

	public void cry() {
		System.out.println("Baby is Crying");
	}

}
