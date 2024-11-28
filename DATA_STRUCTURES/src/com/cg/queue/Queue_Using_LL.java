package com.cg.queue;

class Node{
	int data;
	Node next;
	public Node(int data) {
		super();
		this.data = data;
		this.next = null;
	}
}

public class Queue_Using_LL {
	
	Node front;
	Node rear;
	int nitem;
	
	public Queue_Using_LL(Node front, Node rear, int nitem) {
		super();
		this.front = null;
		this.rear = null;
		this.nitem = 0;
	}
	
	// CHECK IF QUEUE IS EMPTY OR NOT
	public boolean isempty()
	{
		return (nitem==0);
	}
	
	// INSERT VALUES IN QUEUE 
	public void insert(int key)
	{
		Node newnode = new Node(key);
		
		if(isempty())
		{
			front = newnode;
			rear = newnode;
		}
		else
		{
			rear.next = newnode;
		}
		rear = newnode;
		nitem++;
		System.out.println("Size of queue is " + nitem + "\n");
	}
	
	// REMOVING VALUE FROM QUEUE
	public int remove()
	{
		int temp;
		if(isempty())
		{
			System.out.println("Empty Queue");
			return -1;
		}
		else
		{
			temp = front.data;
			front = front.next;
			nitem--;
		}
		if(isempty())
		{
		//front = rear;	
			rear = null;
		}
		return temp;
	}
	
	// PRINT THE QUEUE
	public void display()
	{
		Node current = front;
		if(isempty())
		{
			System.out.println("queue is empty,.");
		}
		else
		{
			while(current!=null)
			{
				System.out.print(current.data + " ");
				current = current.next;
			}
		}
		System.out.println("\n");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node front = null;
		Node rear  = null;
		int nitem = 0;
		Queue_Using_LL q1 = new Queue_Using_LL(front, rear, nitem);
		q1.insert(1);
		q1.display();
		
		q1.insert(3);
		q1.display();
		
		q1.insert(5);
		q1.display();
		
		System.out.println(q1.remove() + " is removed from the queue.");
		
		q1.display();
	}

}
