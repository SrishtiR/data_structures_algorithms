package com.srishti.DSA;


public class LoopDetectionInLL extends LinkedListInsertion {
	boolean detectLoopInLL(Node node) {
		Node slowPtr =node;
		Node fastPtr = node;
		while( fastPtr!=null && fastPtr.next != null && slowPtr != null ) {
			slowPtr = slowPtr.next;
			fastPtr = fastPtr.next.next;
			if(slowPtr == fastPtr) {
				return true;
			}
		}
		return false;
	}
}
