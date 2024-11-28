package com.cg.mergeLL;

import java.util.ArrayList;
import java.util.Collections;

//import java.util.Collections;
//import java.util.List;

public class MergeList {
	Node head = null;
	Node tail = null;
	
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
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println();
	}

	public static MergeList merge(MergeList newnode1, MergeList newnode2)
	{
		newnode1.tail.next = newnode2.head;
		return newnode1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MergeList newnode1 = new MergeList();
		
		newnode1.addNode(5);
		newnode1.addNode(1);
		newnode1.addNode(4);
		newnode1.addNode(6);
		
		MergeList newnode2 = new MergeList();
		
		newnode2.addNode(2);
		newnode2.addNode(7);
		newnode2.addNode(8);
		newnode2.addNode(3);
		
		newnode1.display();
		newnode2.display();
		
		MergeList mlist = merge(newnode1,newnode2);
		mlist.display();
		
		ArrayList<Integer> ll = new ArrayList<>();
		Node current = mlist.head;
		while(current!=null)
		{
			ll.add(current.data);
			current=current.next;
		}
		
		Collections.sort(ll);
		System.out.print("Sorted Merged List : " + ll);
		
	}

}
