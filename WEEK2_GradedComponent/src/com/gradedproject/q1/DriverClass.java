package com.gradedproject.q1;

public class DriverClass 
{

	public static void main(String[] args) 
	{

		//creating objects for all the department
		AdminDepartment admin = new AdminDepartment();
		HrDepartment hr = new HrDepartment();
		TechDepartment tech = new TechDepartment(); 
		
		//printing admin department details
		System.out.println("Welcome to "+admin.departmentName());
		System.out.println(admin.getTodaysWork());
		System.out.println(admin.getWorkDeadline());
		System.out.println(admin.isTodayAHoliday());
		System.out.println("---------------------------------------"+"\n");
		
		//printing HR department details
		System.out.println("Welcome to "+hr.departmentName());
		System.out.println(hr.doActivity());
		System.out.println(hr.getTodaysWork());
		System.out.println(hr.getWorkDeadline());
		System.out.println(hr.isTodayAHoliday());
		System.out.println("---------------------------------------"+"\n");
		
		//printing Technical department details
		System.out.println("Welcome to "+hr.departmentName());
		System.out.println(tech.getTodaysWork());
		System.out.println(tech.getWorkDeadline());
		System.out.println(tech.getTechStackInformation());
		System.out.println(tech.isTodayAHoliday());


	}

}
