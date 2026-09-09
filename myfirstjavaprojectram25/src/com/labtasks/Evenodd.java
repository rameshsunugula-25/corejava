package com.labtasks;

import java.util.Scanner;



public class Evenodd {

	public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
System.out.println(" enter number");
int n=sc.nextInt();
int evencount=0;
int oddcount=0;
for(int i=200;i<=n;i++) {
	if(i%2==0) {
		evencount++;
	}else
	oddcount++;
	
}
System.out.println("evencount:"+evencount);
System.out.println("odd count:"+oddcount);

	}

}
