package com.cg.emp_exception_handling;

public class Employee {

private int id;
String name;
double salary ;

public static void salary(double x) throws ArithmeticException
{
	if(x<0)
	{
		throw new ArithmeticException();
	}
	else
	{
		System.out.println("You are getting a good salary");
	}
}
public Employee() {
	super();
}

public Employee(int i, String n, int s)
{
	this.id = i;
	this.name = n;
	this.salary=s;
}

public void display()
{
	System.out.println("id : " + id + " name: " + name + " salary: " + salary);
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
}

}
