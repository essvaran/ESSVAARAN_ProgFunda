package com.gradedproject.q1;

public class TechDepartment extends SuperDepartment
{

	//method to return the department name
	@Override
	String departmentName()
	{
		return "Tech Deparment.";

	}

	//method to return todays work
	@Override
	String getTodaysWork()
	{
		return "Complete coding of module 1.";

	}

	//method to return work deadline
	@Override
	String getWorkDeadline()
	{
		return "Complete by EOD.";
	}

	//method to return the team activity
	String getTechStackInformation()
	{
		return "Core Java.";
	}
	
}
