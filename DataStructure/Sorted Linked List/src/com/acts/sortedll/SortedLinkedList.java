package com.acts.sortedll;

import com.acts.sortedinterface.SortedInterface;

public class SortedLinkedList implements SortedInterface  {

	Node head;
	Node current;
	Node previous;

	@Override
	public void insert(int data) {
		Node newNode = new Node(data);
		//if there is no node
		if(head==null) {
			head= newNode;
			return;

		}
		//if only one node is present
		else if(newNode.data < head.data) {
			newNode.nextNode=head;
			head=newNode;
		}
		else if(newNode.data > head.data) {
			current =head;
			previous=null;
			while(current.nextNode!=null) {
				previous=current;
				current= current.nextNode;
				if(newNode.data<current.data) {
					previous.nextNode=newNode;
					newNode.nextNode=current;
					return;
				}
			}
			current.nextNode=newNode;
		}
	}

	@Override
	public String toString() {
		return "SortedLinkedList [head=" + head + ", current=" + current + ", previous=" + previous + "]";
	}

	@Override
	public void print() {
		Node print =head;
		while(print!=null) {
			System.out.print(print.data+ " ->");
			print= print.nextNode;
		}
	}
}
