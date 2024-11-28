package com.cg.stream;

import java.util.Arrays;
import java.util.List;

// Given a list of integers, count how many numbers are greater than a specified threshold using Stream API.
public class NUMBERS_GREATER_THAN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> e = Arrays.asList(1,2,3,4,5,6,7,8);
		
		long a = e.stream()
				.filter(x->(x>0))
				.count();
		
		System.out.println("Total values greater than given threshold value is : " + a);
	}

}
