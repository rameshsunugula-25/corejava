package com.javaintro;

public class StudentMarks {
static String collegename= "vcude";

 int Studentid;
 String studentname;
 int telugumarks;
 int englishmarks;
 int hindimarks;
 void calculatetotal() {
  int sum = telugumarks+englishmarks+hindimarks;
  System.out.println("calculatedtotal:"+ sum);
 }
 void calculatesperct() {
	 int sum = telugumarks+englishmarks+hindimarks;
	 double perct =((double)sum/300)*100;
	 System.out.println("double perct"+ perct);
 }
	 void display() {
		 System.out.println("colegename:"+collegename);
		 System.out.println("Studentid"+Studentid);
		 System.out.println("studentname"+studentname);
	 }
	 


	public static void main(String[] args) {
       System.out.println("collegename:"+ collegename );
       StudentMarks s =new StudentMarks();
       s.Studentid=25;
       s.studentname="ram";
       s.display();
       s.calculatetotal();
       s.calculatesperct();
	}

}
