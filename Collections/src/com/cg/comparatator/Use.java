package com.cg.comparatator;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class Use {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Employee> e1 = new ArrayList<>();
		Employee emp1 = new Employee( "Shubham", 20000);

		Employee emp2 = new Employee("Yash", 10000);

		Employee emp3 = new Employee("Aditi", 5000);
		
		e1.add(emp1);
		e1.add(emp2);
		e1.add(emp3);
		
		
		System.out.println("Enter the choice");
		System.out.println("1. Salary Comparatator");
		System.out.println("2. Name Comparatator");
		Scanner sc = new Scanner(System.in);
		int ch = sc.nextInt();
		sc.close();
		switch (ch) {
		case 1: {
			Collections.sort(e1,new Compare());
			break;
		}
		case 2:{
			Collections.sort(e1,new NameCompare());
			break;
		}
		default:
			System.out.println("Invalid Comparison");
		}
	
		for(Employee e : e1)
		{
			System.out.println(e);
		}
		//Collections.max(e1,new Compare());
		System.out.println("MAX Salary" + Collections.max(e1,new()));
		System.out.println("MIN Salary" + Collections.min(e1,new Compare()));
		 Compare
	}

}
