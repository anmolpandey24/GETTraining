package com.coforge.project4.day4;

public interface AddOns {
	
	public default void audioSystem() {
		System.out.println("Audio System with default 2 speakers");
		
	}
	
	public default void roofOpen() {
		System.out.println("By default roof open disabled");
	}
	
	public static void warrantyPolicy() {
		System.out.println("warranty period : 3 years");
	}

}
