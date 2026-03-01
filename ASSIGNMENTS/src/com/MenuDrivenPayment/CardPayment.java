package com.MenuDrivenPayment;

public class CardPayment implements Payment {

	@Override
	public void pay(double amount) {
		System.out.println("Processing payment through card");
		generateReciept(amount);
		
		
	}

	@Override
	public void generateReciept(double amount) {
		System.out.println("Card Payment successfull");
		System.out.println("Amount Paid"+amount);
		System.out.println("Reciept ID-45786545666");
		
	}
	

}
