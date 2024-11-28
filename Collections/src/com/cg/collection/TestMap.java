package com.cg.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TestMap {

	public static void main(String[] args) {
		
		HashMap<Integer, String> m1= new HashMap<>();
		m1.put(1, "Shubham");
		m1.put(3, "Khandelwal");
		m1.put(2, "Soum");
		m1.put(4, "Sahu");
//		m1.put(null, "Kumar");
//		m1.put(null, "Kuma"); // OVERRIDE
//		m1.put(null, null); // OVERRIDE

		//System.out.println(m1);
		
		// FOR ITERATING BOTH KEY AND VALUE PAIR
		Set<Map.Entry<Integer,String>> m2= m1.entrySet();
	    for(Map.Entry<Integer, String> i:m2)
	    { 
	    	System.out.print(i.getKey()+":");
	    	System.out.println(i.getValue());
	    }
	    
	    for(Integer i : m1.keySet()) // FOR INTEGER VALUE / KEY VALUE
	    {
	    	System.out.println(i);
	    }
	    
	    for(String i: m1.values()) // FOR STRING VALUE / PAIR VALUE
	    {
	    	System.out.println(i);
	    }
	    
	    // PRINTING KEY VALUE PAIR USING ITERATOR
	    Iterator<Map.Entry<Integer, String>> it = m1.entrySet().iterator();
	    while(it.hasNext())
	    {
	    	Map.Entry<Integer, String> entry = it.next();
	    	System.out.print(entry.getKey() + " ");
	    	System.out.println(entry.getValue());
	    } 
	}
}
