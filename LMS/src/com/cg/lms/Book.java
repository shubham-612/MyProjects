package com.cg.lms;

public class Book extends LibraryItem{
	
	String isbn;
	int pages;
	
	public Book(int id, String title, String author, String isbn, int pages) {
		super(id, title, author);
		this.isbn = isbn;
		this.pages = pages;
	}
	
	public void displayInfo()
	{
		System.out.println("Id: " + super.id);
		System.out.println("Title: " + super.title);
		System.out.println("Author: " + super.author);
		System.out.println("Isbn: " + isbn);
		System.out.println("Pages: " + pages);	
	}
}
