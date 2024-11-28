package com.cg.lms;

public abstract class LibraryItem {
	int id;
	String title;
	String author;
	static int itemcount;
	
	public LibraryItem(int id, String title, String author)
	{
		super();
		this.id=id;
		this.title = title;
		this.author=author;
		itemcount++;
	}
	
	public static int getitem()
	{
		return itemcount;
	}
	
	public abstract void displayInfo();
	
	@Override
	public String toString() {
		return "LibraryItem [id=" + id + ", title=" + title + ", author=" + author + "]";
	}	
}
