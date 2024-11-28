package com.cg;

public class Account {
	private double balance;
	public Account()
	{
		balance = 0.0;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void deposit(double amount)
	{
		if(amount<=0)
		{
			throw new IllegalArgumentException("Deposit should be positive");
		}
		balance += amount;
	}
	
	public void withdraw(double amount)
	{
		if(amount<=balance)
		{
			throw new IllegalArgumentException("Withdraw should be positive");
		}
		if(amount > balance)
		{
			throw new IllegalArgumentException("Insufficient fund");
		}
		balance -= amount;
	}
}
