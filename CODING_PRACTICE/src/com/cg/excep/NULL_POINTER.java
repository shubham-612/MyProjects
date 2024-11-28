package com.cg.excep;
public class NULL_POINTER {
/*
Write a program that tries to access a method on a null object 
and handles the NullPointerException.
*/
	@SuppressWarnings("null")
	public static void main(String[] args) {
		String s = null;
		String d = "Hello";
		try {
			System.out.println(d.length());
			System.out.println(s.length());
		}
		catch(NullPointerException e)
		{
			System.out.println(e.getMessage());
		}
	}

}
