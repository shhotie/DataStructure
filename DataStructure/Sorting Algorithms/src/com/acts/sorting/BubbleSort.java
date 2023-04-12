package com.acts.sorting;

public class BubbleSort {

	public static void main(String[] args) {

		int[] array = {50,25,92,16,76,30,43,54,19};
		int lb=0;
		int ub=array.length-1;
		bubbleSort(array,lb,ub);
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
	}
	
	public static void bubbleSort(int[] array,int lb,int ub) {
		boolean flag=false;
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<ub-i;j++) {
				if(array[j]>array[j+1]) {
					int temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
					flag=true;
				}
			}
			if(flag==false) {
				break;
			}
		}
	}
}
