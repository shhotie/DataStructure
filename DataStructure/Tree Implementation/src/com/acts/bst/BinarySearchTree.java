package com.acts.bst;

public class BinarySearchTree {

	Node root;

	public void add(int data) {		
		Node newNode= new Node(data);
		Node current= root;
		if(current == null) {
			root=newNode;
			return;
		}
		while(current!=null) {
			if(newNode.data<current.data) {
				if( current.previous!=null) {
					current=current.previous;
				}
				else {
					current.previous=newNode;
					return;
				}
			}
			if(newNode.data>current.data) {
				if( current.next!=null) {
					current=current.next;
				}
				else {
					current.next=newNode;
					return;
				}
			}
		}
	}
	
	public void inOrder() {
		traversal(root);
	}
	//in-order traversal(LNR) 
	public void traversal(Node root) {
		if(root==null) {
			return;
		}
		if(root.previous!=null) {
			traversal(root.previous);
		}
		System.out.println(root.data);
		if(root.next!=null) {
			traversal(root.next);
		}
		
	}
}

