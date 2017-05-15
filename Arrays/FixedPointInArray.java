
package com.srishti.DSA;

public class FixedPointInArray {
	/* Find a Fixed Point in a given array -
	 * Linear Search
	 * O(n)*/
	public int fixedPoint(int[] arr, int size) {
		for(int i=0;i<size;i++) {
			if(i==arr[i]){
				return i;
			}
		}
		return -1;
	}
	/* Find a Fixed Point in a given array -
	 * Binary Search
	 * O(log(n)) */
	public int fixedPointUsingBinarySearch(int[] arr,int low,int high){
		int mid = (low+high)/2;
		if(mid == arr[mid]){
			return mid;
		}
		if(mid > arr[mid]) {
			return fixedPointUsingBinarySearch(arr,(mid+1),high);
		} else {
			return fixedPointUsingBinarySearch(arr,low,mid-1);
		}
	}
}
