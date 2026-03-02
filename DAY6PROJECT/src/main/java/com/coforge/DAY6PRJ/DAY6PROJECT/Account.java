package com.coforge.DAY6PRJ.DAY6PROJECT;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString

public class Account {
	
	private long accId;
	private String accHoldername;
	private String bankname;
	private double balance;
	
	public void withdraw(double amount) {
		if(amount<=this.balance)
		{
			this.balance-=amount;
			System.out.println("Withdraw successfull");
		}
		else
			System.out.println("Insufficient balance");
	}
	
	public void deposit(double amount) {
		this.balance+=amount;
		System.out.println("amount deposited");
	}
	

}
