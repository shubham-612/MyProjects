package com.cg.circularLL;

public class CircularLL {

	Node head = null;
	Node tail = null;
	
	public void add(int data)
	{
		Node newNode = new Node(data);
		
		if(head == null)
		{
			head = newNode;
			tail = newNode;
		}
		else
		{
			tail.next = newNode;
			tail = newNode;
			tail.next = head;
		}
	}
	
	public void display()
	{
		Node current = head;
		
		if(head==null)
		{
			System.out.println("Empty Linked List");
			return;
		}
		else
		{
		System.out.println("Nodes of doubly linked list");
		
		do
		{
			System.out.println(current.data + " ");
			current = current.next;
		}
		while(current!=head);
		System.out.println();
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CircularLL node = new CircularLL();
		
		node.add(1);
		node.add(3);
		node.add(5);
		
		node.display();

	}
}
