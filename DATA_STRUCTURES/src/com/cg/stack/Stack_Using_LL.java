package com.cg.stack;

public class Stack_Using_LL {
	
	public class Node
	{
		int data ;
		Node next;
		
		Node(int data)
		{
			this.data=data;
			this.next=null;
		}
	}
	
	//public class stack{
		Node top;
		
		Stack_Using_LL()
		{
			this.top=null;
		}
		
		public boolean isempty()
		{
			return top==null;
		}
		
		public void push(int data)
		{
			Node newnode = new Node(data);
			newnode.next=top;  
			top=newnode;
		}
		
		public void pop()
		{
			if(isempty())
			{
				System.out.println("Stack Underflow");
				return;
			}
			else
			{
				Node temp = top;
				
			}
		}
		
		public void peek()
		{
			if(!isempty())
			{
				System.out.println("Peek value is : " + top.data);
			}
			else
			{
				System.out.println("stack is empty");
			}
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack_Using_LL st = new Stack_Using_LL();
		st.push(10);
		st.push(20);
		st.peek();

	}

}
