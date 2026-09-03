package com.assignment;
	import java.util.Scanner;
	// no return type and with parameter

	public class Testmethoddemo7 {

	    Scanner sc = new Scanner(System.in);

	    public static void main(String[] args) {

	        Testmethoddemo7 obj = new Testmethoddemo7();

	       
	       obj.findLargest(0, 0, 0);
	    }

	    void findLargest(int a, int b, int c) {
	    	 System.out.println("Enter three numbers:");

		         a = sc.nextInt();
		         b = sc.nextInt();
		         c = sc.nextInt();
		         

	        if (a >= b && a >= c)
	            System.out.println("Largest = " + a);
	        else if (b >= a && b >= c)
	            System.out.println("Largest = " + b);
	        else
	            System.out.println("Largest = " + c);
	    }
	}
