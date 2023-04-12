package com.acts.recursion;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the position of the number");
		int n = sc.nextInt();
		int num= fibonacci(n);
		System.out.println(num);
	}
	
		public static int fibonacci(int n) {
			if(n<2) {
				return n;
			}
			return fibonacci(n-1)+fibonacci(n-2);
		}
}
