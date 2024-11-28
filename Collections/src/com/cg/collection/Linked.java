package com.cg.collection;
import java.util.LinkedList;
import java.util.List;
public class Linked {
	

	public static void main(String[] args) {
		
		//List<Number> l1 = new LinkedList<Number>();
		
		LinkedList<Integer> l1 = new LinkedList<Integer>();
		
		//l1.add("Hello");
		
		l1.add(5);
		l1.add(6);
		l1.addFirst(1);
		l1.addLast(9);
		l1.add(2, 8);
		l1.remove(4);
		
		
		//int s = l1.get(2);
		
		
		for(Integer i:l1)
		{
		System.out.println(i);
		}
	}
 
}
