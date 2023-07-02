package com.js.ac;

import org.springframework.stereotype.Component;

@Component(value = "b")
public class Bike {

	public void start() {
		System.out.println("Bike Is Started");
	}
}
