package com.srishti.DSA;

public class RemoveDuplicatesFromSortedList extends LinkedListInsertion{
	void removeDuplicatesFromASortedList(Node node) {
		
		Node temp;
		while(node.next != null ) {
			temp = node.next;
			if(temp.data==node.data) {
				node.next = temp.next;
				temp = null;
				
			} else {
			node = node.next;
			}
		}
	
	}
}
