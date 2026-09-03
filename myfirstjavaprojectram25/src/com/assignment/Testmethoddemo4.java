package com.assignment;

import java.util.Scanner;

public class Testmethoddemo4 {
	Scanner sc=new Scanner(System.in);
	   
	
	
	void marks() {
		System.out.println("enter marks");
		int marks= sc.nextInt();
		if(marks>=90) {
			System.out.println("A GRADE");
			
			}
		else if(marks>=75){
			System.out.println("B GRADE");
		}
		else if(marks>=45){
			System.out.println("C GRADE");
		}
		else if(marks>=35){
			System.out.println("D GRADE");
			
		}
		else {
			System.out.println("fail");
			
		}
	}

	public static void main(String[] args) {
		System.out.println("main method started");

		Testmethoddemo4 t4= new Testmethoddemo4();
t4.marks();
System.out.println("main method ended");

	}

}
