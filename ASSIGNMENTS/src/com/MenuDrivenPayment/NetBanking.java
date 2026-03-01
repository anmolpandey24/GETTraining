package com.MenuDrivenPayment;

public class NetBanking implements Payment {

	@Override
	public void pay(double amount) {
		System.out.println("Processing net banking payment");
		generateReciept(amount);
		
		
	}

	@Override
	public void generateReciept(double amount) {
		System.out.println("Net Banking payment successfull");
		System.out.println("Amount Paid:"+amount);
		System.out.println("Reciept ID-458976566666");
		
		
	}
	

}
