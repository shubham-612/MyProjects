package com.cg.inherit;

public class Animal {
	String name;
	int age;
	
	public Animal(String name , int age){
		super();
		this.name = name;
		this.age = age;
	}
	
	public void makesound()
	{
		System.out.println("Generic sound");
	}
	
	public void display()
	{
		System.out.print("id : " + name + " name: " + age);
	}
}
