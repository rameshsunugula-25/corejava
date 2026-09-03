package com.labtasks;

public class Testdemo {
	String employeename;
	double salary;
	String companyname;

	Testdemo(String employeename, double salary, String companyname) {
		this.employeename = employeename;
		this.salary = salary;
		this.companyname = companyname;
	}

	public static void main(String[] args) {
		Testdemo t1 = new Testdemo("RAMESH", 100000, "INFOSYS");
		t1.display();
	}
	void display() {
		System.out.println("EmployeeName:" + employeename);
		System.out.println("Salary:" + salary);
		System.out.println("companyname:" + companyname);
	}
}
