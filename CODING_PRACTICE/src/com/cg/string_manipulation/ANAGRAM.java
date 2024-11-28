package com.cg.string_manipulation;

import java.util.Arrays;

/*
Given two strings, determine if they are anagrams of each other. 
Two strings are anagrams if they use the same characters in the same frequency, 
but possibly in a different order.
 */
public class ANAGRAM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "shubham";
		String s2 = "suhmhba";
		
		char[] c1 = s1.toLowerCase().toCharArray();
		char[] c2 = s2.toLowerCase().toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		System.out.println(Arrays.equals(c1, c2));
		
	}

}
