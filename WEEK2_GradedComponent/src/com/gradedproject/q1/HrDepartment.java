package com.gradedproject.q1;

public class HrDepartment extends SuperDepartment
{

	//method to return the department name
	@Override
	String departmentName()
	{
		return "HR Deparment.";

	}

	//method to return todays work
	@Override
	String getTodaysWork()
	{
		return "Fill todays timesheet and mark your attendence.";

	}

	//method to return work deadline
	@Override
	String getWorkDeadline()
	{
		return "Complete by EOD.";
	}
	
	//method to return the team activity
	String doActivity()
	{
		return "Team Lunch.";
	}
	
}
