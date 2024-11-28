package com.cg.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Given a list of integers, return a list containing the square of each element using Stream API.
public class SQUARE_OF_NO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> e = Arrays.asList(1,2,3,4);
		e.stream()
		.map(x->(x*x))
		.collect(Collectors.toList())
		.forEach((x)->{System.out.print(x + " ");});
	}
}
