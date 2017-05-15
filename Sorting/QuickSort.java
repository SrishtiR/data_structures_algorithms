package com.srishti.DSA;


/* Divide and conquer algorithm
 * Best case complexity : O(nlogn)
 * Average case : O(nlogn)
 * Worst case : O(n^2)
 */
public class QuickSort {

	private int array[];
	private int length;
	public void sort(int[] inputArray){
		if(inputArray.length == 0) {
			return;
		}
		this.array = inputArray;
		length = inputArray.length;
		quicksort(0, length -1);
		printArray(array);
	}
	private static void printArray(int[] array2) {
		// TODO Auto-generated method stub
		for(int i = 0 ; i< array2.length; i++) {
			System.out.println(array2[i]);
		}
		
	}
	public void quicksort(int lowerIndex, int higherIndex) {
		int i = lowerIndex;
		int j = higherIndex;
		int pivot = lowerIndex + (higherIndex- lowerIndex)/2;
		while(i<=j) {
			while(array[i] < array[pivot]) {
				i++;
			}
			while(array[j] > array[pivot]) {
				j--;
			}
			if(i <= j) {
				exchangeNumbers(i,j);
				i++;
				j--;
			}
		}
		if(lowerIndex < j) {
			quicksort(lowerIndex, j);
		}
		if(higherIndex > i) {
			quicksort(i, higherIndex);
		}
	}
	public void exchangeNumbers(int i, int j) {
		// TODO Auto-generated method stub
		int temp;
		temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
	public static void main(String[] args) {
		int arr[] = {7,1,9,2,10};
		QuickSort q = new QuickSort();
		q.sort(arr);
	}
	
}
