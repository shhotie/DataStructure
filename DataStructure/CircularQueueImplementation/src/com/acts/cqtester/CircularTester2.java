package com.acts.cqtester;

import com.acts.circularqueue.CircularQueue2;

public class CircularTester2 {

	public static void main(String[] args) {

		CircularQueue2 queue= new CircularQueue2(5);
		System.out.println(queue.isEmpty());
		System.out.println(queue.isFull());
		queue.enQueue(10);
		queue.enQueue(20);
		queue.enQueue(30);
		queue.enQueue(40);
		System.out.println("REMOVED ELEMENT"+queue.dequeue());
		queue.enQueue(50);
		System.out.println("REMOVED ELEMENT"+queue.dequeue());
		queue.enQueue(60);
		
	}

}
