package com.cg.string;
// Write a method that checks if a string contains only digits.
public class STRING_WITH_ONLY_DIGIT {

	public static boolean isNumeric(String input) {
	    return input.matches("\\d+");
	}
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//returs true
		String input1 = "9089";
        boolean result1 = isNumeric(input1);
        System.out.println("Is input match with digits: " + result1);
        
		//returns false
        String input2 = "aarti";
        boolean result2 = isNumeric(input2);
        System.out.println("Is input match with digits: " + result2);
 
	}
}
