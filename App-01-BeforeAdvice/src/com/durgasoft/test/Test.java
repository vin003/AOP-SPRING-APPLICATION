package com.durgasoft.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.durgasoft.beans.Employee;
import com.durgasoft.service.EmployeeService;
import com.durgasoft.service.EmployeeServiceImpl;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/durgasoft/resources/applicationContext.xml") ;
		Employee emp = (Employee) context.getBean("empBean");
		
		EmployeeService empService = (EmployeeService) context.getBean("empProxy");
		empService.getEmployees(emp);
		empService.display(emp);
		

	}

}
