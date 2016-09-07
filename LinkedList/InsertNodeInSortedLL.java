package com.srishti.DSA;

public class InsertNodeInSortedLL extends LinkedListInsertion {
	Node insertInSortedManner(Node node, int d) {
		Node newnode = new Node(d);		
		if(node == null) {
			head = newnode;
			return head;
		}
		if(d<head.data) {
			newnode.next = head;
			head = newnode;
			return head;
		}
		Node prev = null;
		while(node!=null && node.data < d ) {
			prev = node;
			node =node.next;
		}
		prev.next = newnode;
		newnode.next = node;
		return head;
	}
}
