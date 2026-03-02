package com.coforge.DAY6PRJ.DAY6PROJECT;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class DemoOnMaps {
	public static void main(String[] args) {
		
		HashMap<Integer,String> hashmap=new HashMap<Integer, String>();
		hashmap.put(1, "Anmol"); //map entry
		hashmap.put(2,"Shobit");
		hashmap.put(3,"Raghav");
		hashmap.put(7, "swapna");
		
		System.out.println(hashmap);
		
		for(Integer key:hashmap.keySet())
			System.out.println(key);
		
		for(String val:hashmap.values())
			System.out.println(val);
		
//		hashmap.put(null, "amit");
//		System.out.println(hashmap);
		
		
		System.out.println(hashmap.containsKey(2));
		System.out.println(hashmap.containsValue("Anmol"));
		Set<Entry<Integer,String>> entrySet=hashmap.entrySet();
		System.out.println(entrySet);
		
		Iterator<Entry<Integer,String>> itr=entrySet.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
		System.out.println(hashmap.get(2));
		
		TreeMap<Integer, String> fruitTree=new TreeMap<Integer, String>();
		fruitTree.put(1, "Apple");
		fruitTree.put(2, "Orange");
        fruitTree.put(3, "Banana");
        fruitTree.put(4, "Grapes");
        
		System.out.println(fruitTree);
		
		for(Integer key:fruitTree.keySet())
			System.out.println(key+"-->"+fruitTree.get(key));

		
		
		
		
		
	}

}
