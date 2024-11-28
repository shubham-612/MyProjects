package com.cg.insertionsort;

public class Insertion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {4, 1, 5, 3, 9, 2};
		int n = arr.length;
		for(int i= 1 ; i<n ; i++)
		{
			int key = arr[i];
			int j = i-1;
			while(j>=0 && key<arr[j])
			{
				arr[j+1] = arr[j];
				--j;
			}
			arr[j+1] =key;
		}
		
		for(int a:arr)
		{
		System.out.print(a + " ");
		}
		
		System.out.println("\n");
	}

}
