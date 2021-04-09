package com.durgasoft.service;

import com.durgasoft.beans.Movie;

public class MovieServiceImpl implements MovieService {

	@Override
	public void playMovie(Movie movie) {
		
		System.out.println("Movie Details");
		System.out.println("----------------------------------");
		System.out.println("Movie Name                         : "+movie.getMovie_Name());
		System.out.println("Show Timings                       : "+movie.getShow_Timing());
		System.out.println("Ticket price                       : "+movie.getPrice());
		System.out.println();
		throw new RuntimeException("Power Failure Exception") ;
		
		

	}

}
