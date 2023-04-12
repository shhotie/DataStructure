package com.acts.queue;

import com.acts.queueinterface.QueueInterface;
import com.acts.sll.SiglyLinkedList;

public class Queue<T> implements QueueInterface<T> {

	SiglyLinkedList<T> list= new SiglyLinkedList<T>();
	
	@Override
	public void enQueue(T data) {
		if(isFull()) {
			System.out.println("queue is overflow");
		}
		else {
			list.addLast(data);
		}
	}

	@Override
	public T deQueue() {
		if(isEmpty()) {
			System.out.println("queue is overflow");
		}
		else {
			return list.deleteFirst();
		}
		return null;
	}

	@Override
	public T peek() {
		T data=null;
		if(isEmpty()) {
			System.out.println("queue is overflow");
		}
		else {
			data= list.deleteFirst();
			list.addFirst(data);
		}
		return data;
	}

	@Override
	public boolean isEmpty() {
		return list.isEmpty();
	}

	@Override
	public boolean isFull() {
		return list.isFull();
	}

}
