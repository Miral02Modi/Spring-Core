package com.bridge.springcore;

import org.springframework.context.ApplicationContext;

import com.bridge.springcore.config.SpringConfig;
import com.bridge.springcore.model.Employee;
import com.bridge.springcore.service.EmployeeService;

/**
 * Hello world!
 *
 */
public class App 
{
	private EmployeeService employeeService;
	private ApplicationContext factory;
	
	{
		factory = SpringConfig.getApplicationContext();
		employeeService = (EmployeeService) factory.getBean("employeeService1");
		System.out.println(employeeService);
	}
	
    public static void main( String[] args )
    {
    	
    	App app = new App();
    	app.getEmployeeDetails();
    	
    	EmployeeConroller conroller = new EmployeeConroller();
    	conroller.getEmployeeDetails();
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
