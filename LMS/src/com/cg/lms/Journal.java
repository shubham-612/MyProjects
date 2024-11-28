package com.cg.lms;

public class Journal extends LibraryItem{
		int vol;
		double ifactor;
		
		public Journal(int id, String title, String author, int vol, double ifactor) {
			super(id, title, author);
			this.vol = vol;
			this.ifactor = ifactor;
		}

		public void displayInfo()
		{
			System.out.println("Id: " + super.id);
			System.out.println("Title: " + super.title);
			System.out.println("Author: " + super.author);
			System.out.println("Volume: " + vol);
			System.out.println("Impact Factor: " + ifactor);
		}
}
