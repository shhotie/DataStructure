package com.acts.binarysearch;

import java.util.Arrays;

public class BinarySearchTester {

	public static void main(String[] args) {

		int[] array= {3,2,4,1,5,8,7,6};
		BinarySearch obj =new BinarySearch();
		Arrays.sort(array);
		System.out.println(obj.binarySearch(array, 7));
	}

}
