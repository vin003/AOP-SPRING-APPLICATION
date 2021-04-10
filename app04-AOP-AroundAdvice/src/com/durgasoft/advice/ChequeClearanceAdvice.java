package com.durgasoft.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.core.env.SystemEnvironmentPropertySource;

import com.durgasoft.beans.Account;
import com.durgasoft.beans.Cheque;

public class ChequeClearanceAdvice implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation mi) throws Throwable {
		Object[] params = mi.getArguments() ; 
		Account acc  =(Account) params[0];
		Cheque cheque = (Cheque) params[1] ; 
		
		System.out.println("Hello "+acc.getAccHolderName() + "We have recieved a Cheuqe NO.>>>>>>>>>>>"+cheque.getCheque_No()+"\n" + "for debit from your account" + acc.getAccNo() +"for amount" + cheque.getAmount());
		System.out.println();
		mi.proceed() ;
		
		System.out.println("Hello "+acc.getAccHolderName() +"debit for the amount>>>>>>"+ cheque.getAmount() +"\n has been completed sucesfully for the cheque No" + cheque.getCheque_No());
		System.out.println();
		return null;
	}

}
