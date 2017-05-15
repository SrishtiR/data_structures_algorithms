package com.srishti.DSA;

public class LinkedListDeletion extends LinkedListInsertion {
	/* delete a node whose data is given */ 
	void deleteNode(int key) {
		Node temp = head, prev = null;
		if( temp !=null && temp.data ==key) {
			head = temp.next;
			return;
		}
		while(temp!=null && temp.data != key) {
			prev = temp;
			temp = temp.next;
		}
		
		prev.next = temp.next;
	}
	/* delete a node at a given position */
	void deleteAtGivenPosition(int pos) {
		Node temp = head, prev = null;
		int n=1;
		if(pos == 1) {
			head = temp.next;
			return;
		}
		while(temp.next!=null && n!=pos) {
			prev = temp;
			temp = temp.next;
			n++;
		}
		if(temp.next == null) {
			System.out.println("Position doesnt exist");
			return;
		}
		if(n==pos){
			prev.next = temp.next;
			return;
		}
	}
	
	public static void main(String[] args) {
		
		LinkedListDeletion d = new LinkedListDeletion();
		d.push(1);
		d.push(2);
		d.push(3);
		d.push(4);
		d.push(5);
		d.printList();
		d.deleteNode(3);
		d.printList();
		d.deleteAtGivenPosition(2);
		d.printList();
	}
}

