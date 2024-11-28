package com.cg.string;
// Determine if a given string is a palindrome 
// (a word, phrase, or sequence that reads the same backward as forward).
public class PALINDROME {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "madm";
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		String str1 = sb.toString();
		if(str.equals(str1))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
		//return str.equals(sb.reverse().toString());
	}

}
