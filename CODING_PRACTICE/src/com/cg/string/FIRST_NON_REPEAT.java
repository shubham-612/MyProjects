package com.cg.string;

//import java.util.Arrays;
//import java.util.LinkedHashMap;
//import java.util.Map;
//import java.util.stream.Collectors;

// Given a string, find the first non-repeated character in it.
public class FIRST_NON_REPEAT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "Communication";  
//		Map<String, Long> result = Arrays.stream(str.split(""))
//					.map(String::toLowerCase)
//					.collect(Collectors.groupingBy(s -> s, LinkedHashMap::new, Collectors.counting()));
//		System.out.println(result); 
		
		int[] freq = new int [26];
		str = str.toLowerCase();
		char[] s = str.toCharArray();
		
		for(char i=0 ; i<s.length ; i++)
		{
			freq[s[i]-'a']++;
		}
		
		for(int i=0 ; i<str.length() ; i++)
		{
			if(freq[str.charAt(i)-'a']==1)
			{
				System.out.println(str.charAt(i));
				break;
			}
		}
	}
}
