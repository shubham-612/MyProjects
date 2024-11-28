package com.cg.custom.exception_at_set;

public class Employee {

private int id;
String name;
private double salary ;

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
public double getSalary()
{
	return salary;
}
public void setSalary(double salary) throws SalaryNegative{
	if(salary<0)
	{
		throw new SalaryNegative("Salary cant be negative");
	}
	this.salary = salary;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
}

}
