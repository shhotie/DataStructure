package com.acts.reverseqtester;

import java.util.Scanner;

import com.acts.Queue.GenericQimplementation;

public class ReverseQtester {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the no of element you want to add");
		int numElement= sc.nextInt();
		int[] array= new int[numElement];
		
		GenericQimplementation<Integer> queue = new GenericQimplementation<>(numElement);
		
		System.out.println("PLEASE ENTER THE ELEMENTS IN QUEUE:");
		for(int i=0; i<numElement;i++) {
			queue.enQueue(sc.nextInt());
		}
		
		for(int i=numElement-1; i>=0;i--) {
			array[i]=queue.deQueue();
		}
		
		for(int i=0;i<numElement;i++) {
			System.out.println(array[i]);
		}
//		for(int i=0; i<numElement;i++) {
//			queue.enQueue(array[i]);
//		}
//		System.out.println("REVERSE QUEUE:");
//		for(int i=numElement-1; i>0;i--) {
//			System.out.println(queue.deQueue());
//		}
	}

}
