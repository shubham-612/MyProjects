package com.cg.string;

import java.util.LinkedHashSet;
import java.util.Set;

// Write a method to remove duplicate characters from a given string.
public class REMOVE_DUPLICATES {

	public static String removeDuplicates(String input) {
	    Set<Character> seen = new LinkedHashSet<>();
	    for (char c : input.toCharArray()) {
	        seen.add(c);
	    }
	    StringBuilder sb = new StringBuilder();
	    for (char c : seen) {
	        sb.append(c);
	    }
	    return sb.toString();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input = "shubham";
        String result = removeDuplicates(input);
        System.out.println("String after removing duplicates: " + result);
}
}