package com.opps;

public class App1 {
	
	private int balance=0;
	private String name="";
	public int age=0;
	
	public App1(int balance, String name, int age) {
		super();
		this.balance = balance;
		this.name = name;
		this.age = age;
	}
	public int getBalance() {
		return balance;
	}
	/*
	public void setBalance(int balance) {
		this.balance = balance;
	}*/
	public void deposite(int newbalance)
	{
		balance+=newbalance;
		System.out.println("New Balance is:: "+balance);
	}
	public void Withdrawal(int amount)
	{
		int test;
		if (amount > 0) {
			test=balance-amount;
			if (test<=0)
				System.out.println("try again...your balance is ::"+balance);
		}
			else {
				balance-=amount;
				System.out.println(balance);
			}
	}
	
	public void display()
	{
		System.out.println("\nName of Customer is:: "+name+" \nBalance Is ::"+balance+" \nAge:: "+age);
	}
	@Override
	public String toString() {
		return "App1 [balance=" + balance + ", name=" + name + ", age=" + age + "]";
	}
	
}
