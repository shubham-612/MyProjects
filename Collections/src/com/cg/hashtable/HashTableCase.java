package com.cg.hashtable;

import java.util.Hashtable;

public class HashTableCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<String, Integer> ht = new Hashtable<>();
		ht.put("Laptop", 10);
		ht.put("Mouse", 20);
		ht.put("Keyboard", 30);
		
		System.out.println(ht);
		
		System.out.println("Total number of laptops are " + ht.get("Laptop"));
		
		System.out.println(ht.containsKey("Laptop"));
		
		System.out.println(ht.containsValue(21));
		
		ht.remove("Laptop");
		
		System.out.println(ht);
		
		for(String str : ht.keySet())
		{
			System.out.println(str);
		}
		
		for(Integer str : ht.values())
		{
			System.out.println(str);
		}
		
		System.out.println(ht.size());
		
		ht.clear();
		
		System.out.println(ht.isEmpty());
		
		System.out.println(ht);

	}
}
