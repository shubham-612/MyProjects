package com.cg.array;
// Check if Array is Sorted
public class CHECK_SORTED_ARRAY {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,2,3,4,5};
		int f = 0;
		for(int i=1 ; i<arr.length ; i++)
		{
			if(arr[i]>=arr[i-1])
			{
				f = 0 ;
			}
			else
			{
				f=1;
				break;
			}
		}
		if(f==0)
		{
			System.out.println("Sorted");
		}
		else
		{
			System.out.println("Not Sorted");
		}
		
	}

}
