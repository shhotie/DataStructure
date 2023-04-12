package com.acts.recursion;
import java.util.Scanner;

public class Divide {
 static int count =0; 
	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.println("please enter the two numbers");
		int num1= sc.nextInt();
		int num2= sc.nextInt();
		if(num1<0 && num2<0) {
			int rem= divide((-1)*num1,(-1)*num2);
			System.out.println("quotient: "+count);
			System.out.println("remainder: "+rem);
		}
		else if((num1<0 && num2>0)){
			int rem= divide((-1)*num1,num2);
			System.out.println("quotient: "+(-1)*count);
			System.out.println("remainder: "+rem);
		}
		else if((num1>0 && num2<0)){
			int rem= divide(num1,(-1)*num2);
			System.out.println("quotient: "+(-1)*count);
			System.out.println("remainder: "+rem);
		}
		else {
			int rem= divide(num1,num2);
			System.out.println("quotient: "+count);
			System.out.println("remainder: "+rem);
		}
		
	}
	public static int divide(int num1,int num2) {
		int rem;
	
		if(num1<num2) {
			return num1;
		}
		count++;
		rem=divide(num1-num2,num2);
		return rem;
	}

}
