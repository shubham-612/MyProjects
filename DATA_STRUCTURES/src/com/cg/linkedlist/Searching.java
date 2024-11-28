package com.cg.linkedlist;

public class Searching {

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
	
		public void search(int key)
		{
			int count = 0;
			Node temp = head;
			if(temp == null)
			{
				System.out.println("Empty Linked List");
				return;
			}
			
			int flag=0;
			
			while(temp.next!=null)
			{
				if(temp.data == key)
				{
					System.out.println("Position : " + count);
					flag=1;
					break;
				}
					temp = temp.next;
					count++;		
			}
			
			if(flag==0)
			{
			System.out.println("value not found");
			}
			
			System.out.println();
			
		}
		
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Searching newnode = new Searching();
		
		newnode.addNode(5);
		newnode.addNode(1);
		newnode.addNode(4);
		newnode.addNode(6);
		
		newnode.display();
		
		newnode.search(4);
		
		newnode.search(8);
	}

}
