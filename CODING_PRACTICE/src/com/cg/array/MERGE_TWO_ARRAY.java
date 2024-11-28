package com.cg.array;

import java.util.HashSet;

// Write a function that merges two sorted arrays into a single sorted array.
public class MERGE_TWO_ARRAY {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {1,3,5};
		int []arr1= {2,4,6};
		HashSet<Integer>h=new HashSet<>();
		int i=0,j=0,k=0;
		while(i!=arr.length)
		{
			h.add(arr[i]);
			i++;
			k++;
		}
		while(j!=arr.length)
		{
			h.add(arr1[j]);
			j++;
			k++;
		}
		System.out.println(h);
	}

}
