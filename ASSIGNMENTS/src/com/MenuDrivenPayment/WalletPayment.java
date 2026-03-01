package com.MenuDrivenPayment;

public class WalletPayment implements Payment {

	@Override
	public void pay(double amount) {
		System.out.println("Processing payment through wallet");
		generateReciept(amount);
		
	}

	@Override
	public void generateReciept(double amount) {
		System.out.println("Payment through wallet is successfull");
		System.out.println("Amount paid"+amount);
		System.out.println("Reciept Id-6789543333");
		
	}
	

}
