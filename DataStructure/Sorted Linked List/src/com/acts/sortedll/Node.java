package com.acts.sortedll;

public class Node {

	int data;
	Node nextNode;
	
	public Node(int data) {
		super();
		this.data = data;
		this.nextNode = null;
	}

	@Override
	public String toString() {
		return "Node [data=" + data + ", nextNode=" + nextNode + "]";
	}
	
	
}
