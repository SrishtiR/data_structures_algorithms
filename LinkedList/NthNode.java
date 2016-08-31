package com.srishti.DSA;

public class NthNode extends LinkedListInsertion{
	int getNthNode(Node node, int x) {
		Node temp = node;
		int count = 0;
		while(temp!=null){
			if(x==count){
				return temp.data;
			}
			count++;
			temp = temp.next;
		}
		return -1;
	}
}
