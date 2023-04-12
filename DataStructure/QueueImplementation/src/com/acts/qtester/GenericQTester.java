package com.acts.qtester;

import com.acts.Queue.GenericQimplementation;

public class GenericQTester {

	public static void main(String[] args) {

		GenericQimplementation<Integer>  gQueue = new GenericQimplementation<>(5);
		System.out.println(	gQueue.isEmpty());
		System.out.println(gQueue.isFull());
		System.out.println(gQueue.deQueue());
		gQueue.enQueue(10);
		gQueue.enQueue(20);
		gQueue.enQueue(30);
		gQueue.enQueue(40);
		gQueue.enQueue(50);
		System.out.println("front element: "+gQueue.getFront());
		System.out.println("rear element: "+gQueue.getRear());
		System.out.println("element removed :"+ gQueue.deQueue());
		System.out.println("element removed :"+ gQueue.deQueue());
		gQueue.enQueue(60);
		System.out.println("front element: "+gQueue.getFront());
		System.out.println("rear element: "+gQueue.getRear());
		System.out.println("element removed :"+gQueue.deQueue());
		System.out.println("element removed :"+gQueue.deQueue());
		System.out.println("front element: "+gQueue.getFront());
		System.out.println("rear element: "+gQueue.getRear());
	}

}
