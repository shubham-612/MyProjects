package com.cg.lms;

import java.util.Scanner;

public class Manage {
	Scanner sc = new Scanner(System.in);
	
	public void add()
	{
		System.out.println("Enter the number of books");
		int n = sc.nextInt();\
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		while(true)
		{
		System.out.println("Welcome to library management system");
		System.out.println("Press 1 to add a book");
		System.out.println("Press 2 to view a book");
		System.out.println("Press 3 to update a book");
		System.out.println("Press 4 to delete a book");
		System.out.println("Press 5 to search a book");
		int ch = sc.nextInt();
		switch (ch) 
		{
		case 1: 
		{
			l.add();
		}
		case 2:
		{
			l.view();
		}
		case 3:
		{
			l.update();
		}
		case 4:
		{
			l.delete();
		}
		case 5:
		{
			l.search();
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + ch);
		}
		}
	}

}
