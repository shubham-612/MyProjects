package com.cg.insertionsort;

public class NameInsertion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i= 1 ; i<n ; i++)
		{
			Employee[] key = arr[i];
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