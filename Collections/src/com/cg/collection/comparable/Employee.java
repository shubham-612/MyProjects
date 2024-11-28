package com.cg.collection.comparable;

public class Employee implements Comparable<Employee>{

int id;
String name;
double salary ;

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


@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
}

// COMPARABLE INTERFACE 
@Override
public int compareTo(Employee e) {
	if(this.salary==e.salary)
		return 0;
	else if(this.salary<e.salary)
		return -1;
	else
		return 1;
	
	
	// FOR COMPARING NAMES
	//return (this.name).compareTo(e.name);
//	return (e.name).compareTo(this.name);
}

}
