package com.company.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectLog {
	
	@Before("execution (* message())")
	public void called() {
		System.out.println("Method called");
	}
	
	@After("execution (* message())")
	public void finish() {
		System.out.println("Method finished");
	}
	
}
