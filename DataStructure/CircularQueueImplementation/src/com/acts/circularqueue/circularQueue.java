package com.acts.circularqueue;

public class circularQueue {

	int front,rear,capacity;
	int[] arr;
	
	public circularQueue(int capacity) {
		super();
		this.front = -1;
		this.rear = -1;
		this.capacity = capacity;
		this.arr = new int[capacity];
	}
	
	public boolean isEmpty() {
		if(front==-1) 
			return true;
		return false;
		
	}
	
	public boolean isFull() {
		if(rear==capacity-1 && front==0 || rear==front-1)
			return true;
		return false;
			
	}
	
	public void enQueue(int num) {
		if(this.isFull()) {
			System.out.println("queue is full");	
		}
		else {
		if(front ==-1){
			rear=0;
			front=0;
		}
		else if(rear==capacity-1 && front != 0) {
			rear =(rear+1)%capacity;			
		}
		else {
			rear++;
		}
		this.arr[rear]=num;		
		System.out.println("element added into queue: "+num);
		}
	}
	
	public int deQueue() {
		int num=-1;
		if(this.isEmpty()) {
			System.out.println("queue is empty");
			return num;
		}
		num=arr[front];
		if(front == rear ) {
			front=-1;
			rear=-1;
		}
		else if(front == capacity-1) {
			front= (front+1)%capacity;
		}
		else {
			front++;
		}	
		return num;
	}
}
