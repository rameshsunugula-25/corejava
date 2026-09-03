package com.langfunda;

import java.util.Scanner;


public class Testdemo2 {
	
	public static void main(String[] args) {
	System.out.println("main method started ");
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter Student ID ");
	int sid = sc.nextInt();

	System.out.println("Enter Student Name ");
	sc.nextLine();
	String sname = sc.nextLine();

	System.out.println("Enter your age  : ");
	int age = sc.nextInt();

	System.out.println("Enter your Gender info : ");
	char gender = sc.next().charAt(0);
	System.out.println("Enter the marks");
	int marks=sc.nextInt();
	System.out.println("Enter the grade");
	char grade=sc.next().charAt(0);


	getStudent_Id_Name_Info(sid, sname);
	getStudentAgeInfo(age);
	getGenderInfo(gender);
	getmarksinfo(marks);
	getgradeInfo(grade);

	System.out.println("main method ended ");
}

 static void getgradeInfo(int grade) {
		System.out.println("student grade:"+grade);
		
		
		
	}

static void getmarksinfo(int marks) {
		System.out.println("student marks: "+marks);
	}

static void getGenderInfo(char gen) {
	System.out.println("Student Gender Details : " + gen);
}

static void getStudentAgeInfo(int age) {
	System.out.println("Student Age is : " + age);
}
static void getStudent_Id_Name_Info(int id, String name) {
	System.out.println("Student ID and Name info !!");
	System.out.println("Student ID : " + id);
	System.out.println("Student Name : " + name);
}
}