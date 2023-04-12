package com.acts.stacktester;

import com.acts.stack.StackImplementation;

public class StackTester {

	public static void main(String[] args) {

		StackImplementation<Integer> stack = new StackImplementation<>(5);
		System.out.println(stack.isEmpty());
		System.out.println(stack.isFul());
		try {
			stack.push(10);
			stack.push(20);
			stack.push(30);
			stack.push(40);
			stack.push(50);
			stack.push(60);
		} catch (Exception e) {
			System.out.println(e);
		}
		

		
	}

}
