package com.coforge.project4.day4;

public class PetrolCar extends Car implements AddOns {

	@Override
	public void engineType() {
		System.out.println("Engine Type is Petrol type");
		
	}
	
	@Override
	public void audioSystem() {
		
		System.out.println("Audio system is with 6 speaker , woofers added");
	}

	public PetrolCar(String model) {
		super(model);
	}
	
	
	
	
	
	

}
