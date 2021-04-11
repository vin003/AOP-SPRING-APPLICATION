package com.durgasoft.service;

import com.durgasoft.beans.Show;

public class ShowServiceImpl implements ShowService {

	@Override
	public String runShow(Show show) throws RuntimeException {

		System.out.println("SHow >>>>>>" + show.getName() +" started ");
		System.out.println("Show >>>>>>>>>>>>" + show.getName() + " running sucessfully. ");
		if (! show.getName().equalsIgnoreCase("Mimicry"))
				{
				throw new RuntimeException() ; 
				}
		
		System.out.println("Show >>>>>>>>>>>" + show.getName() + "end");
		return "success" ; 
	}

}
	