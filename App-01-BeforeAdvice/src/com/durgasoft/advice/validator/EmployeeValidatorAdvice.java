package com.durgasoft.advice.validator;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.framework.ProxyFactoryBean;
import org.springframework.aop.support.DefaultPointcutAdvisor;

import com.durgasoft.beans.Employee;

public class EmployeeValidatorAdvice implements MethodBeforeAdvice
{
	/*DefaultPointcutAdvisor*/
//ProxyFactoryBean
	@Override
	public void before(Method method, Object[] params, Object target) throws Throwable {
		Employee emp = (Employee) params[0]; // busineed method paramter check notes for clarity
		if (emp.getEno() > 999 &&  emp.getEno() < 100)
			{System.out.println("****************Employee Id must be a three digit number......"); }
		 if (emp.getEsal() > 50000)
			{System.out.println("**********Salary must be in range of 20000 and 50000"); } 
		 if (!emp.getEmobile().startsWith("91-"))
			System.out.println("**********Incorrect Mobile no *********");
		if (!emp.getEmail().endsWith("@dss.com"))
			System.out.println("Email address is not proper******8");
		
		
	}
	
	

}
