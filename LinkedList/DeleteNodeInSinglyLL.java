

package com.srishti.DSA;

public class DeleteNodeInSinglyLL extends LinkedListInsertion {
	void deleteNode(Node node) {
		Node temp = node.next;
		node.data = temp.data;
		node.next = temp.next;
		temp = null;
	}
}
