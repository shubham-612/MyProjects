package com.cg.excep;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MULTIPLE_CATCH {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		try {
			System.out.println("Enter number1 ");
			int n1= sc.nextInt();
			System.out.println("Enter number2 ");
			int n2= sc.nextInt();
			System.out.println(n1/n2);
		}catch(ArithmeticException e) {
			System.out.println(e);
		}
		catch(InputMismatchException e) {
			System.out.println(e);
		}
	}

}