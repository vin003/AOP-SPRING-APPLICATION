package com.durgasoft.advice;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

import com.durgasoft.beans.Student;

public class ThanqAdvice implements AfterReturningAdvice {

	@Override
	public void afterReturning(Object returnvalue, Method method, Object[] params, Object target) throws Throwable {
	Student std  = (Student) params[0];
	String course_Name = (String) params[1] ; 
	
		System.out.println("********************************************************************** ");
		System.out.println("Thanq "+std.getSname()+" for the enquiry with us for the course "+course_Name);
		System.out.println("Durgasoft Team will contact you shortly on your mobile "+std.getSmobile());		
		System.out.println("********************************************************************** ");
		System.out.println();
		

	}

}
