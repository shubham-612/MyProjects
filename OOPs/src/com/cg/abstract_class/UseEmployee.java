package com.cg.abstract_class;

public class UseEmployee {

	public static void main(String[] args) {
		
		Employee f1 = new Fte(100);
		double v = f1.salary();
		System.out.println(v);
		
		Employee p1 = new Pte(2,200);
		System.out.println(p1.salary());
		
	}
}