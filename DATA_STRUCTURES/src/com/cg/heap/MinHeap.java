package com.cg.heap;

public class MinHeap {
	
	int[] heap;
	int size;
	int capacity;
	
	public MinHeap(int capacity) {
		super();
		this.size = 0;
		this.capacity = capacity;
		heap = new int[capacity];
	}
	
	public int parent(int index)
	{
		return (index-1)/2;
	}
	
	public int leftchild(int index)
	{
		return 2*index+1;
	}
	
	public int rightchild(int index)
	{
		return 2*index+2;
	}
	
	public void swap(int index1, int index2)
	{
		int temp  = heap[index1];
		heap[index1]  = heap[index2];
		heap[index2] = temp;
	}
	
	public void insert(int value)
	{
		if(size==capacity)
		{
			throw new IllegalStateException("Heap is full");
		}
		heap[size]= value;
		size++;
		heapifyup(size-1);
		System.out.println("Inserted value is : " + value);
	}
	
	public void heapifyup(int index)
	{
		while((index!=0) && heap[parent(index)] > heap[index])
		{
			swap(parent(index),index);
			index = parent(index);
		}
	}
	
	public boolean isempty()
	{
		return size==0;
	}
	
	public int getmin()
	{
		if(size==0)
		{
			throw new IllegalStateException("Heap is empty");
		}
		return heap[0];
	}
	
	public void display()
	{
		System.out.println("Heap elements are : ");
		for(int i=0 ; i<size ; i++)
		{
			System.out.print(heap[i] + " ");
		}
	}
}
