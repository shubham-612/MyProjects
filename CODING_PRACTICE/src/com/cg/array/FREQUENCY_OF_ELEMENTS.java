package com.cg.array;
// Find the Frequency of Elements
public class FREQUENCY_OF_ELEMENTS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,1,3,2,2,1,3,4,5,6,6,5};
		int n = arr.length;
		int[] freq = new int[n];
		
		for(int i=0 ; i<n ; i++)
		{
			freq[arr[i]]++;
		}
		
		for(int i=1 ; i<freq.length ; i++)
		{
			if(freq[i]!=0) 
			{
				int alpha = i;
				System.out.println("Frequency of " + alpha + " is " + freq[i]);
			}
		}
	}

}
