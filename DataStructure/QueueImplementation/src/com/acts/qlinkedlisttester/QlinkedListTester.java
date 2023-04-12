package com.acts.qlinkedlisttester;

import com.acts.linkedlist.QlinkedList;

public class QlinkedListTester {

	public static void main(String[] args) {

		QlinkedList list= new QlinkedList(5);
		System.out.println(list.isEmpty());
		System.out.println(list.deQueue());
		list.enQueue(10);
		list.enQueue(20);
		list.enQueue(30);
		list.enQueue(40);
		System.out.println(list.deQueue());
	}

}
