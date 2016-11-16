package com.srishti.DSA;



/* Backtracking
 * Given a set of characters and a positive integer k
 * print all possible strings of length k that can be formed from the given set
 */
public class GenerateAllstrings {
	static void printKLength(char[] set, int k) {
		int n = set.length;
		printKLengthRec(set, "", n, k);
	}
	static void printKLengthRec(char[] set, String prefix, int n, int k) {
		
		if(k==0) {
			
			System.out.println(prefix);
			return;
		}
		for(int i = 0; i< n; i++) {
			//System.out.println(i);
			//System.out.println(k);
			String newPrefix = prefix + set[i];
			printKLengthRec(set, newPrefix, n, k-1);
			
		}
	}
	
	public static void main(String[] args) {
		char[] set = {'a','b'};
		int k = 3;
		printKLength(set, k);
	}
}
