package com.cg.heap;

public class MaxHeapUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MaxHeap mh = new MaxHeap(6);
		mh.insert(15);
		mh.insert(20);
		mh.insert(7);
		mh.insert(9);
		mh.insert(30);
		mh.insert(17);
		
		mh.display();
		System.out.println("\nMaximum Value : " + mh.getmax());

		System.out.println("\nRemoved Value : " + mh.removemax());
		mh.display();
		System.out.println("\nMaximum Value : " + mh.getmax());
		
		System.out.println("\nRemoved Value : " + mh.removemax());
		mh.display();
		System.out.println("\nMaximum Value : " + mh.getmax());
		
		System.out.println("\nRemoved Value : " + mh.removemax());
		mh.display();
		System.out.println("\nMaximum Value : " + mh.getmax());
		
		System.out.println("\nRemoved Value : " + mh.removemax());
		mh.display();
		System.out.println("\nMaximum Value : " + mh.getmax());
	}
}
