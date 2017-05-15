package com.srishti.DSA;

public class IntersectionPointOfTwoLinkedLists extends LinkedListInsertion{
	void intersectionPoint(Node nodeA, Node nodeB) {
		Node currA = nodeA;
		int lengthA = 0;
		Node currB = nodeB;
		int lengthB =0;
		while(currA!=null){
			lengthA++;
			currA = currA.next;
			
		}
		while(currB!=null){
			lengthB++;
			currB = currB.next;
		}
		System.out.println("\n");
		System.out.println(lengthA+" "+lengthB);
		int diff = lengthA-lengthB;
		while(diff!=0){
			nodeA = nodeA.next;
			diff--;
		}
		while(nodeA.next!=null && nodeB.next!=null && (nodeA.next != nodeB.next )) {
			nodeA = nodeA.next;
			nodeB = nodeB.next;
		}
		if(nodeA.next == nodeB.next) {
			System.out.println(nodeA.next.data);
		}
	}
}
