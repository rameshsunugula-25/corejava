package com.javaintro;

public class Atm {
	static String BankName="sbi";
	int deposit;
	int withdrawal;
	static int balance;
	void checkbalance()
	{
		balance=deposit - withdrawal;
		System.out.println("balance:"+balance);
	}
	
	public static void main(String[] args) {

		Atm b1 = new Atm();
		
		b1.deposit=10000;
		b1.withdrawal=500;
		
		System.out.println("deposit:" + b1.deposit);
		System.out.println("withdrawal:"+b1.withdrawal);
		b1.checkbalance();
		}

}
