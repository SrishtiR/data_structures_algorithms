package com.srishti.DSA;

public class SelectionSort {
/* Selection sort is a combination of searching and sorting. During each pass 
 * the smallest or largest element is moved to it's appropriate position. 
 * Average case and worst case : O(n^2) 
 * 
 */
	public static void selectionSort(int arr[]) {
		int i,j, temp, min;
		
		for(i = 0 ; i< arr.length ; i++) {
			min = i;
			for(j = i+1; j< arr.length; j++){
				if(arr[j] < arr[min]) {
					min = j;
				}
			}
			temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
		printArray(arr);
	}
	
	 static void printArray(int[] arr) {
	// TODO Auto-generated method stub
		 for(int i = 0; i<arr.length; i++) {
			 System.out.println(arr[i]);
		 }
	
}

	public static void main(String args[]) {
		int arr[] = {15, 2, 9 , 7 , 18};
		selectionSort(arr);
	}
}

