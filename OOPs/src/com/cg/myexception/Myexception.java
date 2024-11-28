package com.cg.myexception;

public class Myexception {

	public static void main(String[] args)
	{
		int[] arr = {10,20,30};
	
		try 
		{
			System.out.println(arr[5]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Error " + e.getMessage());
		}
		catch(NullPointerException e)
		{
			System.out.println("Null String " + e.getMessage());
		}
		catch(Exception e)
		{
			System.out.println("Exception Error"  + e.getMessage());
		}
		finally
		{
			System.out.println("Finally");
		}
	}
}
