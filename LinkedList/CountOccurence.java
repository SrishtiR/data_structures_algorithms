package com.srishti.DSA;

public class CountOccurence extends LinkedListInsertion{
	int countOccurences(Node node, int n) {
		int count =0;
		while(node!=null){
			if(node.data == n){
				count++;
			}
			node = node.next;
		}
		return count;
	}
}
