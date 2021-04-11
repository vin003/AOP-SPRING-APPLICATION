package com.durgasoft.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.durgasoft.beans.Show;
/*import com.durgasoft.service.EmployeeService;*/
import com.durgasoft.service.ShowService;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context= new ClassPathXmlApplicationContext("/com/durgasoft/resources/applicationContext.xml");
		
		Show showBean = (Show) context.getBean("showBean");
		
		ShowService empService = (ShowService) context.getBean("showService");
		
		String message ="";
		try {
			
			message = empService.runShow(showBean);
		} catch (Exception e) {
			
		}
		System.out.println(message);
	}

}
