package practice_stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EachElementSquare {

	public static void main(String[] args) {
		List<Integer>l=Arrays.asList(1,2,3,4,5);
		List<Integer>n=l.stream()
				.map(x->(int)Math.pow(x, 2))
				.collect(Collectors.toList());
System.out.println(n);
	}

}
