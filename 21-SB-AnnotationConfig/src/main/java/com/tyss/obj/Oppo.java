package com.tyss.obj;

import org.springframework.stereotype.Component;

@Component
public class Oppo implements Mobile {

	@Override
	public void call() {
		System.out.println("Oppo Mobile is Getting Call");
	}

}
