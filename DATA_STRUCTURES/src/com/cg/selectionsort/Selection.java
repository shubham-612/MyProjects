package com.cg.selectionsort;

public class Selection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {20, 1, 2, 15, 18} ;
		
		System.out.println("Original Array");
		
		for(int a: arr)
		{
			System.out.print(a + "  ");
		}
		
		for(int i=0 ; i<arr.length-1 ; i++)
		{
			int min = i;
			for(int j = i+1 ; j<arr.length ; j++)
			{
				if(arr[j] < arr[min])
				{
					min = j;
				}
			}
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}
		
		System.out.println("Final Array");
		
		for(int a: arr)
		{
			System.out.print(a + "  ");
		}
	}

}
