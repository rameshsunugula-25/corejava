package com.assignment;

import java.util.Scanner;

public class Numberpalindrome {
	Scanner sc = new Scanner (System.in);

	public static void main(String[] args) {
		Numberpalindrome np=new Numberpalindrome();
		np.checkpalindrome();
	}
void checkpalindrome() {
	System.out.println("enter number");
	int num=sc.nextInt();
	int org = num;
	int rev=0;
	
	while(num > 0) {
		int digit=num%10;
		rev=rev*10+digit;
		num=num/10;
	}
	if(org==rev)
		System.out.println("palinodrome");
		else
		System.out.println("no palinodrome");
}
}
