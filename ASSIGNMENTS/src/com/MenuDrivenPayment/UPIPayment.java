package com.MenuDrivenPayment;

public class UPIPayment implements Payment {

	@Override
	public void pay(double amount) {
		System.out.println("Processing UPI payment....");
		generateReciept(amount);
		
		
	}

	@Override
	public void generateReciept(double amount) {
		System.out.println("Upi payment successfull");
		System.out.println("amount paid:"+amount);
		System.out.println("reciept Id:123456");
				
		
		
	}
	

}
