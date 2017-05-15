package com.srishti.DSA;

public class IntersectionOfTwoSortedLL extends LinkedListInsertion {
	/*http://www.geeksforgeeks.org/union-and-intersection-of-two-linked-lists/ */
	void intersectionOfSortedLL(Node nodeA, Node nodeB) {
		Node newB = nodeB;
		LinkedListInsertion newList = new LinkedListInsertion();
		while(nodeA!=null ) {
			//if(isPresentInB(nodeA.data)){
				//newList.append(nodeA.data);
			while(nodeB!=null){
				if(nodeA.data == nodeB.data){
					newList.push(nodeA.data);
				}
				nodeB = nodeB.next;
						
			}
			nodeA = nodeA.next;
			nodeB = newB;
		}
		newList.printList();
	}
	
	Node sortedIntersect(Node nodeA, Node nodeB) {
		
		if(nodeA.data > nodeB.data) {
			return sortedIntersect(nodeA, nodeB.next);
		}
		if(nodeA.data < nodeB.data) {
			return sortedIntersect(nodeA.next, nodeB);
		}
	
	
	}
	
}
