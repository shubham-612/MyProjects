package com.cg.design;

public class SingletonClass {
	
	private static SingletonClass instance = null;
	
	private SingletonClass()
	{
		
	}
	
	public static SingletonClass getInstance()
	{
		if(instance == null)
		{
			instance = new SingletonClass();
		}
		return instance;
	}
	
	public void msg()
	{
		System.out.println("Hello world");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SingletonClass t = SingletonClass.getInstance();
		t.msg();
		System.out.println(t);
		
		SingletonClass s = SingletonClass.getInstance();
		s.msg();
		System.out.println(s.getInstance());
	}
}