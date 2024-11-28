package com.cg.hashmap;

public class Employee {
	int id;
	String name;
	double salary;
	
	public Employee()
	{
		super();
	}
	
	public Employee(int id, String name, double salary)
	{
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public void display()
	{
		System.out.println("Id : " + id + "Name : " + name + "Salary : " + salary);
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
}
