package com.cg.array;
/*
You are given an array containing n-1 integers in the range from 1 to n.
There are no duplicates in the array. One number is missing. Find the missing number.
 */
public class MISSING_NUMBER {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,4,0};
		int sum1 = 0;
		int sum2 = 0;
		for(int i=1 ; i<=arr.length ; i++)
		{
			sum1+=i;
		}
		for(int i=0 ; i<arr.length ; i++)
		{
			sum2+=arr[i];
		}
		System.out.println(sum1-sum2);
	}
}
