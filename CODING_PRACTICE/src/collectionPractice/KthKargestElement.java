package collectionPractice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class KthKargestElement {

	public static void main(String[] args) {
		List <Integer>l=Arrays.asList(1,2,3,4,5);
		int k=2;
		Collections.sort(l,Collections.reverseOrder());
		System.out.println(k+"th largest element is "+l.get(k-1));

	}

}
