package com.coforge.project3;

public class Outer {
	
	static String name;
	
	
	public static void printDetails() {
		name="Anmol";
		System.out.println("Name: "+name);
	}
//	nested class
	static class Inner{
		
		private String innerName;
		public void printDetailsofinnerName() {
			this.innerName="Michael";
			System.out.println(innerName);
		}
	}
	
	public static void main(String[] args) {
		
//		Outer out=new Outer();
//		out.printDetails();
//		
//		
////		object creation in inner class
//		Outer.Inner in=new Outer().new Inner();
//		in.printDetailsofinnerName();
		
		Outer.name="Anmol Pandey";
		Outer.printDetails();
		
		Inner inner=new Inner(); // if inner class is static we do not need outer object to instansiate
		inner.printDetailsofinnerName();
	}
	
	

}
