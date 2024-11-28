package com.cg.collection.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class UseEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> e1 = new ArrayList<>();
		Employee emp1 = new Employee(1, "Shubham", 20000);

		Employee emp2 = new Employee(2, "Yash", 100000);

		Employee emp3 = new Employee(3, "Aditi", 500);
		
		e1.add(emp1);
		e1.add(emp2);
		e1.add(emp3);
		
		for(Employee e : e1)
		{
			System.out.println(e);
		}
		
		// COLLECTION IS A INTERFACE
		// COLLECTIONS IS A CLASS
		System.out.println("__________");
		
		Collections.sort(e1);
		
		for(Employee e : e1)
		{
			System.out.println(e);
		}
		
	}
}
