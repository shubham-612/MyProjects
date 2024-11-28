package com.cg.string_manipulation;

import java.util.ArrayList;
import java.util.List;

public class ALL_SUBSTRING {
	
	public static List<String> findAllSubstrings(String s) {
        List<String> substrings = new ArrayList<>();
        int n = s.length();
        
        // Generate all substrings
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                substrings.add(s.substring(i, j));
            }
        }
        
        return substrings;
    }
 
    public static void main(String[] args) {
        String input = "abc";
        List<String> output = findAllSubstrings(input);
        System.out.println(output);
    }
}
