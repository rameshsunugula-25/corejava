package com.langfunda;

public class Salary {
	static String empolyeename="ram";
	double monthlysalary=50000;
	double monthlygst;
	double monthlypf;
	double netmonthlysalary;
	double annualgst;
	double annualpf;
	double annualnetsalary;
	void monthlygst() {
		monthlygst=(monthlysalary)*0.03;
		System.out.println("monthlygst:"+monthlygst);
		
	}
	void monthlypf() {
		monthlypf=(monthlysalary)*0.02;
		System.out.println("monthlypf:"+monthlypf);
	}
	void netmonthlysalary() {
		netmonthlysalary=monthlysalary-monthlygst-monthlypf;
		System.out.println("netmonthlysalary:"+netmonthlysalary);
		
	}
	void annualgst() {
		annualgst=(monthlygst)*12;
		System.out.println("annualgst:"+annualgst);
		
	}
	void annualpf() {
		annualpf=(monthlypf)*12;
		System.out.println("annualpf:"+annualpf);
	}
	void annualnetsalary() {
		annualnetsalary=(netmonthlysalary)*12;
		System.out.println("annualnetsalary:"+annualnetsalary);
	}
	void displayemployeedetails() {
		
		monthlygst();
		monthlypf();
		netmonthlysalary();	
		 annualgst();
		 annualpf();
		 annualnetsalary();
	}

	public static void main(String[] args) {
		Salary s =new Salary();
		System.out.println("empolyeename:"+empolyeename);
		s.displayemployeedetails();
				
	}

}
