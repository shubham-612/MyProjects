package com.cg.string_manipulation;

import java.util.HashSet;
import java.util.Set;

public class LONGEST_SUBSTRING_WO_REPEAT {
	public static String longestUniqueSubstring(String input) {
	    String longest = "";
	    Set<Character> seen = new HashSet<>();
	    int start = 0;
	    
	    for (int end = 0; end < input.length(); end++) {
	        char c = input.charAt(end);
	        while (seen.contains(c)) {
	            seen.remove(input.charAt(start));
	            start++;
	        }
	        seen.add(c);
	        if (end - start + 1 > longest.length()) {
	            longest = input.substring(start, end + 1);
	        }
	    }
	    return longest;
	}
 
 
	public static void main(String[] args) {
		
		String input = "aartiswami";
        String result = longestUniqueSubstring(input);
        System.out.println("Longest substring without repeating characters: " + result);
 
	}
}
