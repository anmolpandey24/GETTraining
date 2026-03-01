package com.payments;

public class Wallets extends Payment {
	private String mobilenum;
	private String bankname;
	public Wallets(double amount, String paymentDate,String mobilenum,String bankname) {
		super(amount, paymentDate);
		this.mobilenum=mobilenum;
		this.bankname=bankname;
		
		
	}
	@Override
	public void pay() {
		System.out.println("Wallet Payment of Rupees:" + amount);
		System.out.println("Mobile:" + mobilenum);
		System.out.println("bank:" +bankname);
		super.pay();
	}
	
	
	

}
