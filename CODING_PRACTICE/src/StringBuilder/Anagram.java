package StringBuilder;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String str="soum";
		String str1="mous";
		char[]arr=str.toCharArray();
		char []arr1=str1.toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr);
		System.out.println(Arrays.equals(arr, arr1));
	}

}
