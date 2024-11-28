package com.cg.inherit;

public class UseEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//final 
		int x = 30; // final does not allow to give multiple values for x i.e ; it can be override
		
		System.out.println(x);
		
		Employee[] employees = new Employee[2];
		employees[0] = new Fte(1, "Shubham", 26000);
		employees[1] = new Fte(2, "Soum", 2000);
		
		for(Employee emp : employees)
		{
			emp.display();
			System.out.println();
		}
		
		Employee[] employees2 = new Employee[2];
		employees2[0] = new Pte(1, "Shubham", 2600);
		employees2[1] = new Pte(2, "Soum", 1500);
		
		for(Employee emp : employees2)
		{
			emp.display();
			System.out.println();
		}
		
		Employee e1 = new Employee();
		System.out.println(e1 instanceof Employee);
		
		Employee f1 = new Employee();
		System.out.println(f1 instanceof Fte);
	}
}
