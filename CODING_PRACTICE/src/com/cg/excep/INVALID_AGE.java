package com.cg.excep;
import java.util.Scanner;

@SuppressWarnings("serial")
class InvalidAgeException extends Exception {
	public InvalidAgeException(String message) {
		super(message);
	}
}
/*
Create a custom exception class InvalidAgeException that is thrown 
when the user tries to enter an age less than 18 or greater than 100.
*/ 
public class INVALID_AGE {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		try
		{
			System.out.println("Enter the age.");
			int age = sc.nextInt();
			if(age>18 && age<100)
			{
				System.out.println("Valid age");
			}
			else
			{
				throw new InvalidAgeException("Enter valid age");
			}
		}
		catch(InvalidAgeException e)
		{
			System.out.println(e.getMessage());
		}
		sc.close();
	}

}