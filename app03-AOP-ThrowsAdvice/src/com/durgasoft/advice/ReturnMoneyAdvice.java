package com.durgasoft.advice;

import java.lang.reflect.Method;

import org.springframework.aop.ThrowsAdvice;

import com.durgasoft.beans.Movie;

public class ReturnMoneyAdvice implements ThrowsAdvice {
	
	public void ThrowsAdvice(Method method ,Object[] params , Object target , Exception e)
	{
		Movie movie = (Movie)params[0];
		System.out.println("*********************D I S C L A I M  E R **************************************************");
		System.out.println("Power Failure Occured, Those of you viewers bought ticket for the movie \n"
			+movie.getMovie_Name()	+ "can come to the 'Counter' and Collect their Money");
		
		System.out.println("******************************************************************************************");
		
	}

}
