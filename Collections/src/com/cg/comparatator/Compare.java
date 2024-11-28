package com.cg.comparatator;

import java.util.Comparator;

public class Compare implements Comparator<Employee>{
			
//	 COMPARING ON THE BASIS OF NAME
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		
		if(o1.salary==o2.salary)
		{
			return 0;
		}
		else if(o1.salary>o2.salary)
		{
			return 1;
		}
		else
			return -1;

	}	
	
}
