package com.srishti.DSA;
import java.util.*;
public class LinkedListL {
	public static void main(String args[]){
		LinkedList<String> l = new LinkedList<String>();
		l.add("a");
		l.add("b");
		System.out.println(l);
		l.addFirst("H");
		System.out.println(l);
		l.add(2,"w");
		
		l.addLast("m");
		System.out.println(l);
		Object val = l.get(1);
		l.set(1, (String)val + "CHanged");
		System.out.println(l);
	}
}
