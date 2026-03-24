package com.coforge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DemoClass {

	public static void main(String[] args) {
//		
//		int arr[]= {45,34,67,89,36,12,69};
//		Arrays.stream(arr).forEach(i->System.out.println(i));
//		List<int[]> list=Arrays.asList(arr);
		
		// intermediate operations
		//terminal operation
		
		// for each is terminal operation
//		arr.stream().forEach(i->System.out.println(i));
		
		Integer arr[]= {23,34,56,78,89};
		List<Integer> list=Arrays.asList(arr);
		list.stream().forEach(i->System.out.println(i));
		
		System.out.println("############################");
		
		list.stream().filter(i->i%2==0).forEach(i->System.out.println(i));
		
		System.out.println("############################");
		list.stream().filter(i->i%2==0).map(i->i*5).forEach(i->System.out.println(i));
		
		System.out.println("############################");
		
		List<Integer> collectedlist=list.stream().filter(i->i%2==0).map(i->i*5).limit(3).sorted().collect(Collectors.toList());
		System.out.println(collectedlist);
		
//		
		
		

	}

}
