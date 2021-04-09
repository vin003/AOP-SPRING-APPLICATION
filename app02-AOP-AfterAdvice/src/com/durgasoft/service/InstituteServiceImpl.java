package com.durgasoft.service;




import com.durgasoft.beans.Student;

public class InstituteServiceImpl implements InstituteService {

	
	/*ProxyFactoryBean*/
	@Override
	public void enquiry(Student std, String course_Name) {
				System.out.println("Student Enquiry Details");
				System.out.println("-----------------------------");
				System.out.println("Student Name                          : "+std.getSname());
				System.out.println("Student Qualification                 : "+std.getSqual());
				System.out.println("Student Mobile                        : "+std.getSmobile());
				System.out.println("Student EMail                         : "+std.getSemail());
				System.out.println("Course Details                        : "+ course_Name);
		


	}

	@Override
	public void registration(Student std, String course_Name) {
		System.out.println("Student Registration Details");
		System.out.println("-----------------------------");
		System.out.println("Student Name                          : "+std.getSname());
		System.out.println("Student Qualification                 : "+std.getSqual());
		System.out.println("Student Mobile                        : "+std.getSmobile());
		System.out.println("Student EMail                         : "+std.getSemail());
		System.out.println("Course Details                        : "+ course_Name);


	}

}
