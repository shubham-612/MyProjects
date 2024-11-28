package practice_stream;

import java.util.Arrays;
import java.util.List;

public class MaxElement {

	public static void main(String[] args) {
		List<Integer>l=Arrays.asList(1,2,3,4,5);
		int max=l.stream()
				.max(Integer::compare)
				.orElseThrow();
		System.out.println(max);
				

	}

}
