package com.cg.mergesort;

public class EmployeeMerge {
	
	public static void mergesort(Employee[] arr)
	{
		// BASE CASE
		if(arr.length<2)
		{
			return;
		}
		
		// CREATE AN ARRAY
		int mid = arr.length/2;
		Employee[] left = new Employee[mid];
		Employee[] right = new Employee[arr.length-mid];		
		
		// COPY DATA TO LEFT AND RIGHT SUBARRAYS
		System.arraycopy(arr, 0, left, 0, mid);
		System.arraycopy(arr, mid, right, 0, arr.length-mid);
		
		// RECURSIVELY SORT THE TWO HALVES
		mergesort(left);
		
		mergesort(right);
		
		// MERGE THE SORTED HALVES
		merge(arr, left, right);
	}

	private static void merge(Employee[] arr, Employee[] left, Employee[] right)
	{
			int leftindex = 0 ;
			int rightindex = 0;
			int arrayindex = 0;
			
			// MERGE LEFT AND RIGHT ARRAY INTO A SINGLE SORTED ARRAY
			while(leftindex<left.length && rightindex<right.length)
			{
				if(left[leftindex].salary <= right[rightindex].salary)
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
		Employee[] arr = new Employee[4];
		arr[0] = new Employee(1, 25000, "Shubham");
		arr[1] = new Employee(2, 5000, "Soum");
		arr[2] = new Employee(3, 2000, "Siddhant");
		arr[3] = new Employee(4, 20000, "Suraj");
		
	
		System.out.println("Original Array");
		printarray(arr);
		
		mergesort(arr);
		
		System.out.println("Sorted Array");
		printarray(arr);
	}


	private static void printarray(Employee[] arr)
	{
		for(Employee num: arr)
		{
			System.out.println(num + " ");
		}
		System.out.println();
	}

}
