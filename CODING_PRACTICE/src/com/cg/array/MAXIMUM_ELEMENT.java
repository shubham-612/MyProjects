package com.cg.array;

import java.util.Arrays;

// Find the Maximum Element
public class MAXIMUM_ELEMENT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,6,5,4};
		Arrays.sort(arr);
		System.out.println(arr[arr.length-1]);
	}

}
