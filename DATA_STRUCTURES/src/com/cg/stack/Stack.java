package com.cg.stack;

public class Stack {

	int[] stackarr ;
	int maxsize;
	int top;
	public Stack(int size)
	{
		maxsize = size;
		stackarr = new int[maxsize];
		top = -1;
	}
	
	public boolean isempty()
	{
		return (top==-1);
	}
	
	public boolean isfull()
	{
		return (top==maxsize-1);
	}
	
	public void push(int data)
	{
		if(isfull())
		{
			System.out.println("Stack is full");
			return;
		}
		else
		{
			stackarr[++top] = data;
			System.out.println("Value pushed in is : " + data);
		}	
	}
	
	public void pop()
	{
		if(isempty())
		{
			System.out.println("Stack is empty");
		}
		else
		{
			System.out.println("Value poped out is : " + stackarr[top]);
			top--;
			
		}
	}
	
	public void peek()
	{
		System.out.println("Peek value is: " + stackarr[top]);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s = new Stack(5);
		s.push(5);
		s.push(7);
		s.push(9);
		
		s.peek();
		
		s.pop();

		s.peek();
		
		s.push(1);
		
		s.peek();
	}

}
