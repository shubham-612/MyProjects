package com.cg.stream;
//Given a list of integers, find the first element greater than a specified value using Stream API.

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FIRST_GREATER_ELEMENT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> e = Arrays.asList(1,2,3,4,5,6,7,8);
		
		long a = e.stream()
				.filter(x->(x>3))
				.sorted(Comparator.comparing(x->x))
				.findFirst()
				.orElse(null);
		
		System.out.println("value greater than given threshold value is : " + a);
	}

}
