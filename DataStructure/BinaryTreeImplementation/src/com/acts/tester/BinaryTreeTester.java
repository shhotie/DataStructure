package com.acts.tester;

import com.acts.binarytree.BinaryTreeImplementation;

public class BinaryTreeTester {

	public static void main(String[] args) {

		BinaryTreeImplementation tree= new BinaryTreeImplementation();
		tree.create(10, 0, "left");
		tree.create(20, 10,"right");
		tree.create(30, 10, "left");
		tree.levelOrderSpace();
		//System.out.println(tree.noOfNodes());
	}

}
