package com.cg.linkedlist;

public class EmployeeLinked {
	
	Node2 head = null;
	Node2 tail = null;
	
	public void addNode(Employee data)
	{
		Node2 newNode = new Node2(data);
		
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
		Node2 current = head;
		
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
		
		EmployeeLinked l1 = new EmployeeLinked();
		
		Employee emp2 = new Employee(1,"shubham",250000);
		
		Employee emp1 = new Employee(2,"shubham",50000);
		
		l1.addNode(emp1);
		l1.addNode(emp2);
		
		l1.display();
		
		

	}

}
