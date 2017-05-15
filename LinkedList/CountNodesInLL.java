package com.srishti.DSA;

public class CountNodesInLL extends LinkedListInsertion {
	/*Iterative solution */
	int getCount(){
		Node temp = head;
		int count=0;
		while(temp!=null){
			temp=temp.next;
			count++;
		}
		return count;
	}
	/* Recursive solution*/
	int getCountRecursive(Node node) {
		if(node == null) {
			return 0;
		} else {
			return 1+getCountRecursive(node.next);
		}
	}
}
