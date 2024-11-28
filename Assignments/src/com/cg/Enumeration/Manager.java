package com.cg.Enumeration;

//import java.math.BigInteger;
import java.util.Enumeration;
import java.util.Hashtable;


public class Manager {
	
	Hashtable<String, Contacts> ht = new Hashtable<>();

	public void addcontact(String name , String email, long phone, String add)
	{
		Contacts c = new Contacts(name, phone, add);
		ht.put(email, c);
	}
	
	public void getcontact(String email)
	{
		System.out.println(ht.get(email));
	}
	
	public void updatecontact(String name , String email, long phone, String add)
	{
		Contacts c = new Contacts(name, phone, add);
		
		if(ht.containsKey(email))
		{
			ht.put(email, c);
		}
	}
	
	public void listcontact()
	{
		Enumeration<Contacts> e = ht.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
	}
}
