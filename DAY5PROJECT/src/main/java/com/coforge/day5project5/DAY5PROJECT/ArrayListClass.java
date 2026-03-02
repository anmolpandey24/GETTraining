package com.coforge.day5project5.DAY5PROJECT;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListClass {

	public static void main(String[] args) {
		
//		ArrayList alist=new ArrayList();
//		alist.add("Anmol");
//		alist.add(56);
//		alist.add(true);
//		alist.add(78.89);
//		alist.add(45.45f);
//		alist.add('S');
//		
//		for(int i=0;i<alist.size();i++) {
//			System.out.println(alist.get(i));
//			
//		System.out.println("------------");
//			
//		alist.add("Anmol");
//		alist.add(56);
//		alist.add(true);
//		alist.add(78.89);
//		alist.add(45.45f);
//		alist.add('S');
//			
//		for(int i=0;i<alist.size();i++) {
//			System.out.println(alist.get(i));
//			
//			
//		System.out.println(alist);
//		
//		}
//
//	}
		
		ArrayList<Integer> intAlist=new ArrayList<Integer>();
		intAlist.add(54);
		intAlist.add(45);
		intAlist.add(34);
		intAlist.add(90);
		intAlist.add(90);
		intAlist.add(90);
		// intAlist.add(null);
		
		System.out.println(intAlist);
		
//		for(int i=0;i<intAlist.size();i++) {
//			System.out.println(intAlist.get(i));
			
		for(Integer i:intAlist)
			System.out.println(i);
		
//		Integer iobj=567;
//		int i1=iobj.intValue(); //UNBOXING
		
//		
//		Iterator<Integer> itr=intAlist.iterator();
//		while(itr.hasNext()) {
//			Integer i=itr.next();
//			if(i==45)
//				itr.remove();
//			System.out.println(i);
//		}
//		
//		System.out.println("After deletion:");
//		System.out.println(intAlist);
			// System.out.println(itr.next());
//		System.out.println("Forward direction:");
//		ListIterator<Integer> listItr=intAlist.listIterator();
//		while(listItr.hasNext())
//			System.out.println(listItr.next());
//		
//		System.out.println("Reverse direction:");
//		
//		while(listItr.hasPrevious())
//			System.out.println(listItr.previous());
//		
		ArrayList<Integer> alist=new ArrayList<Integer>();
		alist.add(54);
		alist.add(34);
		alist.add(89);
		alist.add(0,11);
		System.out.println(alist);
//		
//		//adding another collection at a given position
//		intAlist.addAll(3,alist);
//		
//		System.out.println("After addall method");
//		System.out.println(intAlist);
		
//		System.out.println(intAlist);
//		
//		System.out.println(intAlist);
//		intAlist.remove(2);
//		System.out.println(intAlist);
//		Integer i=45;
//		intAlist.remove(i);
//		System.out.println(intAlist);
		
//		intAlist.removeAll(alist);
//		System.out.println("After removeall collection:");
//		System.out.println(intAlist);
//		System.out.println(alist);
		
		intAlist.replaceAll(e->e+10);
		System.out.println(intAlist);
		
//		System.out.println("before clear"+alist);
//		alist.clear();
//		System.out.println("After clear"+alist);
//		Integer i=999;
//		intAlist.addFirst(i);
//		System.out.println(intAlist);
		
//		ArrayList<Integer> clonedArrayList=(ArrayList<Integer>) alist.clone();
//		System.out.println(clonedArrayList);
//		
//		System.out.println(alist.hashCode());
//		System.out.println(clonedArrayList.hashCode());
//		
////		clonedArrayList.add(78);
//		alist.add(67);
//		System.out.println(alist);
//		System.out.println(clonedArrayList);
//		System.out.println(alist.hashCode());
//		System.out.println(clonedArrayList.hashCode());
//		
//		System.out.println(alist.contains(34));
//		System.out.println(alist.containsAll(intAlist));
//		
		
		//another approach to print the elements one by one using foreach
//		alist.forEach(e->System.out.println(e));
//		System.out.println(alist.indexOf(89));
//		System.out.println(alist.isEmpty());
//		intAlist.retainAll(alist);
//		System.out.println(intAlist);
//		System.out.println(alist);
//		
//		System.out.println(alist.toString().getClass());
		
		Collections.sort(alist);
		System.out.println(alist);
		
		//Object[] obj=alist.toArray();
		
	    Integer [] arr=alist.toArray(new Integer[0]);
	    System.out.println(arr[2]);
	    
	    //Converting integer array to as list
//	    Integer[] arr1= {23,67,89,09,89};
//	    List<Integer> list=Arrays.asList(arr1);
		
		
		
		
		}
		

 }
 
