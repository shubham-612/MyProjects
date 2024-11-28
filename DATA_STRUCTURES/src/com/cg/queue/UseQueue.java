package com.cg.queue;

public class UseQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size = 5;
		Queue q1 = new Queue(size);
		q1.insert(1);
		q1.insert(3);
		q1.insert(5);
		q1.insert(7);
		q1.insert(9);
		
		q1.display();
		
		q1.insert(11);
		
		System.out.println(q1.remove() + " is removed from the queue");
		q1.display();
		
		System.out.println(q1.remove() + " is removed from the queue");
		q1.display();
		
		System.out.println(q1.remove() + " is removed from the queue");
		q1.display();
		
		System.out.println(q1.remove() + " is removed from the queue");
		q1.display();
		
		System.out.println(q1.remove() + " is removed from the queue");
		q1.display();
		
		System.out.println(q1.remove() + " is removed from the queue");

	}

}
