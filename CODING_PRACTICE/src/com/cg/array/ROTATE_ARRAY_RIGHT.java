package com.cg.array;
// Rotate an Array by K Positions to the right
public class ROTATE_ARRAY_RIGHT {

	public static void main(String[] args)
	{
		int k = 2;
		
		int[] arr = {1,2,3,4,5};
		System.out.println("Original Array : ");
		for(int i=0 ; i<arr.length ; i++)
		{	
			System.out.print(arr[i] + " ");
		}
		
		int[] brr = new int[arr.length];
		
		for(int i=0 ; i<arr.length ; i++)
		{
			brr[(i+k)%arr.length]=arr[i];
		}
		System.out.println("\nRight Rotated Array : ");
		for(int i=0 ; i<brr.length ; i++)
		{
			System.out.print(brr[i] + " ");
		}
		
		int[] crr = new int[arr.length];
		for(int i=0 ; i<arr.length ; i++)
		{
			crr[(i-k+arr.length)%arr.length]=arr[i];
		}
		System.out.println("\nLeft Rotated Array : ");
		for(int i=0 ; i<crr.length ; i++)
		{
			System.out.print(crr[i] + " ");
		}
	}
}
