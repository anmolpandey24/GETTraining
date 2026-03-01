package com.payments;

public class Cards extends Payment{
	private String cardnum;
	private String  cvv;
	private String expiryDate;
	private String name;
	public Cards(double amount, String paymentDate,String cardnum,String cvv,String expiryDate,String name) {
		super(amount, paymentDate);
		this.cardnum=cardnum;
		this.cvv=cvv;
		this.expiryDate=expiryDate;
		this.name=name;
		
		
		
	}
	@Override
	public void pay() {
		System.out.println("Card Payment of Rupees:" + amount + "successfull");
		
		
		super.pay();
		
	}
	
	
	

}
