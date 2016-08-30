package com.srishti.DSA;

public class MaximumLengthBitonicSubarray {
	public int maxLengthBitonicSubarray(int arr[], int size) {
		int[] inc = new int[size];
		int[] dec = new int[size];
		int max;
		inc[0] = 1;
		dec[size-1] = 1;
		for(int i=1;i<size;i++) {
			if(arr[i-1]<=arr[i]){
				inc[i] = inc[i-1]+1; 
			} else {
				inc[i] = 1;
			}
		}
		for(int i=size-2;i>=0;i--){
			if(arr[i+1]<=arr[i]) {
				dec[i] = dec[i+1] +1; 
			} else {
				dec[i] = 1;
			}
		
		}
		max  = inc[0]+dec[0]-1;
		for(int i=1;i<size;i++) {
			if((inc[i]+dec[i]-1)>max) {
				max = inc[i]+dec[i]-1;
				}
		}
		return max;
	}
	
	
}
