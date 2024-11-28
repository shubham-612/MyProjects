package com.cg.comparatator;

public class Employee {

//private int id;
String name;
double salary ;


public Employee() {
	super();
}

public Employee(String n, double s)
{
//	this.id = i;
	this.name = n;
	this.salary=s;
}

public void display()
{
	System.out.println(" name: " + name + " salary: " + salary);
}

@Override
public String toString() {
	return "Employee [name=" + name + ", salary=" + salary + "]";
}

}