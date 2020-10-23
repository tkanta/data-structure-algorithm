package com.ds.linklist;

import java.util.Iterator;
import java.util.LinkedList;

public class CombineTwoLinkList {

	private static LinkedList<Integer> first = new LinkedList<Integer>();
	private static LinkedList<Integer> second = new LinkedList<Integer>();
	
	public static void main(String[] args) {
		first.add(1);
		first.add(2);
		first.add(3);
		System.out.println("-----------");
		second.add(4);
		second.add(5);
		second.add(6);
		System.out.println("-----------");
		/*
		 * LinkedList<Integer> stack = new LinkedList<Integer>(); Iterator<Integer>
		 * secondItr = second.iterator(); while(secondItr.hasNext()) {
		 * stack.add(secondItr.next()); }
		 */
		
		Iterator<Integer> firstItr = first.iterator();
		while(firstItr.hasNext()) {
			System.out.println(firstItr.next()+","+second.removeLast());
		}
	}
	
}
