package com.cg.stream;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Given a list of strings, concatenate them into a single string with a delimiter using Stream API.

public class CONCATE_STRING {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> e = Arrays.asList("Shubham", "Kumar");
		String delimiter = " ";
		String s = e.stream()
				.collect(Collectors.joining(delimiter));
		System.out.println("My name is " + s);	
	}

}
