package com.labtasks;

import java.util.Scanner;

public class TestEbDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the connection type");
		String ct = sc.next().toUpperCase();

		switch (ct) {
		case "DOMESTIC" -> {
			System.out.println(" enter the number of units");
			double units = sc.nextDouble();
			double bills = 0;
			if (units < 0) {
				System.out.println(" invaild unit");
			} else if (units >= 0 && units <= 100) {
				bills = units * 2;
			} else if (units > 100 && units <= 300) {
				bills = units * 3;
			} else {
				bills = units * 4;
			}
			System.out.println("The Electricity Bill To Be Paid Is : " + bills);
		}

		case "COMMERCIAL" -> {
			System.out.println(" enter the number of units");
			double units = sc.nextDouble();
			double bills = 0;
			if (units < 0) {
				System.out.println(" invaild unit");
			} else if (units >= 0 && units <= 100) {
				bills = units * 4;
			} else if (units > 100 && units <= 300) {
				bills = units * 6;
			} else {
				bills = units * 8;
			}
			System.out.println("The Electricity Bill To Be Paid Is : " + bills);
		}
		default -> System.out.println("Invalid Connection Type Entered");
		}

	}

}
