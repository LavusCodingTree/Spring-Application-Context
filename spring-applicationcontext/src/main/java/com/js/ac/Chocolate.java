package com.js.ac;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary  //Use to give which class is need to execute
public class Chocolate implements IceCream{

	@Override
	public void eat() {
		System.out.println("Eating Chocolate IceCream");
		
	}

}
