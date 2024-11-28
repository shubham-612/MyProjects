package com.cg.excep;

public class METHOD_PROPAGATION {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			divideByZero();
		}catch(Exception e) {
			System.out.println(e);
		}
 
	}
	private static void divideByZero() {
		// TODO Auto-generated method stub
		divideZero();
	}
 
	private static void divideZero() {
		// TODO Auto-generated method stub
		int x=10/0;
	}

}
