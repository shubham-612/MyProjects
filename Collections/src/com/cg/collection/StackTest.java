package com.cg.collection;

import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		
		Stack<Integer> s1 = new Stack<>();
		s1.add(1);
		s1.add(3);
		s1.add(5);
		s1.add(7);
		
		s1.pop();
		s1.pop();
		
		
		s1.push(4);
		
		s1.clear(); // CLEAN THE ENTIRE STACK
		
		s1.push(6);
		s1.push(10);
		
		// s1.remove(); // HAVE TO GIVE INDEX OF WHICH WE WANT TO REMOVE
		
		for(Integer s:s1)
		{
			System.out.println(s);
		}
		
	}

}
