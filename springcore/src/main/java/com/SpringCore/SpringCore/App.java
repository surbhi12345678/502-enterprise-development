package com.SpringCore.SpringCore;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * Hello world!
 *
 */
public class App 
{
	private static ApplicationContext context1;
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        context1 = new ClassPathXmlApplicationContext("config.xml");
        Student s1 = (Student) context1.getBean("stud");
        System.out.println(s1);
    }
}
