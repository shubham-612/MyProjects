package com.cg.java8.func.interfac;

public class MyInterface implements FuncInterf{

	@Override
	public void holiday() {
		// TODO Auto-generated method stub
		System.out.println("Hello");
	}
	
	public static void main(String[] args)
	{
		MyInterface t1 = new MyInterface();
		t1.holiday();
		t1.diwali();
		t1.christmas();
	}
	
}
