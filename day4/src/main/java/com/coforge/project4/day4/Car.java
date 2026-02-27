package com.coforge.project4.day4;

public abstract class Car {
	
	private String model;

	public Car(String model) {
		super();
		this.model = model;
	}

	public Car() {
		super();
	}
	
	public abstract void engineType();
	
	public void showModel() {
		System.out.println("Model : "+this.model);
	}
	
	public void showWarrantyPolicy() {
		AddOns.warrantyPolicy();
	}

}
