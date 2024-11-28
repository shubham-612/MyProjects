package com.pro;

public class UsePro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProductInfo prodobj1 = new ProductInfo();
		ProductInfo prodobj2 = new ProductInfo(102,"Freeze",5000);
		System.out.println(prodobj1.getPrice());
		System.out.println(prodobj2);
		System.out.println(prodobj1.total(prodobj2.getPrice()));
	}

}
  