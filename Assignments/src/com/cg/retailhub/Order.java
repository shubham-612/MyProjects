package com.cg.retailhub;

public class Order {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer c1 = new Customer(1, "Shubham", 30000); // CREATE CUSTOMER OBJECT
				
		c1.addaddress(new Address("Patna", "Bihar"));
		c1.addaddress(new Address("Pune", "Maharashtra"));
		
		System.out.println(c1);
		
		
	}

}
