package com.coforge.project4.day4;

public class GasCar extends Car implements AddOns {

	@Override
	public void engineType() {
		
		
	}
	
	@Override
	public void audioSystem() {
		
		System.out.println("Audio system with 4 speakers,woofers added");
	}

	public GasCar(String model) {
		super(model);
	}
	
	public void showWarrantyPolicy() {
		AddOns.warrantyPolicy();
	}
	
	
	
	

}
