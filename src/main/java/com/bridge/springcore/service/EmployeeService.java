package com.bridge.springcore.service;


import java.util.List;

import com.bridge.springcore.model.Employee;

public class EmployeeService {
	
	private String name;
	private List<String> zipCode;
	
	public EmployeeService() {}
	
	public EmployeeService(String name,List<String> zipCode) {
		System.out.println("Parameterized constructor has called");
		this.name = name;
		this.zipCode = zipCode;
	}
	
	public void displayEmployeeDetails(Employee employee) {
		System.out.println(employee);
	}

	public void getEmployeeDetails() {
		System.out.println("get details");
	}

	public void getSalary() {
		System.out.println("salary method");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getZipCode() {
		return zipCode;
	}

	public void setZipCode(List<String> zipCode) {
		this.zipCode = zipCode;
	}
	
}
