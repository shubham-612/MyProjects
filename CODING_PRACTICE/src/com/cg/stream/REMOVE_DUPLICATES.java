package com.cg.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Given a list of integers, use Stream API to remove duplicates and return the list sorted.
public class REMOVE_DUPLICATES {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> e = Arrays.asList(1,2,2,3,4,4,5,5,6,6,6,6,7);
		e.stream()
		.distinct()
		.sorted()
		.collect(Collectors.toList())
		.forEach((x)->{System.out.print(x + " ");});
	}

}
