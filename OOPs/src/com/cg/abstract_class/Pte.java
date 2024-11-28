package com.cg.abstract_class;

public class Pte extends Employee {
	int hour;
	int rate;
	double hsalary;
	
	public Pte(int hours, int rate){
	super();
	this.hour = hours;
	this.rate=rate;
	}
	
	public void display()
	{
		System.out.print(" Hourly Salary : " + hsalary);
	}

	@Override
	public double salary() {
		// TODO Auto-generated method stub
		return hour*rate;
	}
}
