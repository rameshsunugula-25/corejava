package com.assignment;

import java.util.Scanner;

public class Studentgrade {
	Scanner sc=new Scanner (System.in);

	public static void main(String[] args) {
		Studentgrade sg=new Studentgrade();
		sg.studentmarks();
	}
void studentmarks() {
	System.out.println("enter marks");
	int marks=sc.nextInt();
	if(marks>=100)
		System.out.println("a grade");
	else if (marks>=75)
		System.out.println("b grade");
	else if(marks>=60)
		System.out.println("c grade");
	else if(marks>=35)
		System.out.println("d grade");
	else 
		System.out.println("fail");
}
}
