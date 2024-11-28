package com.cg.heap;

public class MinHeapUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MinHeap mh = new MinHeap(6);
		mh.insert(15);
		mh.display();
		System.out.println("\nMinimum Value : " + mh.getmin());
		
		mh.insert(20);
		mh.display();
		System.out.println("\nMinimum Value : " + mh.getmin());
		
		mh.insert(7);
		mh.display();
		System.out.println("\nMinimum Value : " + mh.getmin());
		
		mh.insert(9);
		mh.display();
		System.out.println("\nMinimum Value : " + mh.getmin());
		
		mh.insert(30);
		mh.display();
		System.out.println("\nMinimum Value : " + mh.getmin());
		
		mh.insert(1);
		mh.display();
		System.out.println("\nMinimum Value : " + mh.getmin());

//		//System.out.println("\nRemoved Value : " + mh.removemax());
//		mh.display();
//		System.out.println("\nMaximum Value : " + mh.getmax());
//		
//		System.out.println("\nRemoved Value : " + mh.removemax());
//		mh.display();
//		System.out.println("\nMaximum Value : " + mh.getmax());
//		
//		System.out.println("\nRemoved Value : " + mh.removemax());
//		mh.display();
//		System.out.println("\nMaximum Value : " + mh.getmax());
//		
//		System.out.println("\nRemoved Value : " + mh.removemax());
//		mh.display();
//		System.out.println("\nMaximum Value : " + mh.getmax());
	}

}
