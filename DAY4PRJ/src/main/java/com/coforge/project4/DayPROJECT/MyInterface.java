package com.coforge.project4.DayPROJECT;
@FunctionalInterface
public interface MyInterface {
	
	public void display();
	
	public default void printDetails() {
		System.out.println("Default method of Myinterface");
	}
	
	public static void useParking(String compname) {
		System.out.println(compname+",using parking area");
	}
}
