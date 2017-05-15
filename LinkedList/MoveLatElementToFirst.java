package com.srishti.DSA;

public class MoveLatElementToFirst extends LinkedListInsertion {
	void moveLastElementToFirst(Node node) {
		Node prev = null;
		if(node.next == null){
			return;
		}
		while(node!=null && node.next!= null) {
			prev = node;
			node = node.next;
		}
		prev.next =null;
		node.next = head;
		head = node;
	}
}
