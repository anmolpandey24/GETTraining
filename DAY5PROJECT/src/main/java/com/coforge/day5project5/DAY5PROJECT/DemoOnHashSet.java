package com.coforge.day5project5.DAY5PROJECT;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class DemoOnHashSet {

	public static void main(String[] args) {
		
		HashSet<Integer> hset=new HashSet<Integer>();
		hset.add(56);
		hset.add(12);
		hset.add(90);
		hset.add(89);
		
		System.out.println(hset);
		
		hset.add(90);
		System.out.println(hset);
		hset.add(null);
		System.out.println(hset);
		
//		for(Integer i:hset)
//			System.out.println(i);
//		
//		Predicate<Integer> isEven=(e)->e%2==0;
//		hset.removeIf(isEven));
		
		LinkedHashSet<Integer> lset=new LinkedHashSet<Integer>();
		lset.add(80);
		lset.add(67);
		lset.add(89);
		lset.add(32);
		System.out.println(lset);
		
		
	

}
}
