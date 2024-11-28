package practice_stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Evensum {
	
	public static void main(String []args)
	{
		List <Integer>l=Arrays.asList(1,2,3,4);
		
		 int sum=l.stream() 
				 
				.mapToInt(Integer::intValue)
				.filter(x->(x%2==0))
				.sum();//if you dont use mapToInt then sum
		               //method will be undefined
				System.out.println(sum);
				
		
				
	}

}
