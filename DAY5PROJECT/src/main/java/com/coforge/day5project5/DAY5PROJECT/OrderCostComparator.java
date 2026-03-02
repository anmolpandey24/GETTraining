package com.coforge.day5project5.DAY5PROJECT;
import java.util.Comparator;

public class OrderCostComparator implements Comparator<CustomerClass> {

	@Override
	public int compare(CustomerClass o1, CustomerClass o2) {
		
		return (int)(o1.getOrdercost()-o2.getOrdercost());
	}
	
	
	

}
