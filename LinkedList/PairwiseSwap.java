package com.srishti.DSA;



public class PairwiseSwap extends LinkedListInsertion{
	void pairwiseSwap(Node node) {
		while(node.next!=null) {
		Node temp= node.next;
		int d;
		d = temp.data;
		temp.data = node.data;
		node.data = d;
		if(node.next.next!=null){
		node = node.next.next;	
		} else {
			return;
		}
		}
	}
}
