package com.labtasks;

import java.util.Scanner;

public class Perfectnumber {
	static boolean perfectnumber (int n) {
		int sum=0;
		for(int i=1;i<=n/2;i++) {
			if(n%1==0) {
				sum=sum+i;
			}
			
		}
		return sum==n;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
System.out.println(" enter number");
int n=sc.nextInt();
if(perfectnumber(n)) {
	System.out.println("it is perfect");
}else
	System.out.println(" it is not perfect");
	
	}

}
