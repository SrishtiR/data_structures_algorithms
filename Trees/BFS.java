package com.srishti.DSA;

public class BFS {
	Node root;
	BFS() {
		root = null;
	}
	

	int heightOfTree(Node node){
		if(node == null) {
			return 0;
		}
		int lheight = heightOfTree(node.left);
		int rheight = heightOfTree(node.right);
		
		if(rheight > lheight) {
			return rheight+1;
		} else {
			return lheight+1;
		}
		
	}
	
	
	void printLevelOrder(Node node) {
		for(int i = 1;i<=heightOfTree(node);i++) {
			printGivenLevel(node, i);
		}
	}
	void printGivenLevel(Node node, int i) {
		if(node ==null) {
			return;
		}
		if(i==1) {
			System.out.print(node.key+" ");
		} else {
			printGivenLevel(node.left, i-1);
			printGivenLevel(node.right, i-1);
		}
		
	}
}
