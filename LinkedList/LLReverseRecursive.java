package com.srishti.DSA;

public class LLReverseRecursive extends LinkedListInsertion {
	void reverseRecursive(Node node) {
		if(node == null ){
			return;
		}
		reverseRecursive(node.next);
		System.out.print(node.data+" ");
	
	}
}
