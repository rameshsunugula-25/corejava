package com.langfunda;

public class Student {
	Integer Studentid;
	 String studentname;
	 String gender;
	 String branchname;
	 String collegename;
	 
	 
	 void studentdisplay() {
		 
		 
		 System.out.println("Studentid:"+Studentid);
		 System.out.println("studentname:"+studentname);
		 System.out.println("gender:"+gender);
		 System.out.println("branchname:"+branchname);
		 System.out.println("collegename:"+collegename);
		 
		 System.out.println("************************************");
		 
		 
	 }
	

	public static void main(String[] args) {
		Student s1=new Student();
		s1.Studentid=24;
		s1.studentname="RAM";
		s1.gender="Male";
		s1.branchname="ECE";
		s1.collegename="Vcube";
		s1.studentdisplay();
		
		Student s2 = new Student();
		s2.Studentid=25;
		s2.studentname="SRI DEVI";
		s2.gender="Male";
		s2.branchname="CSE";
		s2.collegename="Vcube";
		s2.studentdisplay();
	}

}
