package com.durgasoft.service;

import org.springframework.aop.support.NameMatchMethodPointcut;

import com.durgasoft.beans.Employee;

public class EmployeeServiceImpl implements EmployeeService {
		 //NameMatchMethodPointcut
	@Override
	public void getEmployees(Employee emp) {
			System.out.println("Employe Details from 'getEmployeeDetails()' method ");
			/*System.out.println("*****Employee No must be thre digit ***** ");*/
			System.out.println("Employee  No.             : "+emp.getEno());
			System.out.println("Employee Name             : "+emp.getEname());
			System.out.println("Employee Salary           : "+emp.getEsal());
			System.out.println("Employee Address          : "+emp.getEaddr());
			System.out.println("Employee Mobile           : "+emp.getEmobile());
			System.out.println("Employee Email            : "+emp.getEmail());
			System.out.println();
 
	}

	@Override
	public void display(Employee emp) {
		System.out.println("Employe Details from 'displayDetails()' method ");
		System.out.println("-----------------------------------------------------");
		System.out.println("Employee  No.             : "+emp.getEno());
		System.out.println("Employee Name             : "+emp.getEname());
		System.out.println("Employee Salary           : "+emp.getEsal());
		System.out.println("Employee Address          : "+emp.getEaddr());
		System.out.println("Employee Mobile           : "+emp.getEmobile());
		System.out.println("Employee Email            : "+emp.getEmail());
		System.out.println();

	}

}
