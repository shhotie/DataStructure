package com.acts.linkedlist;

public class LinkedListImplementation {

	Node head;


	public LinkedListImplementation() {
		super();
	}

	public void addNodeLast(int data) {
		Node ref = new Node(data);
		if(head== null) {
			head=ref;		
		}
		else
		{
			Node curent = head;
			while(curent.nextnode!=null) {
				curent=curent.nextnode;
			}
			curent.nextnode=ref;
		}

	}
	
	public void addNodeFirst(int data) {
		Node ref = new Node(data);
		if(head==null) {
			head=ref;
		}
		else {
			Node current = ref;
			current.nextnode=head;
			head=ref;
		}
	}
	
	public void removeNode(int data) {
		Node current=null;
		Node previous=null;
		if(head.data==data) {
			this.head = head.nextnode;
		}
		else if(head.data!=data) {
			current = head;
			while(current.data!=data && current.nextnode!=null) {
				previous=current;
				current= current.nextnode;
			}
			previous.nextnode=current.nextnode;
		}
		else {
			while(current.data!=data && current.nextnode==null) {
				previous=current;
				current= current.nextnode;
			}
			previous.nextnode=null;
		}
	}

	public int deleteFirst() {
		if(head==null) {
			return -1;
		}
		Node current=head;
		int num= head.data;
		head=current.nextnode;
		return num;
		
	}
	
	public int deleteLast() {
		Node current =head;
		while(current.nextnode.nextnode!=null) {
			current=current.nextnode;
		}
		current.nextnode=null;
		int num=current.data;
		return num;
	}
	
	public boolean isEmpty() {
		if(head==null)
			return true;
		return false;
	}
	
	public int peek() {
		int num= head.data;
		return num;
	}
	public void printList() {

		Node ref = head;
		while(ref!=null) {
			System.out.println(ref.data);
			ref = ref.nextnode;
		}
	}

}
