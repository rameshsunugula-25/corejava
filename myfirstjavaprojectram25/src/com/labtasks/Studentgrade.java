package com.labtasks;

import java.util.Scanner;


public class Studentgrade {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
System.out.println(" enter marks");
int marks= sc.nextInt();

String grade=(marks>=91 && marks<=100)?"S grade":
	(marks>=81 && marks<=90 )?"A grade":
		(marks>=71 && marks<=80 )?"B grade":
			(marks>=51 && marks<=70 )?"c grade":
				(marks>=41 && marks<=50 )?"D grade":
					(marks>=35 && marks<=40 )?"E grade":
						(marks>100 && marks<0 )?"Invalid Marks":"failed";
						

							
							System.out.println("Result"+grade);
							
	


	}

}
