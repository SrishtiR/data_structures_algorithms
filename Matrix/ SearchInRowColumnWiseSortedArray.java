package com.srishti.DSA;


//given an n*n matrix with sorted rows and columns, search for an element n//

public class SearchInRowColumnWiseSortedMatrix {
	public static void main(String[] args) {
		int n = 4;
		int arr[][] = { {10,20,30,40},
				          {15,25,35,45},
				          {27,29,37,48},
				          {32,33,39,50}
						};
		search(arr, n, 29);
		}
	
	public static void search(int[][] arr, int n, int g) {
		int i=0;
		int j = n-1;
		while(i<n && j>0){
			if(arr[i][j] == g){
				System.out.println("Match found at position"+i+","+j);
			}
			if(arr[i][j] > g) {
				j--;
			} else {
				i++;
			}
		}
	}
}
