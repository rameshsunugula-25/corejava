package com.array;

import java.util.Scanner;

public class TestLNDemo2 {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println(" enter size of array");
int n=sc.nextInt();
int [] a= new int[n];
System.out.println(" enter the number");
for(int i=0;i<n;i++) {
	a[i]=sc.nextInt();
}
int largest=a[0];
for(int i=1;i<n;i++) {
	
	if(a[i]<largest) {
		largest =a[i];
		
	}
}
System.out.println("largest:"+ largest);
sc.close();
	}

}
