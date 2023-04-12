package com.acts.sorting;

public class MergeSort {

	public static void main(String[] args) {

		int[] array = {50,25,92,16,76,30,43,54,19};
		int[] arr2= new int[array.length];
		int lb =0;
		int ub=array.length-1;
		mergeSort(array,lb,ub,arr2);
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
	}
	public static void mergeSort(int[] array,int lb, int ub,int[] arr2){
		if(lb<ub) {
			int mid= (lb+ub)/2;
			mergeSort(array,lb,mid,arr2);
			mergeSort(array, mid+1,ub,arr2);
			merge(array,lb,mid,ub,arr2);
		}
	}
	
	public static void merge(int[] array,int lb,int mid,int ub,int[] arr2) {
		int i=lb;
		int j=mid+1;
		int k=lb;
		while(i<=mid && j<=ub) {
			if(array[i]<array[j]) {
				arr2[k]=array[i];
				i++;
			}
			else {
				arr2[k]=array[j];
				j++;
			}
			k++;
		}
		if(i>mid) {
			while(j<=ub) {
				arr2[k]=array[j];
				k++;
				j++;
			}
		}
		else {
			while(i<=mid) {
				arr2[k]=array[i];
				i++;
				k++;
			}

		}
		for( k=0;k<=ub;k++) {
			array[k]=arr2[k];
		}
	}
}
