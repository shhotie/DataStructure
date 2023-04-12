package com.acts.sorting;

public class QuickSort {

	public static void main(String[] args) {

		int[] array = {50,25,92,16,76,30,43,54,19};
		int lb =0;
		int ub=array.length-1;
		quickSort(array,lb,ub);
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}

	}


	public static void quickSort(int[] array, int lb, int ub) {
		int pivot;
		if(ub>lb) {
			pivot= partition(array,lb,ub);
			quickSort(array,lb,pivot-1);
			quickSort(array,pivot+1,ub);
		}
	}

	public static int partition(int[] array, int lb, int ub) {
		int left= lb;
		int right= ub;
		int pivotItem= array[lb];
		while(left<right) {
			while(array[left]<=pivotItem) {
				left++;
			}
			while(array[right]>pivotItem) {
				right--;
			}
			if(left<right) {
				swap(array,left,right);
			}
		}
		array[lb ]=array[right];
		array[right]=pivotItem;

		return right;
	}

	public static void swap(int[] array, int left, int right) {
		int temp;
		temp=array[left];
		array[left]=array[right];
		array[right]=temp;
	}

}
