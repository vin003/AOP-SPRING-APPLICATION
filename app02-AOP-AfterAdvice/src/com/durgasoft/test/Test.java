package com.durgasoft.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.durgasoft.beans.Student;
import com.durgasoft.service.InstituteService;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/durgasoft/resources/applicationContext.xml") ;
		
		Student student= (Student )context.getBean("student");
		
		InstituteService instituteService = (InstituteService)context.getBean("stdProxy");
				instituteService.enquiry(student, "JAVA");
				instituteService.registration(student, "JAVA");
	}

}
