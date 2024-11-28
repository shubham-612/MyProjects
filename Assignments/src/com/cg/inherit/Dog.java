package com.cg.inherit;

public class Dog extends Animal{
	
	public Dog(String name, int age)
	{
		super(name,age);
	}
	public void makesound()
	{
		System.out.println("Woof");
	}

}
