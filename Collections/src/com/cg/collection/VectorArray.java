package com.cg.collection;

import java.util.Vector;

public class VectorArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> v1 = new Vector<>();
		v1.add(1);
		v1.add(3);
		v1.add(null);
		v1.add(5);
		
		for(Integer i:v1)
		{
			System.out.println(i);
		}
	}

}
