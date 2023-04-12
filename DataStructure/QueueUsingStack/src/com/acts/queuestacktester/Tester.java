package com.acts.queuestacktester;

import com.acts.queuestack.QueueUsingStack;

public class Tester {

	public static void main(String[] args) {

		QueueUsingStack q = new QueueUsingStack();
		q.enQueue(10);
		q.enQueue(20);
		q.enQueue(30);
		q.enQueue(40);
		q.enQueue(50);
		System.out.println(q.deQueue());
		System.out.println(q.deQueue());
		System.out.println(q.deQueue());
		q.enQueue(60);
		System.out.println(q.deQueue());
	}

}
