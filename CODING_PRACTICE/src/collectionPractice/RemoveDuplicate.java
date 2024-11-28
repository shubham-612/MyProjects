package collectionPractice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicate {

	public static void main(String[] args) {
		List <Integer> l=Arrays.asList(1,2,3,4,4,5,5,56);
		Set <Integer>s=new HashSet<>();
		
		for(int num:l)
		{
			s.add(num);
		}
		System.out.println(s);

	}

}
