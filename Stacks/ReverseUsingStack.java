package com.srishti.DSA;

public class ReverseUsingStack {
	private Stack st = new Stack();
	private String output = "";
	public String reverseWord(String input) {
		for (char a : input.toCharArray()) {
			st.push(a);
		}
		while(st.peek() != null) {
			char x = (Character) st.pop();
			output = output + x;
		}
		return output;
	}
	public static void main(String[] args) {
		ReverseUsingStack k = new ReverseUsingStack();
		System.out.println("Reversed word is: " + k.reverseWord("abcdef"));
		
	}
	

}
