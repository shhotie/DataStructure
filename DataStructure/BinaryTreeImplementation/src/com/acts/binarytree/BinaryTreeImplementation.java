package com.acts.binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeImplementation {

	Node root;
	static int count=0;
	
	public void create(int currentData, int previousData, String position) {
		Node newNode= new Node(currentData);
		String S1= "right";
		String S2="left";
		Node current;
		current = root;
		if(root == null) {
			root = newNode;
			return;
		}
		while(current!=null) {
			if(position.equals(S2)) {
				current=search(previousData,current);
				if(current.left!=null) {
					System.out.println("ELEMENT EXISTS-->CHOOSE ANOTHER POSITION");
				}
				else {
					current.left=newNode;
					return;
				}
			}
			if(position.equals(S1)) {
				current= search(previousData,current);
				if(current.right!=null) {
					System.out.println("ELEMENT EXISTS-->CHOOSE ANOTHER POSITION");
				}
				else {
					current.right=newNode;
					return;
				}
			}
		}
	}


	public Node search(int previousData, Node current) {
		if(previousData==current.data) {
			return current;
		}
		if(current.left!=null) {
			search(previousData,current.left);
		}
		if(current.right!=null) {
			search(previousData,current.right);
		}
		return current;
	}
	//pre-order traversal
	public void traversePreOrder() {
		preOrder(root);
	}

	public void preOrder(Node root) {
		if(root==null) {
			return;
		}
		 noOfNodes();
		System.out.println(root.data);	
		preOrder(root.left);
		preOrder(root.right);

	}

	//in-order traversal
	public void traverseInOrder() {
		inOrder(root);
	}

	public void inOrder(Node root) {
		if(root==null) {
			return;
		}
		inOrder(root.left);
		 noOfNodes();
		System.out.println(root.data);
		inOrder(root.right);
	}

	//post-order traversal
	public void traversePostOrder() {
		postOrder(root);
	}		
	
	public void postOrder(Node root) {
		if(root==null) {
			return;
		}
		postOrder(root.left);
		postOrder(root.right);
		 noOfNodes();
		System.out.println(root.data);
	}

	public int noOfNodes() {
		return(count++);
	}
	
	public void levelOrder() {
		Queue<Node> queue= new LinkedList<>(); //queue is interface in java thats y we take		
		if(root==null) {                          //linked list class, bcoz it implements the queue interface
			return;
		}
		queue.add(root);
		while(!queue.isEmpty()) {
			Node current= queue.poll();
			System.out.print(current.data);
			if(current.left!=null) {
				queue.add(current.left);
			}
			if(current.right!=null) {
				queue.add(current.right);
			}
			
		}
		
		
	}
	
	public void levelOrderSpace() {
		if(root==null) {
			return;
		}
		Queue<Node> q= new LinkedList<>();
		q.add(root);
		q.add(null);
		while(!q.isEmpty()) {
			Node current= q.poll();
			if(current==null) {
				if(q.isEmpty()) {
					return;
				}
				q.add(null);
				System.out.println();
				continue;
			}
			System.out.print(current.data);
			if(current.left!=null) {
				q.add(current.left);
			}
			if(current.right!=null) {
				q.add(current.right);
			}
		}
	}
}
