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
	Node reverseLLRecursive(Node node, Node prev) {
		if(node == null) {
			return  null;
		}
		if(node.next == null) {
			head = node;
			node.next = prev;
			return null;
		}
		Node nextl = node.next;
		node.next = prev;
		reverseLLRecursive(nextl, node);
		
		return head;
	}
	
	void printll(Node node) {
		while(node!=null){
			System.out.println(node.data);
			node = node.next;
		}
	}
}
