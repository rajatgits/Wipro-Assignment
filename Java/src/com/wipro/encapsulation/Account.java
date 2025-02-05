package com.wipro.encapsulation;

public class Account {
	private int account;
	private double balance;
	
	public Account(int account, double balance) {
		this.account = account;
		this.balance = balance;
	}
 
	public int getAccount() {
		return account;
	}

	public double getBalance() {
		return balance;
	}
	
	public void depositMoney(double amount) {
		if(amount > 0) {
			System.out.println("Amount deposited" + amount);
		} else {
			System.out.println("Invalid amount");		}
	}
	
	public void withdrawMoney(double amount) {
		if(amount > 0 && amount <= balance) {
			System.out.println("Withdrawal amount" + amount);
		} else {
			System.out.println("Insufficient balance");
		}
	} 
}
