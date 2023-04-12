package com.acts.tester;

import com.acts.sortedll.SortedLinkedList;

public class SortedLLTester {

	public static void main(String[] args) {

		SortedLinkedList list = new SortedLinkedList();
		list.insert(10);
		list.insert(5);
		list.insert(4);
		list.insert(15);
		list.insert(20);
		list.insert(2);
		list.insert(30);
		list.insert(13);
		list.print();
	}

}
