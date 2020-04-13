package com.cg.lab1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans1.xml");
		Emp obj =  (Emp) context.getBean("Employee");
		System.out.println( "Employee Id : "+obj.getId());
	    System.out.println("Employee Name : "+obj.getName());
	    System.out.println("Employee Salary : "+obj.getSalary());
	    System.out.println("Employee BU : "+obj.getBU());
	    System.out.println("Employee Age : "+obj.getAge());
	}

}