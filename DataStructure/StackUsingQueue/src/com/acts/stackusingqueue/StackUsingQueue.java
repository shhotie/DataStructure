package com.acts.stackusingqueue;

import com.acts.circularqueue.CircularQueue2;

public class StackUsingQueue {

	CircularQueue2 q1= new CircularQueue2(5);
	CircularQueue2 q2= new CircularQueue2(5);
	
	public void push(int data) {
		q2.enQueue(data);
		while(!q1.isEmpty()) {
			q2.enQueue(q1.dequeue());
		}
		while(!q2.isEmpty()) {
			q1.enQueue(q2.dequeue());
		}
	}
	
	public int pop() {
		return q1.dequeue();
	}
	
	public int peek() {
		int data = this.pop();
		this.push(data);
		return data;
	}
}
