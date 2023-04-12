package com.acts.recursion;

import java.util.Scanner;

public class Multiply {
 static int count=0;
	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		int multiply=0;
		System.out.println("please enter the two numbers");
		int num1= sc.nextInt();
		int num2= sc.nextInt();
		if(num1<0 && num2<0) {
			multiply= (-1)*(multiply((-1)*num1,(-1)*num2));
			System.out.println("multiplication :"+ multiply);
			
		}
		else if((num1<0 && num2>0)){
			multiply=(-1)*(multiply((-1)*num1,num2));
			System.out.println("multiplication :"+ multiply);
		}
		else if((num1>0 && num2<0)){
			multiply= (-1)*(multiply(num1,(-1)*num2));
			System.out.println("multiplication :"+ multiply);
		}
		else {
			multiply= (multiply(num1,num2));
			System.out.println("multiplication :"+ multiply);
		}
	}
	
	public static int multiply(int num1,int num2) {
		int mul=num1;
		if(num2==0) {
			return 0;
		}			
		return mul+multiply(num1,num2-1);
	}

	

}
