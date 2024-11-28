package com.cg.queue;

public class Queue {
	
	 int[] quearray;
	 int maxsize;
	 int front;
	 int rear ;
	 int nitem;
	 
	Queue(int size)
	{
		this.maxsize=size;
		this.quearray = new int[maxsize];
		front = 0 ;
		rear = -1;
		nitem = 0;
	}
	
	boolean isempty()
	{
		return (nitem==0);
	}
	
	boolean isfull()
	{
		return (nitem==maxsize);
	}
	
	void insert(int key)
	{
		if(isfull())
		{
			System.out.println("Queue is full, can't add new value.");
		}
		else
		{
			rear = (rear+1)%maxsize;
			quearray[rear] = key;
			System.out.println(key + " inserted successfully at " + rear + " position");
			nitem++;
		}
	}
	
	int remove()
	{
		//int temp = -1;
		if(isempty())
		{
			System.out.println("Queue is empty");
			return -1;
		}
		else
		{
			int temp = quearray[front];
			front = (front + 1) % maxsize;
			nitem--;
			return temp;
		}
		
	}
	
	void display()
	{
		if(isempty())
		{
			System.out.println("Queue is empty");
		}
		else
		{
			System.out.print("Queue elements are : ");
			for(int i=front ; i<=rear ; i++)
			{
			 System.out.print(quearray[i] + " ");
		    }
		System.out.println("\n");
	    }
    }
}
