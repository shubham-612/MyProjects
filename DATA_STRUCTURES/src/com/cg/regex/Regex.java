package com.cg.regex;

import java.util.regex.Pattern;

public class Regex {

	public static boolean isValidPhoneNumber(String phone) {
        String regex = "^\\d{10}$";
        return Pattern.matches(regex, phone);
        
    }
	
	public static boolean isvalidcharacter()
	{
		Pattern.matches("[amn]", "abcd");
	}
	
	public static boolean isValiddigit(String num) {
        String regex = "^\\d+$";
        return Pattern.matches(regex, num);
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isValidPhoneNumber("8271263987"));
		System.out.println(isValidPhoneNumber("8.902/2834"));
		
		System.out.println(isValiddigit("100"));
		
		
	}

}
