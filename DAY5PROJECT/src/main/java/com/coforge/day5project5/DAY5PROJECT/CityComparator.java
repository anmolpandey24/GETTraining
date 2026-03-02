package com.coforge.day5project5.DAY5PROJECT;
import java.util.Comparator;

public class CityComparator implements Comparator<CustomerClass>{

	@Override
	public int compare(CustomerClass o1, CustomerClass o2) {
		
		return o1.getCity().compareTo(o2.getCity());
	}
	
	
	

}
