package com.srishti.DSA;

public class MaxElementInFirstIncreasingThenDecreasingArray {
	/* http://www.geeksforgeeks.org/find-the-maximum-element-in-an-array-which-is-first-increasing-and-then-decreasing/
	 * Using modified binary search technique
	 */
	public int maxElementInFirstIncreasingThenDescreasingArray(int ar[], int low, int high){
		if(high == low+1 && ar[low]>ar[high]){
			return ar[low];
		}
		if(high == low+1 && ar[low]<ar[high]){
			return ar[high];
		}
		int mid = (high+low)/2;
		if(ar[mid]>ar[mid-1] && ar[mid]>ar[mid+1]){
			return ar[mid];
		}
		if(ar[mid]>ar[mid-1] && ar[mid]<ar[mid+1]) {
			return maxElementInFirstIncreasingThenDescreasingArray(ar,mid+1,high);
		}
		if(ar[mid]<ar[mid-1] && ar[mid]>ar[mid+1]){
			return maxElementInFirstIncreasingThenDescreasingArray(ar,low,mid);
		}
		return -1;
	}
}
