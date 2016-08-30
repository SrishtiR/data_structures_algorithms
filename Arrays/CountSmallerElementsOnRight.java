package com.srishti.DSA;

public class CountSmallerElementsOnRight {
	/*http://www.geeksforgeeks.org/count-smaller-elements-on-right-side/
	 * Method 1 
	 * O(n square)
	 */
	void countSmallerElementsOnRight(int arr[], int size) {
		int countArr[] = new int[size];
		for(int i =0; i<size;i++) {
			countArr[i] = 0;
		}
		for(int i=0;i<size;i++) {
			for(int j=i+1;j<size;j++){
				if(arr[j]<arr[i]){
					countArr[i]++;
				}
			}
		}
		for(int i:countArr){
			System.out.print(i+" ");
		}
		
	}
	/* Method 2: self balancing BST
	 * O(nlogn)
	 */
}
