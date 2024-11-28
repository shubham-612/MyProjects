package com.cg.searching;

public class Linear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,3,5,7,9};
		int key = 5;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==key)
			{
				System.out.println("Found");
				return ;
			}
		}
		System.out.println("Not found");
	}

}
