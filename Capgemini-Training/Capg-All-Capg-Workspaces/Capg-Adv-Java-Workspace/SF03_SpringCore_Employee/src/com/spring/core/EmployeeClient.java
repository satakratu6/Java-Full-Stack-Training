package com.spring.core;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.core.EmployeeService;

public class EmployeeClient {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		EmployeeService p1 = (EmployeeService) factory.getBean("employeeService1");
		p1.allEmployees();
		
		EmployeeService p2 = (EmployeeService) factory.getBean("employeeService2");
		p2.allEmployees();
	}
}
