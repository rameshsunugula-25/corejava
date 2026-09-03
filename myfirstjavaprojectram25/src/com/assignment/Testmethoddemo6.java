package com.assignment;

import java.util.Scanner;

// Method With Parameters + No Return Type
public class Testmethoddemo6 {
	
	Scanner sc=new Scanner(System.in);
	
	void display(String name, int marks) {
System.out.println("enter student name");
 name=sc.nextLine();	
System.out.println(" enter marks"); 
marks=sc.nextInt();
System.out.println("student name:"+name);
System.out.println("student marks:"+marks);

if(marks>=45) {
 System.out.println("pass");
}
 else {
	 System.out.println("fail");
 }
}

	
	


	public static void main(String[] args) {
		Testmethoddemo6 t6=new Testmethoddemo6();
		t6.display("ram",75);
		
		
	}

}
