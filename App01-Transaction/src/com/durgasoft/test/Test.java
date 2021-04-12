package com.durgasoft.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.durgasoft.dao.TransactionService;

public class Test {

	public static void main(String[] args) {
	
		
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/durgasoft/resources/applicationContext.xml");
		TransactionService transactionDao = (TransactionService)context.getBean("transactionDao");
		String status = transactionDao.transaction("abc123", "uuu123", 5000);
		System.out.println("New Status ==>>>>>>>>>>>>>>>>>>>>>>>>>>>> " + status);
		

	}

}
