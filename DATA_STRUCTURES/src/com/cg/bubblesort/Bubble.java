package com.cg.bubblesort;

public class Bubble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a1 = {25,5,42,1,34,6,0};
		
		// ASCENDING ORDER
		for(int i = 0; i<a1.length-1 ; i++)
		{
			for(int j=0 ; j<a1.length-i-1 ; j++)
			{
				if(a1[j]>a1[j+1])
				{
					int temp1 = a1[j];
					a1[j] = a1[j+1];
					a1[j+1] = temp1;
				}
			}
		}
		
		for(int a:a1)
		{
		System.out.print(a + " ");
		}
		
		System.out.println("\n");
		
		// DESCENDING ORDER
		for(int i = 0; i<a1.length-1 ; i++)
		{
			for(int j=0 ; j<a1.length-i-1 ; j++)
			{
				if(a1[j]<a1[j+1])
				{
					int temp1 = a1[j];
					a1[j] = a1[j+1];
					a1[j+1] = temp1;
				}
			}
		}
		for(int a:a1)
		{
		System.out.print(a + " ");
		}
		
		System.out.println("\n");
		
		// COMPARING CHARCTERS WITH THEIR ASCII VALUE
		char[] a2 = {'z','a', 's', 'A', 'c', 'b', 'R'};
		
		for(int i = 0; i<a2.length-1 ; i++)
		{
			for(int j=0 ; j<a2.length-i-1 ; j++)
			{
				if(a2[j]>a2[j+1])
				{
					char temp2 = a2[j];
					a2[j] = a2[j+1];
					a2[j+1] = temp2;
				}
			}
		}
		for(char a:a2)
		{
		System.out.print(a + " ");
		}
		
		System.out.println("\n");
		
		// PRINTING ASCII VALUES
		int ze = a2[0];
		System.out.println(ze);
		
		System.out.println("\n");
		
		
	}

}
