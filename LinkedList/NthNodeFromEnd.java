package com.srishti.DSA;

public class NthNodeFromEnd extends LinkedListInsertion {
	/*Method 1*/
	static int j=0;
	int nthNodeFromEnd(Node node, int n){
		int count =0;
		Node temp = node;
		while(temp!=null){
			count++;
			temp = temp.next;
		}
		temp = node;
		for(int i=0;i<(count-n);i++){
			temp = temp.next;
		}
		return temp.data;
	}
	
	void nthNodeFromEndRecusrsive(Node node, int n){
		
		if(node == null) {
			return ;
		}
		nthNodeFromEndRecusrsive(node.next, n);
		if(++j == n){
			System.out.println(node.data);
		}
	}
	void nthNodeFromEndM2(Node node, int n) {
		Node ref = node, main = node;
		for(int i=0;i<n;i++) {
			ref = ref.next;
		}
		while(ref!=null){
			main = main.next;
			ref = ref.next;
		}
		System.out.println(main.data);
	}
}
