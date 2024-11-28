package com.cg.mergesort;

public class Merge {
	
	public static void mergesort(int[] arr)
	{
		// BASE CASE
		if(arr.length<2)
		{
			return;
		}
		
		// CREATE AN ARRAY
		int mid = arr.length/2;
		int[] left = new int[mid];
		int[] right = new int[arr.length-mid];
		
		System.out.println("NEW ARRAY");
		System.out.println("Middle : " + mid);
		System.out.println("Left : " + left.length);
		System.out.println("Right : " + right.length);
		
		
		// COPY DATA TO LEFT AND RIGHT SUBARRAYS
		System.arraycopy(arr, 0, left, 0, mid);
		System.arraycopy(arr, mid, right, 0, arr.length-mid);
		
		// RECURSIVELY SORT THE TWO HALVES
		for(int num: left)
		{
			System.out.print("left array : " + num + " ");
		}
		System.out.println();
		
		for(int num: right)
		{
			System.out.print("right array : " + num + " ");
		}
		System.out.println();

		mergesort(left);
		
		mergesort(right);
		
		// MERGE THE SORTED HALVES
		System.out.println("new Array Length : " + arr.length);
		System.out.println("new Left Array Length : " +left.length);
		System.out.println(" new Right Array Length : " +right.length);
		merge(arr, left, right);
	}
	
	private static void merge(int[] arr, int[] left, int[] right)
	{
			int leftindex = 0 ;
			int rightindex = 0;
			int arrayindex = 0;
			System.out.println("Array Length : " + arr.length);
			System.out.println("Left Array Length : " +left.length);
			System.out.println("Right Array Length : " +right.length);
			
			
			// MERGE LEFT AND RIGHT ARRAY INTO A SINGLE SORTED ARRAY
			while(leftindex<left.length && rightindex<right.length)
			{
				if(left[leftindex] <= right[rightindex])
				{
					arr[arrayindex++] = left[leftindex++];
				}
				else
				{
					arr[arrayindex++] = right[rightindex++];
				}
			}
			
			// FOR REST OF THE ELEMET IN LEFT ARRAY
			while(leftindex<left.length)
			{
				arr[arrayindex++] = left[leftindex++];
			}
			

			// FOR REST OF THE ELEMET IN RIGHT ARRAY
			while(rightindex<right.length)
			{
				arr[arrayindex++] = right[rightindex++];
			}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		int[] arr = {38, 27, 43, 3, 9, 82, 10};
		System.out.println("Original Array");
		printarray(arr);
		
		mergesort(arr);
		
		System.out.println("Sorted Array");
		printarray(arr);
	}
	
	private static void printarray(int[] arr)
	{
		for(int num: arr)
		{
			System.out.print(num + " ");
		}
		System.out.println();
	}

}
