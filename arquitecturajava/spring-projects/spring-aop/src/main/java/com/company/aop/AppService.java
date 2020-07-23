package com.company.aop;

import org.springframework.stereotype.Component;

@Component()
public class AppService {
	
	public void message() {
		System.out.println("Hello Spring Master!");
	}

}
