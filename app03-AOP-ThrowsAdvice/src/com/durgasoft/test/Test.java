package com.durgasoft.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.durgasoft.beans.Movie;
import com.durgasoft.service.MovieService;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context= new ClassPathXmlApplicationContext("/com/durgasoft/resources/applicationContext.xml");
		Movie movie =(Movie)context.getBean("movieBean");
		
		MovieService movieService = (MovieService)context.getBean("movieProxy");
		
		try {
			movieService.playMovie(movie);	
		} catch (Exception e) {
		
		}

	}

}
