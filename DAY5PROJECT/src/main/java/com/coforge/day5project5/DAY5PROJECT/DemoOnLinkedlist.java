package com.coforge.day5project5.DAY5PROJECT;

import java.util.Iterator;
import java.util.LinkedList;

public class DemoOnLinkedlist {
	public static void main(String[] args) {
		
		LinkedList<Integer>llist=new LinkedList<Integer>();
		llist.add(12);
		llist.add(23);
		llist.add(33);
		llist.add(45);
		
		System.out.println(llist);
		
		llist.addFirst(77);
		llist.addFirst(67);
		System.out.println(llist);
		
		System.out.println(llist.element());
		
		LinkedList<Integer> llist1=new LinkedList<Integer>();
		llist1.add(12);
		llist1.add(23);
		llist1.add(33);
		llist1.add(45);
		llist1.addFirst(77);
		llist1.addFirst(67);
		
		System.out.println(llist.equals(llist1));
		System.out.println(llist.hashCode());
		System.out.println(llist1.hashCode());
		System.out.println(llist.peek());
		System.out.println(llist1.poll());
		
		
		Iterator<Integer> itr=llist.descendingIterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
	// Create Employee Linked list with 10 records
		// sort using Collection.sort on salary based
		// sort using comparators,branch dept,name,salary
		// ename,eid,salary,dept,branch
//		List<Integer> list=llist.reversed();
//		System.out.println(List);
	}

}
