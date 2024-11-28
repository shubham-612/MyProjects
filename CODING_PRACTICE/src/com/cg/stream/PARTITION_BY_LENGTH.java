package com.cg.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// Given a list of strings, partition the strings into two groups based on 
// whether their length is greater than 3 using Stream API.
public class PARTITION_BY_LENGTH {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> e = Arrays.asList("Shubham", "SoumSahu", "Aarti", "Aditi", "Yasho");
		
		Map<Boolean, List<String>> m = e.stream()
										.collect(Collectors.partitioningBy(x->x.length()>5));
		System.out.println(m);	

	}

}
