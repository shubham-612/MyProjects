package com.cg.string;
// Write a method that counts the occurrences of each character in a string.
public class OCCURENCE_OF_EACH_CHAR {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "shubham";
		char[] ch = s.toCharArray();
		int[] freq = new int[26];
		for(char c = 0 ; c<ch.length ; c++)
		{
			freq[ch[c]-'a']++;
		}
		for(int i=0 ; i<freq.length ; i++)
		{
			if(freq[i]!=0) 
			{
				char alpha = (char)(i+'a');
				System.out.println("Frequency of character " + alpha + " is " + freq[i]);
			}
		}
	}
}