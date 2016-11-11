package com.srishti.DSA;

public class BubbleSort {
/* bubble sort in java
 * worst case and avg case time complexity : O(n^2) -> 
 * best case : O(nlogn) ->
 */
	
	public static void myBubbleSort(int arr[]) {
		int n = arr.length;
		
		for(int j= n; j>=0; j--) {
			for(int i = 0; i < n-1; i++) {
				
				if(arr[i] > arr[i+1]) {
					swapNumbers(i,i+1,arr);
				}
			}
		}
		printArray(arr, n);
	}
	public static void swapNumbers(int a, int b, int arr[]){
		int temp;
		temp = arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
		
	}
	public static void printArray(int arr[], int n) {
		for(int i = 0 ;i <n; i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static void main(String args[]){ 
		int a[] = {15,1,6,10,14};
		myBubbleSort(a);
		
		}
 }
