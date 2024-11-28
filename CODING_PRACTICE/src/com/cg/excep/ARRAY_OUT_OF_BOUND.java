package com.cg.excep;
import java.util.Scanner;
/*
Write a program that takes an array of integers and an index from the user 
and prints the element at the given index. 
If the index is out of bounds, catch the ArrayIndexOutOfBoundsException.
 */
public class ARRAY_OUT_OF_BOUND {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array.");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0 ; i<n ; i++)
		{
			arr[i]=sc.nextInt();
		}
		try
		{
			System.out.println("Enter the index value.");
			int index = sc.nextInt();
			System.out.println("Value at "+ index + " is : " + arr[index]);
		}
		catch(Exception e)
		{
			System.out.println("Invalid index.");
		}
		sc.close();
	}
}