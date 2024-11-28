package com.cg.string;
// Write a method that takes a string and counts the number of vowels and consonants.
public class COUNT_VOWELS_CONSO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Shubham";
		str.toLowerCase();
		int v = 0;
		int c = 0 ;
		
		for(int i = 0 ; i<str.length() ; i++)
		{
			if(str.charAt(i)== 'a' || str.charAt(i)== 'e' || str.charAt(i)== 'i' || str.charAt(i)== 'o' || str.charAt(i)== 'u')
			{
				v++;
			}
			else
			{
				c++;
			}
		}
		System.out.println("Vowels : " + v + " AND Consonants : " + c) ;
	}

}
