package com.cg.interfac;

public class Fte extends Employee implements Performance{
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

	@Override
	public void evaluate() {
		// TODO Auto-generated method stub
		System.out.println("Welcome to My Family");
	}
}
