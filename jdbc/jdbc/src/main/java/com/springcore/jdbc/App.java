package com.springcore.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.jdbc.dao.StudentDao;
import com.springcore.jdbc.entities.Student;

public class App 
{
    public static void main( String[] args )
    {
        @SuppressWarnings("resource")
        ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/jdbc/config.xml");
        StudentDao studentDao = context.getBean("StudentDao", StudentDao.class);

        // Insert operation
        // Student student = new Student(2, "Ajin", "Kerela");
        // int insertResult = studentDao.insert(student);
        // System.out.println("Inserted " + insertResult + " rows");

        // Update operation
        // Student updatedStudent = new Student(103, "Raj Kumar", "Delhi");
        // int updateResult = studentDao.update(updatedStudent);
        // System.out.println("Updated " + updateResult + " rows");

        // Delete operation
        // int deleteResult = studentDao.delete(103);
        // System.out.println("Deleted " + deleteResult + " rows");

        // Get operation
        // Student student1 = studentDao.getStudent(1);
        // System.out.println(student1);

        // // fetching all students
        List<Student> students = studentDao.getAllStudents();
        System.out.println(students);
        
    }
}
