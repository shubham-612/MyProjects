package com.cg.myexception;

public class ThrowExcep {
	
	public static void main(String[] args)
	{
		int age = 20;
		try
		{
			checkage(age);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Underage");
		}
	}
	
	// STATIC METHOD CAN'T CALL A NON STATIC METHOD
	public static void checkage(int x) throws ArithmeticException // THROWS -> DECLARING THE EXCEPTION
	{
		if(x<18)
		{
			throw new ArithmeticException(); // THROW -> CREATE AN ARITHMETIC / EXCEPTION OBJECT
			// WE CAN ALSO PASS A MESSAGE INSIDE () IN ABOVE STATEMENT
		}
		else
		{
			System.out.println("Adult");
		}
	}
}