package com.cg.excep;

import java.util.Scanner;

public class NUMBER_FORMAT {

	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a Number to get its square ");
 
		try {
			int a=sc.nextInt();
			System.out.println("Square is : "+a*a);
		}catch(Exception e) {
			System.out.println("Number Format Exception raised..");
		}
	}
	

}
