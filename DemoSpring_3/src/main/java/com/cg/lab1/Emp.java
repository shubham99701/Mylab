package com.cg.lab1;

public class Emp {
	private int id;
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

	private  String name;
	private float salary;
	private String BU;
	private int age;
	
	public Emp(int id, String name, float salary, String bU, int age) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.BU = bU;
		this.age = age;
	}


}