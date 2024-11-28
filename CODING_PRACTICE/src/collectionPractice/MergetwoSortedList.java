package collectionPractice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MergetwoSortedList {

	public static void main(String[] args) {
		List <Integer> l1=Arrays.asList(1,2,4,5);
		List <Integer> l2=Arrays.asList(3,56);
		Set<Integer>t=new HashSet<>();
		for(int num:l1)
		{
			t.add(num);
		}
		for(int num:l2)
		{
			t.add(num);
		}
		System.out.println(t);
		
	}

}
