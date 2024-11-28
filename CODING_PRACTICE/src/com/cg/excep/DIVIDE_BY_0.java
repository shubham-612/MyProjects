package com.cg.excep;
import java.util.Scanner;
/*
Write a program that takes two integers, 
divides the first by the second, and handles the case 
where the second integer is zero by throwing an ArithmeticException.
*/
public class DIVIDE_BY_0 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter the value of a");
			int a = sc.nextInt();
			System.out.println("Enter the value of b");
			int b = sc.nextInt();
			
			System.out.println(a/b);
		}
		catch(Exception e)
		{
			System.out.println("Division by 0 cannot be done.");
		}
		sc.close();
	}
}
