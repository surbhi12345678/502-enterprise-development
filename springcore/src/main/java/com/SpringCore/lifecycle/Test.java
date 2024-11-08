package com.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	private static AbstractApplicationContext context;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/config.xml");
		department dp = (department) context.getBean("d1");
		System.out.println(dp);
		
		System.out.println("-----------------------");
		emp e1 = (emp)context.getBean("e1");
		System.out.println(e1);
		context.registerShutdownHook();
	
	}

}
