package com.srishti.DSA;

public class PrintMiddleOfLL extends LinkedListInsertion {
	/*Method 1 */
	int printMidOfLL(Node node) {
		int count=0;
		int mid = 0;
		Node temp = node;
		while(temp!=null){
			count++;
			temp = temp.next;
		}
		temp = head;
		if(count%2 != 0) {
			mid = count/2;
		} else {
			mid = (count+1)/2;
		}
		for(int i=0;i<mid;i++){
			temp = temp.next;
		}
		return temp.data;
	}
	/*Method 2*/
	int printMidOfdLLTwoPointers(Node node) {
		
		Node tempa = node, tempb = node;
		while(tempb.next!=null && tempb.next.next!=null) {
			tempa = tempa.next;
			tempb = tempb.next.next;
		}
		return tempa.next.data;
	}
}
