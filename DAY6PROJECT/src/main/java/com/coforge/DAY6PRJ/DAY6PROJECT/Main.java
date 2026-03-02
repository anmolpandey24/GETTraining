package com.coforge.DAY6PRJ.DAY6PROJECT;

import java.util.HashSet;
import java.util.Scanner;

public class Main {

 static HashSet<Employee> empSet=new HashSet<Employee>();


static {
	
	empSet.add(new Employee(123,"Anmol",80000));
	empSet.add(new Employee(456,"Shreya",70000));
	empSet.add(new Employee(657,"Tarun",90000));
	empSet.add(new Employee(789,"Arjun",90000));
	empSet.add(new Employee(890,"Wajar",40000));
}


	public static void main(String[] args) {
		
		empSet.forEach(e->System.out.println(e));
		
//		create/insert
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee Details: empid,empname,salary");
		Employee emp=new Employee(sc.nextLong(),sc.next(),sc.nextDouble());
		
		empSet.add(emp);
		
		// update
		System.out.println("Enter Employee id for updation");
		long id=sc.nextLong();
		if(empSet.contains(emp.getEmpId())) {
			
		}
		
		//delete
	
	}
}

