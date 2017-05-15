package com.srishti.DSA;



public class MergeList extends LinkedListInsertion{
	Node mergeList(Node nodeA, Node nodeB) {
		Node nodeC = null;
		if(nodeA == null) {
			return nodeB;
		}
		if(nodeB == null) {
			return nodeA;
		}
		if(nodeA.data<nodeB.data) {
			nodeC = nodeA;
			nodeC.next = mergeList(nodeA.next, nodeB);
		} else {
			nodeC = nodeB;
			nodeC.next = mergeList(nodeA, nodeB.next);
		}
		return nodeC;
		
	}
	void printll(Node node) {
		while(node!=null){
			System.out.println(node.data);
			node = node.next;
		}
	}
}
