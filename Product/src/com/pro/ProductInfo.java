package com.pro;

public class ProductInfo {
	int id;
	String name;
	private double price;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String toString() {
		return "ProductInfo [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
	public void display()
	{
		System.out.println("Product id=" + id + ", Product name=" + name + ", Product price=" + price);
	}

	public ProductInfo() {
		super();
		// TODO Auto-generated constructor stub
		this.id=101;
		this.name="Mobile";
		this.setPrice(5000);
	}
	
	public ProductInfo(int i, String name, int j)
	{
		this.id=i;
		this.name=name;
		this.setPrice(j);
	}
	
	public double getPrice()
	{
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public double total(double p)
	{
		double cost = this.getPrice()+p;
		return cost;
	}
}
