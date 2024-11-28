package com.cg.searching;

public class Employee {
	
	int id;
	String name;
	double sal;
	
	public Employee(int id, String name, double sal)
	{
		this.id = id;
		this.name=name;
		this.sal=sal;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee[] e1 = new Employee[4];
		e1[0] = new Employee(1, "shubham" , 60000);
		e1[1] = new Employee(2, "soum" , 30000);
		e1[2] = new Employee(3, "aditi" , 40000);
		e1[3] = new Employee(4, "aarti" , 50000);
		
		
	}

}
