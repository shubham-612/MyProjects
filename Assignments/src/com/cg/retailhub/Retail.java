package com.cg.retailhub;

enum EmployeeType {
		MANAGER,
		ENGINEER,
		SALESPERSON
}
		 
//Define the Employee class
class Retail {
		String name;
		EmployeeType type;
		 
		// Constructor
	public Retail(String name, EmployeeType type) {
		     this.name = name;
		     this.type = type;
		}
		 
		// Method to perform specific action based on employee type
	public void performDuties() {
		     switch (this.type) {
		         case MANAGER:
		             System.out.println(name + " is managing the team.");
		             break;
		         case ENGINEER:
		             System.out.println(name + " is coding.");
		             break;
		         case SALESPERSON:
		             System.out.println(name + " is selling products.");
		             break;
		         default:
		             System.out.println("Invalid employee type.");
		     }
		}
}
