package com.assignment;
// Method no Parameters + No Return Type
import java.util.Scanner;

public class testmethoddemo5 {
	Scanner sc= new Scanner(System.in);
	
	void checkpalinodrome() {
		System.out.println("enter number");
		int num=sc.nextInt();
		int org=num;
		int rev=0;
		
	while(num>0) {
        int digit= num % 10;
         rev = rev*10+digit;
         num = num/10;
        
        
       

	}
	if(org==num) {
		System.out.println("palinodrome");
	}
	else {
		System.out.println("no palinodrome");
	}
	}


	public static void main(String[] args) {
System.out.println("main method started");

testmethoddemo5 t5= new testmethoddemo5();
t5.checkpalinodrome();

System.out.println("main method ended");

	}

}
