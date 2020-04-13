package com.cg.lab3;

import java.util.List;

public class Empl {
	List employeelist;

	public List getEmployeelist() {
		System.out.println("employee"+ employeelist);
		return employeelist;
	}

	public void setEmployeelist(List employeelist) {
		this.employeelist = employeelist;
	}

}