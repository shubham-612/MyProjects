package com.cg.basic;

public class Use_datatype {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name= "Shubham Khandelwal";
		int age = 16;
		int sal = 26156;
		System.out.println("Dear " + name + ". Your age is " + age + " and salary is " + sal + ".");
		
		//	IF-ELSE CONDITION
		if(age>18)
		{
			System.out.println("He is mature.");
		}
		else if(age>15 && age<=18)
		{
			System.out.println("He is an adult");
		}
		else
		{
			System.out.println("He is in growing age");
		}
		
		// SWITCH CONDITION
		char ch = 'a';
		switch(ch)
		{
		case 'a':
			System.out.println("Help");
			break;
			
		default:
			System.out.println("NO help");
		}
		
		// FOR LOOP 
		int n = 10;
		for(int i=0 ; i<=n ; i++)
		{
			System.out.println(i);
		}
		
		//	WHILE LOOP
		int i = 0;
		while(i<=5)
		{
			System.out.println(i);
			i++;
		}
		
		//	PRINT EVEN NUMBER
		for(int num = 0 ; num<=10 ; num++)
		{
			if(num%2==0)
			{
				System.out.println(num);
			}
			
		}
	}

}
