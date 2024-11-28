package com.cg.retailhub;

import java.util.ArrayList;
import java.util.List;

public class Customer {
	int id;
	String name;
	double salary;
	List<Address> a1;
	
	public Customer()
	{
		super();
	}
	
	public Customer(int id, String name, double salary)
	{
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.a1 = new ArrayList<>();
	}

	public void addaddress(Address address)
	{
		a1.add(address);
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", salary=" + salary + ", a1=" + a1 + "]";
	}
	
	
	
}
