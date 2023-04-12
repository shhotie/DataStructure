package com.acts.qtester;

import com.acts.Queue.QueueImplementation;

public class Qtester {

	public static void main(String[] args) {

		QueueImplementation queue = new QueueImplementation(5);
		System.out.println(	queue.isEmpty());
		System.out.println(queue.isFull());
		System.out.println(queue.deQueue());
		queue.enQueue(10);
		queue.enQueue(20);
		queue.enQueue(30);
		queue.enQueue(40);
		queue.enQueue(50);
		System.out.println("front element: "+queue.getFront());
		System.out.println("rear element: "+queue.getRear());
		System.out.println("element removed :"+ queue.deQueue());
		System.out.println("element removed :"+ queue.deQueue());
		queue.enQueue(60);
//		queue.enQueue(70);
//		queue.enQueue(80);
		System.out.println("front element: "+queue.getFront());
		System.out.println("rear element: "+queue.getRear());
		System.out.println("element removed :"+queue.deQueue());
		System.out.println("element removed :"+queue.deQueue());
		System.out.println("front element: "+queue.getFront());
		System.out.println("rear element: "+queue.getRear());
		
	}

}
