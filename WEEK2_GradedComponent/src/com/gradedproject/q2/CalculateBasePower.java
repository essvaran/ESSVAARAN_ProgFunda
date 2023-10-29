package com.gradedproject.q2;

//program to find the value of X(base) power N(power value) --> Using recursion

import java.util.Scanner;

public class CalculateBasePower 
{
	
	//method to find the value of X(base) power N
	public static int calculatePowerValue(int x,int n)
	{
		
		if(n!=0)
		{
			return x*calculatePowerValue(x,n-1);
		}
		else
		{
			return 1;
		}
	}

	public static void main(String[] args)
	{

		Scanner inp = new Scanner(System.in);
		
		//Getting inputs from user of base and power value
		System.out.print("Enter the base value : ");
		int base=inp.nextInt();
		System.out.print("Enter the base value : ");
		int power=inp.nextInt();
		
		//calling the recursion function
		int result=calculatePowerValue(base,power);
		
		//Printing the result value
		System.out.printf("The value of %d power %d (%d^%d) is %d.",base,power,base,power,result);
		
		//Closing the Scanner object
		inp.close();
		
	}

}
