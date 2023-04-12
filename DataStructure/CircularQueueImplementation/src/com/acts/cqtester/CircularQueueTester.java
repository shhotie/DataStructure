package com.acts.cqtester;

import com.acts.circularqueue.circularQueue;

public class CircularQueueTester {

	public static void main(String[] args) {

		circularQueue cQueue= new circularQueue(5);
		
		System.out.println(cQueue.isEmpty());
		System.out.println(cQueue.isFull());
		System.out.println(cQueue.deQueue());
		cQueue.enQueue(10);
		cQueue.enQueue(20);
		cQueue.enQueue(30);
		cQueue.enQueue(40);
		cQueue.enQueue(50);
		cQueue.enQueue(60);
		System.out.println(cQueue.deQueue());
		cQueue.enQueue(60);
		System.out.println(cQueue.isFull());
		
	}

}
