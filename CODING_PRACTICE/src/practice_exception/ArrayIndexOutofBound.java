package practice_exception;

import java.util.Scanner;

public class ArrayIndexOutofBound {

	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		try {
		int []arr=new int[5];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=kb.nextInt();
		}
		
		int index=kb.nextInt();
		System.out.println(arr[index]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Error: Index out of bounds."+e.getMessage());
		}
	
	}

}
