package com.coforge.project3;
//final classes cannot be extended no inheritance
public  class DemoonFinal {
	//FINAL METHOD
	private final String name="Anmol"; //intialize immediaetly or intialise at object creation
	// final methods cannot be overridden
	protected final void printDetails() {
		System.out.println(this.name);
	}
	
	public static void main(String[] args) {
		DemoonFinal dof=new DemoonFinal();
		dof.printDetails();
		//final can be applied to local variables
		final double pi=3.14;
		System.out.println(pi);
		//final variables cannot be reassigned 
		//pi=3.15;
	}

}
