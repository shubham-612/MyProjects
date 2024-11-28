package collectionPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Duplicate {

	public static void main(String[] args) {
		List <Integer> l=Arrays.asList(1,2,3,4,4,5,5,56);
		Set <Integer>seen=new HashSet <>();
		List <Integer>duplicate=new ArrayList <>();
		for(int num: l)
		{
			if(!seen.add(num))
			{
				duplicate.add(num);
			}
		}
		System.out.println(duplicate);
	}

}
