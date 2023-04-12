package com.acts.tester;

import com.acts.stackusingqueue.StackUsingQueue;

public class StackTester {

	public static void main(String[] args) {

		StackUsingQueue stack =new StackUsingQueue();
		stack.push(10);
		stack.push(20);
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		stack.push(30);
		System.out.println(stack.peek());
	}

}
