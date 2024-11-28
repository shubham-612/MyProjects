package com.cg.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Hash {

	public static void main(String[] args) {

			//HashSet<Integer> h1 = new HashSet<>();
			//LinkedHashSet<Integer> h1 = new LinkedHashSet<>();
		
		// TREE PRINT IN VALUE IN SORTED ORDER
		TreeSet<Integer> h1 = new TreeSet<>();
			h1.add(2);
			h1.add(4);
			h1.add(6);
			h1.add(1);
			//h1.add(null); 
			
			//h1.remove(6); // REMOVE THE LAST VALUE
			
			for(Integer h:h1)
			{
				System.out.println(h);
			}
			
			System.out.println(h1.isEmpty());

	}

}
