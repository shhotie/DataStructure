package com.acts.stack;

import com.acts.sll.SiglyLinkedList;
import com.acts.stackinterface.StackInterace;

public class Stack<T> implements StackInterace<T> {

	SiglyLinkedList<T> list= new SiglyLinkedList<T>();

	@Override
	public void push(T data) {
		if(isFull())
			System.out.println("stack overflow");
		else
			list.addFirst(data);	
	}

	@Override
	public T pop() {
		if(isEmpty())
			System.out.println("stack underflow");
		else
			return list.deleteFirst();
		return null;
	}

	@Override
	public T peek() {
		T data=null;
		if(isEmpty()) {
			System.out.println("stack underflow");
		}
		else {
			data =list.deleteFirst();
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
