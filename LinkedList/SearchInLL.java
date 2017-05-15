package com.srishti.DSA;

public class SearchInLL extends LinkedListInsertion{
	/* Iterative solution */
	boolean search(Node node, int x) {
		Node temp = node;
		while( temp !=null) {
			
			if(temp.data == x) {
				return true;
			}
			temp = temp.next;
		}
		return false;
	}
	/* Recursive solution */
	boolean searchRecursive(Node node, int x) {
		if(node == null) {
			return false;
		}
		if(node.data == x) {
			return true;
		} else {
			return searchRecursive(node.next, x);
		}
	}
	
}
