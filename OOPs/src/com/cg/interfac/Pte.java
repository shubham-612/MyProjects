package com.cg.interfac;

public class Pte extends Employee implements Performance{
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
	
	@Override
	public void evaluate() {
		// TODO Auto-generated method stub
		System.out.println("\nWelcome to My Family");
	}
}