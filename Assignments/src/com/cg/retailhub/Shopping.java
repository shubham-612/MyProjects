package com.cg.retailhub;

public class Shopping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Retail r1 = new Retail("Shubham", EmployeeType.ENGINEER);
		r1.performDuties();
		
		Retail r2 = new Retail("Soum", EmployeeType.SALESPERSON);
		r2.performDuties();
		
	}

}
