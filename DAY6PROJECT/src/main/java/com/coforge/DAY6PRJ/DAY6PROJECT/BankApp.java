package com.coforge.DAY6PRJ.DAY6PROJECT;

public class BankApp {
	public static void main(String[] args) {
		Account acc=new Account(1234567,"Anmol","ICICI",20000);
		acc.withdraw(10000);
		acc.deposit(10000);
		acc.withdraw(30000);
		acc.deposit(20000);
	}

}
