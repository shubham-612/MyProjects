package com.cg.Enumeration;

//import java.math.BigInteger;

public class Contacts {
	String name;
	long phone;
	String add;
	
	public Contacts(String name, long phone, String add) {
		super();
		this.name = name;
		this.phone = phone;
		this.add = add;
	}
	
	@Override
	public String toString() {
		return "Contacts [name=" + name + ", phone=" + phone + ", add=" + add + "]";
	}
}
