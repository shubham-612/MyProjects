package com.cg.inherit;

public class Cat extends Animal{
	public Cat(String name, int age)
	{
		super(name,age);
	}
	public void makesound()
	{
		System.out.println("Meow");
	}
}
