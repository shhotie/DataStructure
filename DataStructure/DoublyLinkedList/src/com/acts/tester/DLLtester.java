package com.acts.tester;

import com.acts.ddll.DoublyLinkedList;

public class DLLtester {

	public static void main(String[] args) {

		DoublyLinkedList list= new DoublyLinkedList();
		list.addFirst(10);
		list.addLast(20);
		list.addFirst(5);
		list.addFirst(2);
		list.addLast(30);
		list.addLast(35);
		list.addLast(40);
		list.addLast(45);
		list.addLast(40);
		list.addLast(20);
		list.addFirst(20);
		list.addFirst(20);
		list.print();
		System.out.println();
		list.remove(20);
		list.remove(40);
		list.print();
	}

}
