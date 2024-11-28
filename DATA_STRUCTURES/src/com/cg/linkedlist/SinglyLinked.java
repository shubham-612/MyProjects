package com.cg.linkedlist;

public class SinglyLinked {
	
	Node head = null;
	Node tail = null;
		
	// INSERTION OF NEW NODE
		public void addNode(int data)
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
			System.out.println("Nodes of singly linked list");
			
			while(current!=null)
			{
				System.out.println(current.data + " ");
				current = current.next;
			}
			System.out.println();
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SinglyLinked newnode = new SinglyLinked();
		
		newnode.addNode(5);
		newnode.addNode(1);
		newnode.addNode(4);
		newnode.addNode(6);
		
		newnode.display();
	}

}
