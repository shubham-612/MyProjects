package com.cg.equal;

public class UseEmployee {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee(1, "Shubham" , 26156);
		
		Employee emp2 = new Employee(1, "Shubham" , 26156);
		
		if(emp1 == emp2)
		{
			System.out.println("True");		
		}
		else
		{
			System.out.println("False");
		}
		
		emp2 = emp1;
		if(emp1 == emp2)
		{
			System.out.println("True");		
		}
		else
		{
			System.out.println("False");
		}
		
		System.out.println(emp1.hashCode());

		System.out.println(emp2.hashCode());
		
		System.out.println(emp1.equals(emp2));
		
	}
}
