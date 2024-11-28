package com.cg.searching;

public class Binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5,6,7,8,9};
		int key = 5;
		
		int l = 0 ;
		int h = arr.length-1;
		int m ;
		
		while(l<=h)
		{
			m = l + (h-l)/2;
			
			if(arr[m]==key)
			{
				System.out.println("Element found");
				return;
			}
			else if(arr[m]>key)
			{
				h = m - 1;
			}
			else
			{
				l = m + 1;
			}
		}
		System.out.println("Not found");
	}
}
