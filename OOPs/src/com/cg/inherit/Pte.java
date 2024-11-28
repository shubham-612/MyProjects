package com.cg.inherit;

public class Pte extends Employee {
	double hsalary;
	
	public Pte(int id, String name, double salary){
	super(id,name);
	this.hsalary = salary;
	}
	
	public void display()
	{
		super.display();
		System.out.print(" Hourly Salary : " + hsalary);
	}
}
