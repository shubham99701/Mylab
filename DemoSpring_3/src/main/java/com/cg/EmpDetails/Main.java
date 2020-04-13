package com.cg.EmpDetails;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
		Employee objA = (Employee) context.getBean("employee");
//		System.out.println( "Employee Id : "+objA.getId());
//	    System.out.println("Employee Name : "+objA.getName());
//	    System.out.println("Employee Salary : "+objA.getSalary());
//	    System.out.println("Employee BU : "+objA.getBU());
//	    System.out.println("Employee Age : "+objA.getAge());
		
		System.out.println("Employee [empAge="+objA.getAge()+" ,empId="+objA.getId()+" ,empName="+objA.getName()+" ,empSalary="+objA.getSalary()+"]");
		System.out.println("SBU Details=SBU [sbuCode="+objA.getSbu().getSbuCode()+", sbuHead="+objA.getSbu().getSbuHead()+", sbuName="+objA.getSbu().getSbuName()+"]");}
}