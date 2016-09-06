package com.srishti.DSA;

public class ReverseLinkedList extends LinkedListInsertion{
	Node reverseLinkedList(Node node) {
		Node prev = null;
		Node current = node;
		Node next = null;
		while(current!=null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
			
		}
		node = prev;
		return node;
	}
	void printll(Node node) {
		while(node!=null){
			System.out.println(node.data);
			node = node.next;
		}
	}
}
