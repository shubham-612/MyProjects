package collectionPractice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class SortByLength {

	public static void main(String[] args) {
		List <String>l=Arrays.asList("apple", "banana", "kiwi", "pear", "grape");
		Collections.sort(l, (a, b) -> {
            if (a.length() == b.length()) {
                return a.compareTo(b);
            }
            return a.length() - b.length();
        });
		
System.out.println(l);


		
		
		
		

	}

}
