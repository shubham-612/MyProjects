package com.cg.stream;
import java.util.Arrays;
import java.util.List;

// Given a list of integers, use Stream API to find the maximum value.
public class MAXIMUM_VALUE {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> e = Arrays.asList(2,40,5,3,99,25,10);
		
//		int ans1 = e.stream()
//					.sorted(Comparator.reverseOrder())
//					.findFirst()
//					.orElse(null);
//		System.out.println("Maximum value is : " + ans1);
		
		int ans = e.stream()
				.max(Integer::compare)
				.orElse(null);
		System.out.println(ans);
	}

}
