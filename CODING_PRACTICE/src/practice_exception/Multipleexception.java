package practice_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Multipleexception {

	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
//		int a=kb.nextInt();
//		int b=kb.nextInt();
		
		try {
			int a=kb.nextInt();
			int b=kb.nextInt();
			System.out.println(a/b);
		}
		catch(InputMismatchException e)
		{
			System.out.println("plzz enter proper number format");
		}
		catch(ArithmeticException e)
		{
				System.out.println("Error: Cannot divide by zero.");
		}

	}

}
