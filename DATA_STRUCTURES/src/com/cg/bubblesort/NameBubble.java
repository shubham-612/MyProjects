package com.cg.bubblesort;

public class NameBubble {
	
	String name;
	
	public NameBubble(String name)
	{
		this.name = name;
	}

	@Override
	public String toString() {
		return "NameBubble [name=" + name + "]";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String[] e1 = new String[4];
		
		e1[0] = new String("shubham");
		e1[1] = new String("kashif");
		e1[2] = new String("yasho");
		e1[3] = new String("anurag");
		
		for(int i=0 ; i<e1.length-1 ; i++)
		{
			for(int j=0 ; j<e1.length-i-1 ; j++)
			{
				if(e1[j].compareTo(e1[j+1])>0)
				{
					String temp = e1[j];
					e1[j] = e1[j+1];
					e1[j+1] = temp;
					
				}
			}
		}
		
		for(String e:e1)
		{
			System.out.println(e + " ");
		}
	}

}
