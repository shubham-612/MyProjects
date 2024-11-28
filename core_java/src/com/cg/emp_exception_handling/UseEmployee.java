package com.cg.emp_exception_handling;

public class UseEmployee {
	
	public static void main(String[] args) {
		
		int x = 6;
		try
		{
			Employee.salary(x);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Low balance");
		}
		
	}
}
