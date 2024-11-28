package com.cg.stream;
import java.util.Arrays;
import java.util.List;

// Given a list of integers, use Stream API to find the sum of all even numbers.

public class SUM_OF_EVEN_NO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> e = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		int sum = e.stream()
				   .mapToInt(Integer::intValue)
				   .filter(x->(x%2==0))
				   .sum();
		System.out.println("Total sum is : " + sum);
	}

}
