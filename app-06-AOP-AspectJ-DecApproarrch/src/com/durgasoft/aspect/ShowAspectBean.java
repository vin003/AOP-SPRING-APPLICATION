package com.durgasoft.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

import com.durgasoft.beans.Show;

public class ShowAspectBean {
	
	public void before()
	{
		System.out.println("Get tickets for the show ");
	}
		
	public void after()
	{
		System.out.println("Show is Qver   Quit the Hall *");
	}
	public void afterReturning()
	{
	System.out.println("ThanQ for attending the show");	
	}
	public void around(ProceedingJoinPoint pjp)
	{
		System.out.println("SHow is ready to start , tke chairs and keep mobiles on silent mode");
		try {
			pjp.proceed() ;
		} catch (Throwable e) {
		
			e.printStackTrace();
		} 
		
		System.out.println("Show is completed just now , Please check your luggages .") ; 
		
	}
	public void afterThrowing()
	{
	System.out.println("There is an interrupt in a show, Show is not 'Mimicry' show");	
	}
}
