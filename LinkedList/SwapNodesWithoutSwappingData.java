package com.srishti.DSA;



public class SwapNodesWithoutSwappingData extends LinkedListInsertion {
	void swapNodes(Node node, int x, int y) {
		Node tempx =node, tempy = node, prevx = null, prevy = null;
		Node temp = null;
		while(tempx.data != x){
			prevx = tempx;
			tempx = tempx.next;
		}
		
		while(tempy.data !=y){
			prevy = tempy;
			tempy = tempy.next;
		}
		temp = tempx.next;
		tempx.next = tempy.next;
		tempy.next = temp;
		prevx.next = tempy;
		prevy.next = tempx;
	}
}
