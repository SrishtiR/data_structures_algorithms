package com.srishti.DSA;

import java.util.Scanner;

public class Factorial {
	public static void main(String args[]) {
		System.out.println("Enter the number");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int res;
		Factorial f = new Factorial();
		res = f.Fact(n);
		System.out.println("Factorial:"+ res);
	}
	int Fact(int n){
		if(n==0)
			return 1;
		else if(n==1){
			return 1;
		}
		else {
			return n*Fact(n-1);
		}
	}
}
