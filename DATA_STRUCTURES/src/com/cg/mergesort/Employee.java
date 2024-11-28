package com.cg.mergesort;

public class Employee {
	int id;
	double salary;
	String name;
	
	public Employee()
	{
		super();
	}
	public Employee(int id, double salary, String name)
	{
		this.id = id;
		this.salary = salary;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", salary=" + salary + ", name=" + name + "]";
	}
	
	
}
