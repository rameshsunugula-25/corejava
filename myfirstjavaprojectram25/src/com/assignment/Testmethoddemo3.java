package com.assignment;

import java.util.Scanner;
//with return type and no parameter

public class Testmethoddemo3 {
	Scanner sc= new Scanner(System.in);
	int  getcalculatedsalary() {
		System.out.println("enter the salary");
		int salary= sc.nextInt();
		
		System.out.println("enter the hr");
		double hr=sc.nextInt();
		 System.out.println("enter the dsa");
		 double dsa=sc.nextInt();
		 double totalsalary=salary+hr+dsa;
		 System.out.println("totalsalary:"+totalsalary);
		 return  salary;
	
		 
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		
		Testmethoddemo3 t3=new Testmethoddemo3 ();
		int interest=t3.getcalculatedsalary();
		System.out.println("main method ended");

		

	}

}
