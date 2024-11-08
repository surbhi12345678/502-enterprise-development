package com.SC.Stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
 public static void main(String[] args) {
	
	 @SuppressWarnings("resource")
	ApplicationContext context =new ClassPathXmlApplicationContext("com/SC/Stereotype/config.xml");
	 Student s1=context.getBean("student", Student.class);
	 System.out.println(s1); 
	 }

}

