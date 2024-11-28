package com.cg.lms;

public class Magazine extends LibraryItem{
	int issuenum;
	
	public Magazine(int id, String title, String author, int issuenum) {
		super(id, title, author);
		this.issuenum = issuenum;
	}

	public void displayInfo()
	{
		System.out.println("Id: " + super.id);
		System.out.println("Title: " + super.title);
		System.out.println("Author: " + super.author);
		System.out.println("Issue Num: " + issuenum);
		
	}

}
