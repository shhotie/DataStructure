package com.acts.bsttester;

import com.acts.bst.BinarySearchTree;

public class BstTester {

	public static void main(String[] args) {

		BinarySearchTree tree = new BinarySearchTree();
		tree.add(10);
		tree.add(5);
		tree.add(15);
		tree.add(2);
		tree.add(7);
		tree.add(17);
		tree.inOrder();
	}

}
