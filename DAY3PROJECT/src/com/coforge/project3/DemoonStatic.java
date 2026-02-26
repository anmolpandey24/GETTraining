package com.coforge.project3;

public class DemoonStatic {
	
//	static {
//		System.out.println("my first static block");
//	}
//	
//	static {
//		System.out.println("my second static block");
//	}
//	JVM WILL CALL THE STATIC MAIN METHOD
//THESE STATIC BLOCKS ARE ALSO EXECUTED BY JVM
	
	private String companyName="Coforge";
	public void printName(String name) {
		System.out.println(name);
		System.out.println(this.companyName);
	}
	public static void main(String[] args) {
		System.out.println("inside main");
		DemoonStatic ds=new DemoonStatic();
		ds.printName("Anmol");
		
		DemoonStatic ds1=new DemoonStatic();
		ds1.printName("ABC");
	}
	
	
	
//	static {
//		System.out.println("my third static block");
//	}
//	
//	static {
//		System.out.println("my fourth static block");
//	}

}
