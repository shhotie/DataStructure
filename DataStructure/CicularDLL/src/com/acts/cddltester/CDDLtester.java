package com.acts.cddltester;

import com.acts.cddl.CircularDoublyLinkedList;

public class CDDLtester {

	public static void main(String[] args) {

		CircularDoublyLinkedList list = new CircularDoublyLinkedList();
		list.addFont(10);
		list.addFont(8);
		list.addFont(6);
		list.print();
	}

}

