package com.acts.circularqueue;

public class CircularQueue2 {

	int front,rear,capacity;
	int[] arr;

	public CircularQueue2(int capacity) {
		super();
		this.front = 0;
		this.rear = 0;
		this.capacity = capacity;
		this.arr = new int[capacity];
	}

	public boolean isFull() {

		if( front == (rear+1)%capacity)
			return true;
		return false;
	}

	public boolean isEmpty() {
		if(front==rear)
			return true;
		return false;
	}

	public void enQueue(int data) {
		if(this.isFull())
			System.out.println("queue is full");
		else {
			rear =(rear+1) % capacity;
			arr[rear] = data;
		}
	}

	public int dequeue() {
		int data=-1;
		if(this.isEmpty()) {
			System.out.println("queue is empty");
		return -1;
		}
		else {
			front = (front+1)%capacity;
			data= arr[front];
			return data;
		}
	}
}
