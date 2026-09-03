package com.labtasks;

public class BankAccount {
	int accountNumber;
	String accountHolderName;
	double balance;
	String branch;
	
	BankAccount(int accountNumber,String accountHolderName,double balance,String branch){
		this.accountNumber=accountNumber;
		this.accountHolderName=accountHolderName;
		this.balance=balance;
		this.branch=branch;
		
		
	}

	public BankAccount(BankAccount b,double balance,String branch) {
		this.accountNumber=b.accountNumber;
		this.accountHolderName=b.accountHolderName;
		this.balance=balance;
		this.branch=branch;
		
		
	}
void displayAccountdetails() {
	System.out.println("AccountNumber:"+accountNumber);
	System.out.println("AccountHolderName:"+accountHolderName);
	System.out.println("Balance:"+balance);
	System.out.println("Branch:"+branch);


}
	public static void main(String[] args) {
		BankAccount b1 = new BankAccount(7879, "RAM", 20000, "SBI JNTU");
		b1.displayAccountdetails();
		System.out.println("**************************************");
		b1
//	BankAccount b2=new BankAccount(b1,30000,"HDFC KBHP");
	
//	b2.displayAccountdetails();
	
		
	}

}
