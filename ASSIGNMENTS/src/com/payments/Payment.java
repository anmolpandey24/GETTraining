package com.payments;

public class Payment {
	protected double amount;
	protected String paymentDate;
	public Payment(double amount, String paymentDate) {
		super();
		this.amount = amount;
		this.paymentDate = paymentDate;
	}
	
	public void pay() {
		System.out.println("Payment processing...");
	}
	

}
