package com.srishti.DSA;

import java.util.Queue;
import java.util.LinkedList;

class NodeA {
	int data;
	NodeA left, right;
	public NodeA(int item){
		data = item;
		left = null;
		right = null;
	}
}
public class LevelOrderQueue {
	NodeA root;
	
	void printLevelOrder() {
		Queue<NodeA> queue = new LinkedList<NodeA>();
		queue.add(root);
		while(!queue.isEmpty()){
			NodeA tempNode = queue.poll();
			System.out.println(tempNode.data+ " ");
			if(tempNode.left!=null) {
				queue.add(tempNode.left);
			}
			if(tempNode.right!=null) {
				queue.add(tempNode.right);
			}
		}
	}
	 public static void main(String args[]) 
	    {
	        /* creating a binary tree and entering 
	         the nodes */
	        LevelOrderQueue tree_level = new LevelOrderQueue();
	        tree_level.root = new NodeA(1);
	        tree_level.root.left = new NodeA(2);
	        tree_level.root.right = new NodeA(3);
	        tree_level.root.left.left = new NodeA(4);
	        tree_level.root.left.right = new NodeA(5);
	 
	        System.out.println("Level order traversal of binary tree is - ");
	        tree_level.printLevelOrder();
	    }
}
