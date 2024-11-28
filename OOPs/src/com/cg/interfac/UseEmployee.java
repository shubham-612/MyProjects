package com.cg.interfac;

public class UseEmployee {

	public static void main(String[] args) {

	
		Employee e1 = new Fte(1, "Shubham", 26000);
		
		((Performance)e1).evaluate();
		
		Employee e2 = new Pte(1, "Shubham", 26000);
		e2.display();
		((Performance)e2).evaluate();
		
	}
}
