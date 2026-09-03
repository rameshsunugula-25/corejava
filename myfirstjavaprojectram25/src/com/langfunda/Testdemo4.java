package com.langfunda;

import java.util.Scanner;

public class Testdemo4 {

	public static void main(String[] agrs) {
		Scanner sc= new Scanner(System.in);
		System.out.println("ENTER THE College Name");
		String cname = sc.next();
		System.out.println("ENTER THE College code");
		String ccode = sc.next();
		System.out.println("ENTER THE Department");
		String dept = sc.next();
		System.out.println("ENTER THE Course");
		String cou = sc.next();
		System.out.println("ENTER THE semester");
		int sem = sc.nextInt();
		System.out.println("ENTER THE section");
		String sec = sc.next();
		System.out.println("ENTER THE rollno");
		int rollno = sc.nextInt();
		System.out.println("ENTER THE batch");
		String batch = sc.next();
		System.out.println("ENTER THE location");
		String loc = sc.next();
		System.out.println("ENTER THE university");
		String uni = sc.next();
		
		System.out.println("**************COLLEGE DETAILS******************");
		getCollegeName(cname);
		getCollegeCode(ccode);
		getDepartment(dept);
		getCourse(cou);
		getSemester(sem);
	    getSection(sec);
	    getRollNumber(rollno);
	    getBatch(batch);
	    getCollegeLocation(loc);
	    getUniversity(uni);
	    
	    
	    
	}

	

 static void getCollegeName(String name) {
		System.out.println("College Name: " + name);
	}

	static void getCollegeCode(String code) {
		System.out.println("College Code: " + code);
	}

	static void getDepartment(String department) {
		System.out.println("Department: " + department);
	}

	static void getCourse(String course) {
		System.out.println("Course: " + course);
	}

	static void getSemester(int semester) {
		System.out.println("Semester: " + semester);
	}

	static void getSection(String sec) {
		System.out.println("Section: " + sec);
	}

	static void getRollNumber(int rollNo) {
		System.out.println("Roll Number: " + rollNo);
	}

	static void getBatch(String batch) {
		System.out.println("Batch: " + batch);
	}

	static void getCollegeLocation(String location) {
		System.out.println("College Location: " + location);
	}

	static void getUniversity(String uni) {
		System.out.println("University: " + uni);
	}
}
