package com.srishti.DSA;

class Node {
	int key;
	Node left,right;
	
	public Node(int item) {
		key = item;
		left = right = null;
	}
	
}
class DFSTraversals {
		Node root;
		DFSTraversals() {
			root= null;	
		}
		void printPostOrder(Node node){
			if(node == null) {
				return;
			}
			printPostOrder(node.left);
			
			printPostOrder(node.right);
			
			System.out.print(node.key + " ");
		}
		
		void printInOrder(Node node) {
			if(node ==null){
				return;
			}
			
			printInOrder(node.left);
			System.out.print(node.key+" ");
			printInOrder(node.right);
			
		}
		void printPreOrder(Node node){
			if(node == null) {
				return;
			}
			System.out.print(node.key+" ");
			printPreOrder(node.left);
			printPostOrder(node.right);
		}
}

