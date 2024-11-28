package collectionPractice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Intersection {
	public static void main(String []args)
	{
		Set <Integer> l1=new HashSet<>(Arrays.asList(1,2,4,5));
		Set <Integer> l2=new HashSet<>(Arrays.asList(5,56));
		l1.retainAll(l2);//this method used to find intersection or common element and return in 
		
		System.out.println(l1);
	}

}
