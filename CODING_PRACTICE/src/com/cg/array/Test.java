//package com.cg.array;
//import java.util.Scanner;
//
////import org.apache.commons.lang3.Validate;
//
//
//// Encrypter class to handle encryption
//class Encrypter {
//    // Method to encrypt the name
//    public static String getEncryptedName(String name) {
//        // Validate the name using the Validator class
//        if (Validator.validate(name)) {
//            // Reverse the string and convert to lowercase
//            StringBuilder reversedName = new StringBuilder(name);
//            reversedName.reverse();
//            return reversedName.toString().toLowerCase();
//        } else {
//            // If validation fails, throw an IllegalArgumentException
//            throw new IllegalArgumentException("Please provide a valid name");
//        }
//    }
//}
///*
// * Create the Encrypter class here.
// */
//
//class Validator {
//    public static boolean validate(String name) {
//        for (int i = 0; i < name.length(); i++) {
//            char ch = name.charAt(i);
//            
//            if (ch != ' ' && !(Character.isLowerCase(ch) || Character.isUpperCase(ch))) {
//                return false;
//            }
//        }
//        
//        return true;
//    }
//}
//
//public class Test {
//    private static final Scanner INPUT_READER = new Scanner(System.in);
//    
//    public static void main(String[] args) {
//        String name = INPUT_READER.nextLine();
//        
//        try {
//            System.out.println(Encrypter.getEncryptedName(name));
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//    }
//}



import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


class Result {
    public static int findShortestSubstring(String s) {
    // Write your code here
    int count = 0;
    String a = s.toLowerCase();
    char[] ch = a.toCharArray();
    Arrays.sort(ch);
    for(int i=1 ; i<=ch.length ; i++)
    {
        if(ch[i-1]==ch[i])
        {
            count++;
        }
    } 
    return count;
    }

}
public class Test {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        int result = Result.findShortestSubstring(s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
