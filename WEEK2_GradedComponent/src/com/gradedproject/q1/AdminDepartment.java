package com.gradedproject.q1;

public class AdminDepartment extends SuperDepartment
{

	//method to return the department name
	@Override
	String departmentName()
	{
		return "Admin Deparment.";

	}

	//method to return todays work
	@Override
	String getTodaysWork()
	{
		return "Complete your documents submission.";

	}

	//method to return work deadline
	@Override
	String getWorkDeadline()
	{
		return "Complete by EOD.";
	}
	
}
