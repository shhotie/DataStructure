package com.acts.queuestack;

import com.acts.stack.Stack;

public class QueueUsingStack {

	Stack<Integer> stack1= new Stack<>(5);
	Stack<Integer> stack2= new Stack<>(5);

	public void enQueue(int data) {
		stack1.push(data);
	}

	public int deQueue() {
		while(!stack1.isEmpty()) {
			stack2.push(stack1.pop());	
		}
		int data= stack2.pop();
		while(!stack2.isEmpty()) {
			stack1.push(stack2.pop());
		}
		return data;
	}

	public boolean isEmpty() {
		return stack2.isEmpty();
	}
	
	public boolean isFull() {
		return stack2.isFull();
	}
}
