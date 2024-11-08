package com.SC.Exam;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("com/SC/Exam/config.xml");
		Questions q = (Questions) context.getBean("que");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
//		print the question
		System.out.println(q.getQuestion());
//		Print Options
		for (int i=0; i < q.getOptions().size(); i++) {
			System.out.println(q.getOptions().get(i));
		}
		System.out.print("Your Answer: ");
		String ans = sc.next();
		if (ans.equals("1991")) {
			System.out.println("Correct");
		}else {
			System.out.println("InCorrect");
		}
	}

}
