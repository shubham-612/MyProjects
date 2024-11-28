package com.cg.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// Given a list of strings, group them by their length using Stream API.
public class GROUP_BY_LENGTH {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> e = Arrays.asList("Shubham", "Soum", "Aarti", "Aaditi", "Yashovardhan");
		Map<Integer, List<String>> m = e.stream()
										.collect(Collectors.groupingBy(String::length));
		System.out.println(m);		
	}

}
