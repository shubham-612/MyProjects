package com.cg.Enumeration;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager m = new Manager();
		
		m.addcontact("Shubham", "khandelwal.shubham2002@gmail.com", 8271263987l, "Patna");
		m.addcontact("Soum", "soumsahu@gmail.com", 9074207670l, "Bhopal");
		m.addcontact("Aarti", "aarti@gmail.com", 8888007113l, "Mumbai");
		m.addcontact("Aditi", "aditi@gmail.com", 8319802601l, "Indore");
		
		m.listcontact();
		
		m.getcontact("khandelwal.shubham2002@gmail.com");
		
		m.updatecontact("Yasho", "soumsahu@gmail.com", 8887793291l, "Lucknow");
		
		m.listcontact();
	}

}
