package com.assignment;

import java.util.Scanner;

public class Testpocdemo1 {

	public static void main(String[] args) {
		System.out.println("welcome to vcude job portal");
		System.out.println("Job seeker");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Name");
		String name=sc.nextLine();
		System.out.println(" Enter Qualification");
		String qualification = sc.nextLine();
		System.out.println(" Enter percentage");
		double per = sc.nextDouble();
		System.out.println("enter experience ");
		int exp = sc.nextInt();
		System.out.println(" enter age");
		int age = sc.nextInt();
		System.out.println("javaskills");
		String javaskills=sc.next();
		if (qualification.equals("btech") || qualification.equals("degree")) {
			if (per >= 60) {
				if (exp >= 2) {
					if (age <= 35 && age >= 25) {
						if (javaskills.equals("java")||javaskills.equals("javascript")) {
							System.out.println("congratulation to the eligilble");
						} else {
							System.out.println("required java skills");
						}
					} else {
						System.out.println("age is criteria");
					}
				} else {
					System.out.println("2 years experience");
				}
			} else {
				System.out.println("percentage criteria not matching");
			}

		} else {
			System.out.println("qualification not matching");
		}
sc.close();
	}

}
