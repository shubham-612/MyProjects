package practice_stream;

import java.util.Arrays;
import java.util.List;

public class CountaboveThreshold {
	public static void main(String []args)
	{
		List <Integer>l=Arrays.asList(1,2,3,4,54);
		int threshold=1;
		
		long c= l.stream()
				.filter(x->x>threshold)
				.count();
		System.out.println(c);
	}

}
