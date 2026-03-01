package com.MenuDrivenPayment;
import java.util.Scanner;

public class MenuDrivenMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice;
		double amount;
		
		do {
			System.out.println("PAYMENT MENU:");
			System.out.println("1. Wallet");
			System.out.println("2. Card");
			System.out.println("3. UPI");
			System.out.println("4. NetBanking");
			System.out.println("5. EXIT");
			
			System.out.println("Enter Mode of Your Payment:");
			
			choice =sc.nextInt();
			if(choice==5) {
				System.out.println("Exiting... thankyou");
				break;
			}
			
			System.out.println("Enter the amount to pay:");
			amount=sc.nextDouble();
			
			Payment payment=null;
			
			switch(choice) {
			case 1: payment =new WalletPayment();
			break;
			case 2: payment =new CardPayment();
			break;
			case 3: payment =new UPIPayment();
			break;
			case 4: payment =new NetBanking();
			break;
			
			default: System.out.println("Invalid mode");
			
				
			}
			
			if(payment!=null) {
				payment.pay(amount);
			}
			
		}while(choice !=5);
		
		sc.close();
		

	}

}
