package com.javaintro;

public class Bank {
 
int Accountnum;
String AccountHolderName;
int deposit;
int withdrawal;
int balance;
static String IFSC="SBI002345";
static String Branchname=" kbhpcolony";
void deposit() {
	balance=balance+10000;
	System.out.println("deposit:" + balance);
	
}
void withdrawal() {
	balance=balance-5000;
	System.out.println("withdrawal:"+balance);

}
void checkbalance() {
	balance=balance;
	System.out.println("balance:"+balance);
}
	public static void main(String[] args) {	
		Bank obj1=new Bank();
		obj1.Accountnum=23456178;
		obj1.AccountHolderName="RAMLATHA";
		obj1.balance=50000;
	System.out.println("Accountnum"+obj1.Accountnum);
	System.out.println("AccountHolderName"+obj1.AccountHolderName);
	System.out.println("IFSC"+IFSC);
	System.out.println("Branchname"+Branchname);
	obj1.deposit();
	obj1.withdrawal();
	obj1.checkbalance();

	}

}
