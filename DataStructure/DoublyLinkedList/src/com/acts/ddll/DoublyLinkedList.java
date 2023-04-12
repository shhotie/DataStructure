package com.acts.ddll;

import com.acts.interfacedll.DLLinterface;

public class DoublyLinkedList implements DLLinterface{

	Node head;
	Node tail;
	@Override
	public void addFirst(int data) {

		Node newNode = new Node(data);
		if(head==null) {
			head=newNode;
			tail=newNode;
		}
		else {
			newNode.next=head;
			head.previous=newNode;
			head=newNode;
		}
	}

	@Override
	public void addLast(int data) {
		Node newNode= new Node(data);
		if(head==null) {
			head=newNode;
			tail=newNode;
		}
		else {
			tail.next=newNode;
			newNode.previous=tail;
			tail=newNode;
		}

	}

	@Override
	public void deleteFirst() {
		Node temp=null;
		if(head == null) {
			System.out.println("List is EMPTY");
		}
		else if(head.next==null) {
			head=null;
			tail=null;
		}
		else {
			temp=head.next;
			head.next=null;
			head=temp;
			head.previous=null;
		}


	}

	@Override
	public void deleteLast() {
		if(head == null) {
			System.out.println("List is EMPTY");
		}
		else if(head.next==null) {
			head=null;
			tail=null;
		}
		else {
			tail=tail.previous;
			tail.next=null;
		}

	}

	@Override
	public void insert(int data) {
		Node current = new Node(data);
		if(head==null) {
			head=current;
			tail=current;
		}
	}

	@Override
	public void remove(int data) {
		if(head==null) {
			return;
		}
		else {
			Node current=head;
			boolean flag=false;
			while(current!=null) {
				flag=false;
				if(current.data == data) {
					if(head.next==null) {//only node case
						head=null;
						tail=null;
						return;
					}
					else if(head.next!=null && head.data==data) {//for first node case and list have more than one element
						head=current.next;
						current.next=null;
						head.previous=null;
						current=head;
						flag=true;
					}
					else if(current.next==null) {//for last node case
						tail=tail.previous;
						tail.next=null;
						return;
					}
					else {
						Node temp=null;//intermediate node
						temp=current;
						current=current.next;
						current.previous=temp.previous;
						temp.previous.next=current;
						flag=true;
					}
				}
				if(flag==false) {
					current =current.next;
				}
			}
		}
	}


	@Override
	public void print() {
		Node current =head;
		while(current!=null) {
			System.out.print(current.data+"->");
			current=current.next;

		}


	}
}
