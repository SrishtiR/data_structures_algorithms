package com.srishti.DSA;


/* Algorithm : We compare the value at any index from all prior elements, until all
 * the lesser values are found. Place the value at index before which there are no lesser elements. 
 *  Best case: When array is already sorted -> O(n) time complexity
 * Worst case and average: When array is sorted in reverse order -> O(n^2) 
 * Disadvantage : Impractical for large arrays
 * Advantage : Very fast for sorting small arrays. Better than quick sort. 
 */
public class InsertionSort {
	
	public static void insertionSort(int[] arr) {
		int i, j, val;
		for(i =1 ;i< arr.length; i++) {
			val = arr[i];
			j = i;
			while( j>0 && arr[j-1] > val) {
				arr[j] = arr[j-1];
				j--;
				
			}
			arr[j] = val;
		}
		printArray(arr);
		
	}
	public static void printArray(int[] arr) {
		for(int i = 0; i< arr.length ; i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static void main(String[] args) {
		int arr[] = {7,2,9,1,0};
		insertionSort(arr);
	}
	
}
