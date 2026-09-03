package com.langfunda;

public class Loan {
String customername;
int loanamount;
int interestrate;
int interest;
int timeperiod;
int totalamount;
int monthlyemi;
void calculateinterest() {
	interest=loanamount*interestrate*timeperiod/100;
	System.out.println("interest:"+interest);
	
}
  int calculatetotalamount() {
totalamount=interest+loanamount;
System.out.println("totalamount:"+totalamount);
 return totalamount;
}
int monthlyemi() {
	monthlyemi=totalamount/(timeperiod*12);
	System.out.println("monthlyemi:"+monthlyemi);
	return monthlyemi;
	
}
void displayloansummary() {
	System.out.println("LOAN CUSTOMER DETAILS!!!!!");
	System.out.println("customername:"+customername);
	System.out.println("loanamount:"+loanamount);
	System.out.println("timeperiod:"+timeperiod + "years");
	System.out.println("interestrate:"+interestrate + "%");

}
	public static void main(String[] args) {
		Loan l =new Loan();
		l.customername="Ram";
		l.interestrate=3;
		l.loanamount=100000;
		l.monthlyemi=4;
		l.timeperiod=5;
		l.totalamount=105000;
		l.displayloansummary();
		l.monthlyemi();
		l.calculateinterest();
        l.calculatetotalamount();
	}

	

}
