package com.srishti.DSA;

public class DeleteAternateNodesLL extends LinkedListInsertion {
	void deleteAlternateNodesInLL(Node node) {
		Node prev = node;
		Node temp = null;
		if(node.next!=null) {
			temp = node.next;
		}
		while(prev!=null && temp!=null) {
			prev.next = temp.next;
			temp = null;
			prev = prev.next;
			if(prev!=null){
				temp = prev.next;
			}
		}
		
	}
	
	void deleteAltRecursive(Node node) {
		if(node==null) {
			return;
		}
		Node n = null;
		if(node.next == null){
			return;
		} else {
			n = node.next;
		}
		node.next = n.next;
		n = null;
		deleteAltRecursive(node.next);
	}
}
