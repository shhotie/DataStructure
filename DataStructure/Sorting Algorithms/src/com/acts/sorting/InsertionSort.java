package com.acts.sorting;

public class InsertionSort {

	public static void main(String[] args) {

		int[] array = {50,25,92,16,76,30,43,54,19};
		int lb=0;
		int ub=array.length-1;
		insertionSort(array,lb,ub);
		for(int i=0; i<array.length; i++) {
			System.out.println(array[i]+" ");
		}
	}
	public static void insertionSort(int[] array,int lb,int ub) {
		 for(int i=1;i<array.length;i++) {
			 int temp=array[i];
			 int j=i-1;
			 while(j>=0 && array[j]>temp) {
				 array[j+1]=array[j];
				 j--;
			 }
			 array[j+1]=temp;
		 }
	}
	
}
