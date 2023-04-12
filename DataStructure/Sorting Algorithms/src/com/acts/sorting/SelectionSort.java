package com.acts.sorting;

public class SelectionSort {

	public static void main(String[] args) {

		int[] array = {50,25,92,16,76,30,43,54,19};
		int lb=0;
		int ub=array.length-1;
		selectionSort(array,lb,ub);
		for(int i=0; i<array.length; i++) {
			System.out.println(array[i]+" ");
		}
	}

	public static void selectionSort(int[] array, int lb, int ub) {
		for(int i=0;i<array.length;i++) {
			int min=i;
			for(int j=i+1;j<array.length;j++) {
				if(array[j]<array[min]) {
					min=j;
				}
			}
			if(min!=i) {
				int temp= array[min];
				array[min]=array[i];
				array[i]=temp;
			}
		}
	}
}
