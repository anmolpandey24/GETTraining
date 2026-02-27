package com.coforge.project4.day4;

public class CarMain {

	public static void main(String[] args) {
		PetrolCar pcar=new PetrolCar("Swift");
		pcar.engineType();
		pcar.audioSystem();
		pcar.showModel();
		pcar.roofOpen();
		pcar.showWarrantyPolicy();
		
		DieselCar dcar=new DieselCar("Scorpio");
		dcar.engineType();
		dcar.audioSystem();
		dcar.showModel();
		dcar.roofOpen();
		dcar.showWarrantyPolicy();
		
		GasCar gcar=new GasCar("Ertiga");
		gcar.engineType();
		gcar.audioSystem();
		gcar.showModel();
		gcar.roofOpen();
		gcar.showWarrantyPolicy();
		

	}

}
