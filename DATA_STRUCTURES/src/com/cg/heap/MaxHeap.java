package com.cg.heap;

public class MaxHeap {
	
	int[] heap ;
	int size;
	int capacity;
	
	public MaxHeap(int capacity) {
		// TODO Auto-generated constructor stub
		super();
		
		this.capacity = capacity;
		this.size=0;
		heap = new int[capacity];
	}
	
	// ASSIGNING PARENT INDEX
	public int parent(int index)
	{
		return (index-1)/2;
	}
	
	// ASSIGNING LEFT CHILD INDEX
	public int leftchild(int index)
	{
		return (2*index+1);
	}
	
	// ASSIGNING RIGHR CHILD INDEX
	public int rightchild(int index)
	{
		return (2*index+2);
	}
	
	// SWAPAPING VALUES ACCORDING TO THEIR VALUES
	public void swap(int index1, int index2)
	{
		int temp = heap[index1];
		heap[index1] = heap[index2];
		heap[index2] = temp;
	}
	
	// INSERTING NEW VALUE
	public void insert(int value)
	{
		if(size==capacity)
		{
			throw new IllegalStateException();
		}
		
		heap[size] = value;
		size++;
		heapifyup(size-1);
	}
	
	// HEAPIFY LARGEST VALUE TO UP
	public void heapifyup(int index)
	{
		while((index!=0) && heap[parent(index)]<heap[index])
		{
			swap(parent(index),index);
			index = parent(index);
		}
	}
	
	// CHECK IF HEAP IS EMPTY OR NOT
	public boolean isempty()
	{
		return(size==0);
	}
	
	// FINDING THE MAXIMUM VALUE FROM HEAP
	public int getmax()
	{
		if(size==0)
		{
			throw new IllegalStateException("Heap is empty");
		}
		return heap[0]; 
	}
	
	// PRINTING THE VALUES OF HEAP
	public void display()
	{
		System.out.print("Heap elements are : ");
		for(int i=0 ; i<size ; i++)
		{
			System.out.print( heap[i] + " ");
		}
	}
	
	// REMOVING MAXIMUM VALUE FROM HEAP
	public int removemax()
	{
		 if (size == 0) 
		 {
	         throw new IllegalStateException("Heap is empty");
	     }
	     int maxValue = heap[0];
	     heap[0] = heap[size - 1];
	     size--;
	     heapifyDown(0);
	     return maxValue;
	}
	
	// SHIFTING MAXIMUM VALUE TO TOP AFTER REMOVING PREVIOUS MAXIMUM VALUE
	public void heapifyDown(int current) {
        int maxIndex = current;
        int left = leftchild(current);
        int right = rightchild(current);
 
        if (left < size && heap[left] > heap[maxIndex]) {
        	maxIndex = left;
        }
        if (right < size && heap[right] > heap[maxIndex]) {
        	maxIndex = right;
        }
        if (maxIndex != current) {
            swap(current, maxIndex);
            heapifyDown(maxIndex);
        }
    }
}
