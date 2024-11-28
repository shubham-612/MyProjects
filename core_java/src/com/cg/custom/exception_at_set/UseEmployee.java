package com.cg.custom.exception_at_set;

public class UseEmployee {
	
	public static void main(String[] args) {
		try
		{
			Employee employee = new Employee(1, "Shubham", 5000);
			employee.display();
			
			employee.setSalary(-3000);
		}
		catch(SalaryNegative e)
		{
			System.out.println(e.getMessage());
		}
		
	}
}
