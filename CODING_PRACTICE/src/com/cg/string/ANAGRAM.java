package com.cg.string;

import java.util.Arrays;

// Write a method to check if two strings are anagrams of each other.
public class ANAGRAM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcbbk";
		String t = "hsubamh";
		
		s = s.toLowerCase();
		t = t.toLowerCase();
		
		char[] ch = s.toCharArray();
		char[] sh = t.toCharArray();
		
		Arrays.sort(ch);
		Arrays.sort(sh);
		
		System.out.println(Arrays.equals(ch, sh));
	}
}