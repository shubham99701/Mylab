package com.cg.lab3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
	     
	      ApplicationContext context1 = new ClassPathXmlApplicationContext("Beans2.xml");
	      sbu s=(sbu) context1.getBean("sbu");
	      ApplicationContext context = new ClassPathXmlApplicationContext("Beans3.xml");
	      Empl e = (Empl) context.getBean("employee");
	      System.out.println("sbu detail\n------------------");
	      System.out.println("sbu Code="+s.getSbuID()+", Sbu Head="+ s.getSbuName()+", Sbu Name="+s.getSbuHead());
        System.out.println("employee detail\n---------------");
        e.getEmployeelist();
	   }

}
