package com.durgasoft.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.durgasoft.beans.Account;
import com.durgasoft.beans.Cheque;
import com.durgasoft.service.TransactionService;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context= new ClassPathXmlApplicationContext("/com/durgasoft/resources/applicationContext.xml");
		Account acc = (Account) context.getBean("account");
		Cheque cheque  = (Cheque) context.getBean("cheque");
		
		TransactionService trxn_service = (TransactionService)context.getBean("proxy");
		trxn_service.debit(acc, cheque);

	}

}
