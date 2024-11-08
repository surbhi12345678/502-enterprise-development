package com.SC.CI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("com/SC/CI/config.xml");
		Employee e1 = (Employee) context.getBean("emp");
		System.out.println(e1);
	}

}
