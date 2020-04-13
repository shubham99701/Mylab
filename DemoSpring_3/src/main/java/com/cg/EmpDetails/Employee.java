package com.cg.EmpDetails;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
	private int id;
	private  String name;
	private float salary;
	private String BU;
	private int age;
	private SBU sbu;
	
//	public Employee(int id, String name, float salary, String bU, int age) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.salary = salary;
//		this.BU = bU;
//		this.age = age;
//	}
	
	public Employee(int age, int id, String name, float salary,SBU sbu) {
		super();
		this.age = age;
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.sbu=sbu;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public String getBU() {
		return BU;
	}
	public void setBU(String bU) {
		BU = bU;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public SBU getSbu() {
		return sbu;
	}
	@Autowired
	public void setSbu(SBU sbu)
	{
		this.sbu=sbu;
	}

}