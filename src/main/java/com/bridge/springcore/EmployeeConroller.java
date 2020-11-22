package com.bridge.springcore;

import org.springframework.context.ApplicationContext;

import com.bridge.springcore.config.SpringConfig;
import com.bridge.springcore.model.Employee;
import com.bridge.springcore.service.EmployeeService;

public class EmployeeConroller {
	
	private EmployeeService employeeService;
	private ApplicationContext factory;
	
	{
		factory = SpringConfig.getApplicationContext();
		employeeService = (EmployeeService) factory.getBean("employeeService1");
		System.out.println(employeeService);
	}
    
    public void getEmployeeDetails() {
    	employeeService.getEmployeeDetails();
    }
    
    public void displayEmployeeDetails() {
    	Employee employee = new Employee();
        employee.setId("10");
        employee.setName("Jayesh");
    	employeeService.displayEmployeeDetails(employee);
    }
}
