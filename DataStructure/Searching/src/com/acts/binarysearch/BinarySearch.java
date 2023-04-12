package com.acts.binarysearch;

public class BinarySearch {

	public int binarySearch(int[] array, int data) {
		int low =0;
		int high=array.length-1;
		while(high-low>1) {
			int mid= (high+low)/2;
			if(array[mid]<data) {
				low=mid+1;
			}else {
				high=mid;
			}
		}
		if(array[low]==data) {
			return low;
		}
		else if(array[high]==data) {
			return high;
		}
		return -1;
	}
}
