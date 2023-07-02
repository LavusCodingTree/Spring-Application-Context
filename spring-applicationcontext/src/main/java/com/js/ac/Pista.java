package com.js.ac;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class Pista  implements IceCream{

	@Override
	public void eat() {
		System.out.println("Eating Pista");
		
	}

}
