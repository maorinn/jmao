package com.yhk;

public class yhk {
	private int accountid;
	private int accountpassword;
	private int accountBalance = 1000;
	public  yhk(int accountid,int accountpassword) {
		this.accountid = accountid;
		this.accountpassword = accountpassword;
	}
	public void Save_money(int money) {
		this.accountBalance += money;
	}
	public void Withdraw_money(int money) {
		this.accountBalance -= money;
	}
	public int show() {
		return this.accountBalance;
	}
	
}
