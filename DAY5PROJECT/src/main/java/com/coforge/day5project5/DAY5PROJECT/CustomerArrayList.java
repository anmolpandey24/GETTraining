package com.coforge.day5project5.DAY5PROJECT;
import java.util.ArrayList;
import java.util.Collections;

public class CustomerArrayList {
	public static void main(String[] args) {
		 
		CustomerClass c1=new CustomerClass(1,"Anmol","Hyderabad",50000);
		CustomerClass c2=new CustomerClass(2,"Amit","Bangalore",60000);
		CustomerClass c3=new CustomerClass(3,"Sapna","Delhi",70000);
		CustomerClass c4=new CustomerClass(4,"Shreya","Agra",67000);
		CustomerClass c5=new CustomerClass(5,"Abhay","Mumbai",80000);
		CustomerClass c6=new CustomerClass(6,"Wajir","Lucknow",90000);
		
		ArrayList<CustomerClass> custList=new ArrayList<CustomerClass>();
		custList.add(c1);
		custList.add(c2);
		custList.add(c3);
		custList.add(c4);
		custList.add(c5);
		custList.add(c6);
		
//		Collections.sort(custList);
		custList.sort(new CityComparator().thenComparing(new OrderCostComparator()));
		
		custList.forEach(cust->System.out.println(cust));
		
	}

}
