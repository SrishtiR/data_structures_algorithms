package com.srishti.DSA;


public class LinkedListInsertion {
	Node head;
	class Node {
		int data;
		Node next;
		Node(int d){
			data = d;
			next = null;
		}
	}
	/* Inserting in the beginning */
	public void push(int new_data) {
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
	}
	/* Inserting a node after a given node */
	public void insertAfter(Node prev_node,int new_data) {
		/* check if the given node is null */
		if(prev_node == null) {
			System.out.println("Previous node cannot be null");
			return;
		}
		
		Node new_node = new Node(new_data);
		
		new_node.next = prev_node.next;
		prev_node.next =new_node;
		
	}
	/* Inserting a node at the end */
	public void insertEnd(int new_data) {
		Node new_node = new Node(new_data);
		if(head == null) {
			head = new Node(new_data);
			return;
		}
		new_node.next = null;
		Node last =head;
		while(last.next!=null) {
			last = last.next;
		}
		last.next = new_node;
		return;
	}
	public void printList() {
		Node n = head;
		while(n!=null){
			System.out.print(n.data+" ");
			n = n.next;
		}
	}
	public static void main(String[] args) {
		LinkedListInsertion llist = new LinkedListInsertion();
		llist.push(1);
		llist.push(2);
		llist.insertEnd(3);
		llist.insertAfter(llist.head.next, 4);
		llist.printList();
		
	}
}
