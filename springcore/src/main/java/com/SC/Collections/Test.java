package com.SC.Collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	private static ApplicationContext context;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		context = new ClassPathXmlApplicationContext("com/SC/Collections/config.xml");
		Employee e = (Employee) context.getBean("emp");
		System.out.println(e.getName());
		System.out.println(e.getPhone());
		System.out.println(e.getAddress());
		System.out.println(e.getCourses());
	}

}
