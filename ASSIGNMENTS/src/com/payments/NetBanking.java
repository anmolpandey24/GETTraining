package com.payments;

public class NetBanking extends Payment {
	private String userID;
	private String bankname;
	public NetBanking(double amount, String paymentDate,String userID,String bankname) {
		super(amount, paymentDate);
		this.userID=userID;
		this.bankname=bankname;
		
		
		
	}
	@Override
	public void pay() {
		System.out.println("Netbanking payment of:" + amount + "is successfull");
		System.out.println("userId:"+userID);
		System.out.println("bankname:"+bankname);
		super.pay();
	}
	
	
	

}
