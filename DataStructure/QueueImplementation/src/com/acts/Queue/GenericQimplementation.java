package com.acts.Queue;

import com.acts.qinterface.GenericQinterface;

public class GenericQimplementation<T> implements GenericQinterface<T> {
	
	int capacity,front,rear;
	Object[] array;


	public GenericQimplementation(int capacity) {
		super();
		this.capacity = capacity;
		this.front = -1;
		this.rear = -1;
		this.array = new Object[this.capacity];
	}

	@Override
	public boolean isEmpty() {
		if(front== rear )//isEmpty->conditions
			return true;
		else
			return false;
	}

	@Override
	public boolean isFull() {
		if(rear== capacity-1 )
			return true;
		else
			return false;
	}

	@Override
	public void enQueue(T data) {

		if(this.isFull()) {
			System.out.println("queue is full");
		}
		else {
			front=0;
			rear++;
			this.array[this.rear]=data;
			//System.out.println("element added in queue: "+ num);
			
		}
	}

	@Override
	public T deQueue() {
		Object data=null;
		if(this.isEmpty()) {
			System.out.println("queue is empty");
		}
		else {
			data =	this.array[this.front];	
			front++;
		}
		return (T)data;
	}

	@Override
	public T getFront() {
		if(this.isEmpty()) {
			System.out.println("queue is empty");
		}
		return (T)this.array[this.front];
	}

	@Override
	public T getRear() {
		if(this.isEmpty()) {
			System.out.println("queue is empty");
		}
		return (T)this.array[this.rear];
	}

	


}
