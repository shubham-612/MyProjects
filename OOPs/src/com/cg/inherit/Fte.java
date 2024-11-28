package com.cg.inherit;

public class Fte extends Employee{
	double salary;
	
	public Fte(int id, String name, double salary){
	super(id,name);
	this.salary = salary;
	}
	
	public void display()
	{
		super.display();
		System.out.print(" Salary : " + salary);
	}
}
