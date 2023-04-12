package com.acts.cddl;

public class CircularDoublyLinkedList {

	Node head;
	boolean flag =false;
	
	public void addFont(int data) {
		Node newNode = new Node(data);
		Node current=null;
		
		if(head == null) {
			head=newNode;
			head.next=head;
			head.previous=head;
		}
		else {
			if(head.next==head.previous && flag==false) {
				current=head;
				current.previous=newNode;
				current.next=newNode;			
				newNode.next=current;
				newNode.previous=current;
				head=newNode;
				flag=true;
			}
			else {
				current=head;				
				while(current.next!=head) {
					current=current.next;
				}
				newNode.next=head;
				head.previous=newNode;
				current.next=newNode;
				newNode.previous=current;
				head=newNode;
			}
		}

	}

	public void addLast(int data) {

	}

	public void deleteFront() {

	}

	public void deleteLast() {

	}

	public void insert(int data) {

	}

	public void remove(int data) {

	}

	public void search(int data) {

	}

	public void countNode() {

	}

	public void occurenceElement(int data) {

	}

	public void sort(int data) {

	}

	public void reverse() {

	}

	public void print() {
		Node current=head;
		while(current.next!=head) {
			System.out.print(current.data+"->");
			current=current.next;

		}
		if(current.next==head) {
			System.out.print(current.data+"->");			
		}
	}

}
