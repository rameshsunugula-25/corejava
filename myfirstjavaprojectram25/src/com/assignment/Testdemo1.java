package com.assignment;

import java.util.Scanner;

public class Testdemo1 {
	Scanner sc= new Scanner(System.in);

	public static void main(String[] args) {
		Testdemo1 obj = new Testdemo1();

		 System.out.println("Enter Student Name:");
	        String name =obj.sc.nextLine();

	        System.out.println("Enter Marks:");
	        int marks = obj.sc.nextInt();
	        obj.displayResult(name, marks);
	    }

	    void displayResult(String name, int marks) {
	    	


	        System.out.println("Student Name : " + name);
	        System.out.println("Marks        : " + marks);

	        if (marks >= 40)
	            System.out.println("Result       : Pass");
	        else
	            System.out.println("Result       : Fail");
	}

}
