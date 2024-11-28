package com.cg.java8.func.interfac;

@FunctionalInterface

public interface FuncInterf {
	
	void holiday();  // SINGLE METHOD W/O BODY
	//void Shubham(); // WE CAN'T ADD OTHER SINGLE METHOD
	
	default void diwali() // DEFAULT METHOD WITH BODY
	{
		System.out.println("Happy Diwali");
	}
	
	// WE CAN ADD MULTIPLE DEFAULT METHOD
	default void christmas() // DEFAULT METHOD WITH BODY
	{
		System.out.println("Merry Christmas");
	}
}
