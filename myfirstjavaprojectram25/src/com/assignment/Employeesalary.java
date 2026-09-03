package com.assignment;

import java.util.Scanner;

public class Employeesalary {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Employeesalary es = new Employeesalary();

		es.calculatedsalary();
	}

	void calculatedsalary() {
		System.out.println("basic salary");
		double basic = sc.nextDouble();
		System.out.println("HR");
		double hr = sc.nextDouble();
		System.out.println("DA");
		double da = sc.nextDouble();
		double totalsalary = basic + hr + da;
		System.out.println("total salary:" + totalsalary);
	}
}
