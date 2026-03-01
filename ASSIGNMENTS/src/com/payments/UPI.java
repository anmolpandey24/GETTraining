package com.payments;

public class UPI extends Payment{
	private String upiId;
	private String bankname;
	public UPI(double amount, String paymentDate, String upiId,String bankname) {
		super(amount, paymentDate);
		this.upiId=upiId;
		this.bankname=bankname;
	}
	@Override
	public void pay() {
		System.out.println("UPI Payment of amount" + amount + "done successfully");
		super.pay();
	}
	
	public void printReceipt() {
		System.out.println("UPI RECIEPT");
		System.out.println("amount" +amount);
		System.out.println("payment date" +paymentDate);
		System.out.println("upiId" +upiId);
		System.out.println("bankname" +bankname);
	}
	
	
	 
	
	

}
