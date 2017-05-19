package com.srishti.DSA;

public class Queue {
	private Node front, rear;
	private int currentSize;
	
	class Node {
	int data;
	Node next;
	}
	public Queue() {
		front = null;
		rear = null;
		currentSize = 0;
	}
	boolean isEmpty() {
		return (currentSize == 0);
	}
	void enQueue(int data) {
		Node oldRear = rear;
		rear = new Node();
		rear.data = data;
		rear.next = null;
		if(isEmpty()) {
			front = rear;
		} else {
			oldRear.next = rear;
		}
		currentSize++;
		System.out.println(data + "has been added");
	}
	
	int deQueue() {
		int data = front.data;
		front = front.next;
		if(isEmpty()) {
			rear = null;
		}
		currentSize--;
		System.out.println(data + "has been removed");
		return data;
		
	}
	
 	public static void main(String[] args) {
		Queue qc= new Queue();
		qc.enQueue(2);
		qc.enQueue(7);
		qc.enQueue(80);
		qc.enQueue(74);
		qc.deQueue();
	}
}
