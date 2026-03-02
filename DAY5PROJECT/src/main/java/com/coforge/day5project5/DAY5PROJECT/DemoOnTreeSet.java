package com.coforge.day5project5.DAY5PROJECT;

import java.util.TreeSet;
import java.util.Set;
import java.util.Iterator;

public class DemoOnTreeSet {

	public static void main(String[] args) {
		
		TreeSet<StudentClass> studentTree=new TreeSet<StudentClass>();
		StudentClass s1=new StudentClass(123,"Anmol",90);
		StudentClass s2=new StudentClass(234,"Shreya",89);
		StudentClass s3=new StudentClass(345,"Farhan",87);
		StudentClass s4=new StudentClass(567,"Rahul",76);
		StudentClass s5=new StudentClass(789,"Tarun",78);
		StudentClass s6=new StudentClass(908,"Tanvir",98);
		
		studentTree.add(s1);
		studentTree.add(s2);
		studentTree.add(s3);
		studentTree.add(s4);
		studentTree.add(s5);
		studentTree.add(s6);
		
		studentTree.forEach(s-> System.out.println(s));
		
		Iterator<StudentClass> itr=studentTree.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
		itr=studentTree.descendingIterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
		System.out.println("Descending Set");
		Set<StudentClass> set=studentTree.descendingSet();
		set.forEach(s-> System.out.println(s));
		
		StudentClass fromStud=new StudentClass(123,"",0);
		StudentClass toStud=new StudentClass(1234,"",0.0);
		Set<StudentClass> subset=studentTree.subSet(fromStud, toStud);
		System.out.println("------------------");
		System.out.println("Subset of Student Tree");
		subset.forEach(s->System.out.println(s));
		
		StudentClass s=new StudentClass(230,"",90);
		System.out.println(studentTree.ceiling(toStud));
		System.out.println(studentTree.floor(s));
		
		System.out.println(studentTree.higher(s));
		System.out.println(studentTree.lower(s));
		
		
		
		

	}

}
