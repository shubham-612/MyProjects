package Stringques;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String str="mous";
		String str1="soum";
		StringBuilder s=new StringBuilder(str);
		char []ch=str.toCharArray();
		char []ch1=str1.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch);
		System.out.println(Arrays.equals(ch1,ch));
		String btr=s.reverse().toString();
		//s.reverse();
		if(str.equals(btr))
		{
			System.out.println("palindromne");
		}
		else
		{
			System.out.println("not");
		}

	}

}




//where we dont import array function 
//a = a.toLowerCase();
//b = b.toLowerCase();
//
//// If the lengths are different, they cannot be anagrams
//if (a.length() != b.length()) {
//    return false;
//}
//
//// Create an array to count frequency of characters
//int[] frequency = new int[26]; // Assuming only English lowercase letters
//
//// Count frequency of each character in the first string
//for (char ch : a.toCharArray()) {
//    frequency[ch - 'a']++;
//}
//
//// Decrease the frequency for each character in the second string
//for (char ch : b.toCharArray()) {
//    frequency[ch - 'a']--;
//}
//
//// Check if all counts are zero
//for (int count : frequency) {
//    if (count != 0) {
//        return false; // If any count is not zero, they are not anagrams
//    }
//}
//
//return true; // If all counts are zero, they are anagrams