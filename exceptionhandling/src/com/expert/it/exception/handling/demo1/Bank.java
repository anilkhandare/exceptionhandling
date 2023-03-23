package com.expert.it.exception.handling.demo1;

public class Bank{
	private int accountNumber;
	private String name;
	private int balance;
	private int age;
	public Bank(int accountNumber, String name, int balance, int age) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
		this.age = age;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}