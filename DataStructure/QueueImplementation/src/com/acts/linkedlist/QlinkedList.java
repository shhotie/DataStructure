package com.acts.linkedlist;

public class QlinkedList {

	int data;
	LinkedListImplementation list =new LinkedListImplementation();
	public QlinkedList(int data) {
		super();
		this.data = data;
	}
	
	public boolean isEmpty() {
		return list.isEmpty();
	}
	public void enQueue(int data) {
		list.addNodeLast(data);
		System.out.println("element added"+data);
	}
	
	public int deQueue() {
		if(list.isEmpty()) {
			System.out.println("queue is empty");
		}
		return list.deleteFirst();
	}
}
