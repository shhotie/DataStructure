package com.acts.tester;

import com.acts.stack.Stack;

public class StackTester {

	public static void main(String[] args) {

		Stack<Integer> stack= new Stack<>();
		System.out.println(stack.isEmpty());
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.pop();
		System.out.println(stack.isEmpty());
		System.out.println(stack.isFull());
		System.out.println(stack.peek());
	}

}
