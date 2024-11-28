package com.cg.retailhub;

public class Address{
	String City;
	String State;
	
	public Address()
	{
		super();
	}
	
	public Address(String City, String State)
	{
		this.City = City;
		this.State = State;
	}
	

	@Override
	public String toString() {
		return "Address [City=" + City + ", State=" + State + "]";
	}
	
	
	
	
}
