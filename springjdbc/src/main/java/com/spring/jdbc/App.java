package com.spring.jdbc;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entities.Student;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
		StudentDao studentDao = (StudentDao) context.getBean("studentDao");
		Scanner sc = new Scanner(System.in);
		
		// insert
//        Student student = new Student();
//        student.setId(110);
//        student.setName("Akshu");
//        student.setCity("Sangli");
//        int result = studentDao.insert(student);

		// update
//        Student student2 = new Student();
//        student2.setId(6);
//        student2.setName("Akash");
//        int result = studentDao.change(student2);

		// delete
//		System.out.print("Enter id = ");
//		int id = sc.nextInt();
//		int result = studentDao.delete(id);

		//get student with id
//		Student student = studentDao.getStudent(7);
		
//		get all students 
		List<Student> allStudents = studentDao.getAllStudents();
		System.out.println(allStudents);
	}
}
