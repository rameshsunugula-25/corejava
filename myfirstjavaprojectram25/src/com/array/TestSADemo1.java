package com.array;

import java.util.Scanner;

public class TestSADemo1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println(" enter number of element");
		int n=sc.nextInt();
		int [] a=new int[n];
		System.out.println("enter" + n +"elements");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}

int sum=0;
for(int i=0;i<n;i++) {
sum=sum+a[i];
}
System.out.println("sum:"+sum);
sc.close();
}
	
}
