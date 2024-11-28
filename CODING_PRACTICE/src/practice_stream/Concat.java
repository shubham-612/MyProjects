package practice_stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Concat {

	public static void main(String[] args) {
		List<String>str=Arrays.asList("soum","aarti","shubham");
		String join =",";//this is used to join with the string
		String result=str.stream()
					.collect(Collectors.joining(join));
		System.out.println(result);
	}

}
