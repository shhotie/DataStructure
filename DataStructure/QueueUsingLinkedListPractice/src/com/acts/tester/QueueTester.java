package com.acts.tester;

import com.acts.queue.Queue;

public class QueueTester {

	public static void main(String[] args) {

		Queue<Integer> q= new Queue<>();
		q.enQueue(10);
		q.enQueue(20);
		System.out.println(q.peek());
	}

}
