package com.payments;

public class PaymentSystem {

	public static void main(String[] args) {
		UPI upi=new UPI(2000,"12-12-2025","anmol@upi","SBI");
		upi.pay();
		upi.printReceipt();
		
		System.out.println();
		
		Wallets wallet=new Wallets(1500,"23-06-2025","9878985645","HDFC");
		wallet.pay();
		
		System.out.println();
		
		Cards card=new Cards(5000,"04-08-2025","123456789657","123","12/28","Anmol");
		card.pay();
		
		System.out.println();
		
		NetBanking net=new NetBanking(3000,"09-10-2025","anmol123","ICICI");
		net.pay();
		
		System.out.println();
		

	}

}
