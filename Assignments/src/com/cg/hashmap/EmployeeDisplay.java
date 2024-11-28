package com.cg.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EmployeeDisplay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, Employee> hm = new HashMap<>();
		Employee e1 = new Employee(1, "Shubham", 30000);
		Employee e2 = new Employee(2, "Soum", 50000);
		Employee e3 = new Employee(3, "Aditi", 70000);
		
		hm.put(1, e1);
		hm.put(2, e2);
		hm.put(3, e3);
		
		Set<Map.Entry<Integer, Employee>> m2= hm.entrySet();
	    for(Map.Entry<Integer, Employee> i:m2)
	    { 
	    	System.out.print(i.getKey()+":");
	    	System.out.println(i.getValue());
	    }
	}

}
