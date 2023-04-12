package com.acts.Queue;

import com.acts.qinterface.Qinterface;

public class QueueImplementation implements Qinterface{

	int capacity, front, rear;
	int[] array;


	public QueueImplementation(int capacity) {
		super();
		this.capacity = capacity;
		this.front = -1;
		this.rear = -1;
		this.array = new int[this.capacity];
	}


	@Override
	public boolean isEmpty() {
		if(front == -1 && rear == -1)
			return true;
		else
			return false;
	}


	@Override
	public boolean isFull() {
		if(rear == capacity-1 )
			return true;
		else
			return false;
	}


	@Override
	public void enQueue(int num) {
		if(this.isFull()) {
			System.out.println("queue is full");
		}
		else {
			front = 0;
			rear++;
			this.array[this.rear] = num;
			System.out.println("element added in queue: " + num);
			
		}

	}

	@Override
	public int deQueue() {
		int num = -1;
		if(this.isEmpty()) {
			System.out.println("queue is empty");
		}
		else {
			num = this.array[this.front];	
			front++;
		}
		return num;
	}


	@Override
	public int getFront() {
		if(this.isEmpty()) {
			System.out.println("queue is empty");
		}
		return this.array[this.front];
	}


	@Override
	public int getRear() {
		if(this.isEmpty()) {
			System.out.println("queue is empty");
		}
		return this.array[this.rear];
	}

}
