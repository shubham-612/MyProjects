package com.cg.doubly_LL;

//import com.cg.doubly_LL.Node;

public class Doubly {
	
	Node head = null;
	Node tail = null;
	int size = 0 ;
	
	public void add(int key)
	{
		Node newnode = new Node(key);

		if(head ==  null)
		{
			head = newnode;
			tail = newnode;
		}
		else
		{
			tail.next = newnode;
			newnode.prev = tail;
			tail = newnode;
		}
		size++;
	}
	
	public void display()
	{
		Node current = head;
		
		if(head==null)
		{
			System.out.println("Empty Linked List");
			return;
		}
		System.out.println("Nodes of doubly linked list");
		
		while(current!=null)
		{
			System.out.println(current.data + " ");
			current = current.next;
		}
		System.out.println();
	}
	
	
	@SuppressWarnings("unused")
	public void delete(int key)
	{
		Node current = head;
		while(current!=null)
		{
			if(current.data == key)
			{
				if(current.prev!=null)
				{
					current.prev.next = current.next;
				}
				else
				{
					head = current.next;
				}
				if(current!=null)
				{
					current.next.prev=current.prev;
				}
				else
				{
					tail = current.next;
				}
				return;
			}
			current = current.next;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Doubly newNode = new Doubly();
		
		newNode.add(2);

		newNode.add(4);

		newNode.add(6);

		newNode.add(8);
		
		newNode.display();
		
		newNode.delete(6);
		
		newNode.display();
		
		//System.out.println(size);

	}

}
