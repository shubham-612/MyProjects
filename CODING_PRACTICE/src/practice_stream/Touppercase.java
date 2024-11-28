package practice_stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Touppercase {
	public static void main(String []args)
	{
		List<String>str=Arrays.asList("soum","aarti","shubham");
		
		List<String>hrr=str.stream()
				.map(String::toUpperCase)
				.collect(Collectors.toList());
		System.out.println(hrr);
	}
}
