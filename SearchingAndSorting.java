package com.srishti.DSA;

public class SearchingAndSorting {
	public int linearSearch(int[] arr, int size, int n){
		for(int i=0;i<size;i++){
			if(arr[i] == n){
				return i;
			}
		}
		return -1;
	}
	/* Binary search recursive */
	public int binarySearch(int arr[], int l, int r, int x){
		if(r>l) {
			int mid = l+(r-l)/2;
			if(arr[mid] == x){
				return mid;
			}
			if(arr[mid]<x){
				l++;
			}
			if(arr[mid]>x){
				r--;
			}
			return binarySearch(arr,l,r,x);
		}
		return -1;
	}
	
	/* Binary search iterative */
}
