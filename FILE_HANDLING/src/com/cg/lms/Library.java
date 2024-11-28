package com.cg.lms;

public class Library {
	
	int id;
	String title;
	String publisher;
	boolean isavailable;
	public Library(int id, String title, String publisher, boolean isavailable) {
		super();
		this.id = id;
		this.title = title;
		this.publisher = publisher;
		this.isavailable = isavailable;
	}
	@Override
	public String toString() {
		return "Library [id=" + id + ", title=" + title + ", publisher=" + publisher + ", isavailable=" + isavailable
				+ "]";
	}
}
