package com.cg.lms;

public class UseLibrary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LibraryItem[] it = new LibraryItem[3];
		it[0] = new Book(1,"Mybook","Shubham","123",200);
		it[1] = new Magazine(2,"Alaadin","Soum",3);
		it[2] = new Journal(3,"Lilliput","Aditi",1,2.0);
		
		for(LibraryItem lib:it)
		{
			lib.displayInfo();
		}
		int totalcount = LibraryItem.itemcount;
		System.out.println("Total Count: " + totalcount);
	}
}
