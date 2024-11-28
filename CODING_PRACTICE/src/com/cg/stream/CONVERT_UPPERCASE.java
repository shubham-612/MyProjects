package com.cg.stream;
import java.util.Arrays;
import java.util.List;

//Given a list of strings, convert each string to uppercase using Stream API.
public class CONVERT_UPPERCASE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> e = Arrays.asList("shubham", "soum", "aarti");
		e.stream()
		 .map(String::toUpperCase)
		 .forEach(System.out::println);
	}
}

Create an Encrypter class to handle input validation and encryption. It should have the method String name) that performs a simple 1099 manipulation. HackerRank Confiden
shubham.u.kumar@
The getEncryptedName method must perform the following tasks:
• Validate the name by calling the validate(name) method provided in the Validator class
If the name validation returns true:
ukumar
• Reverse the entire string and convert upper-case letters to lower-case
Return the modified string
If the name validation returns false: ntlab
• Throw an exception of IllegalArgumentException class with the again with valid name' message shubn
Trykumar
The locked stub code in the editor provides the complete implementation of the Validator class and validates the implementation of the Encrypter class.
