package com.langfunda;

public class Movieticket {
	String moviename;
	int Seatno;
	boolean booked;
	static String theatrename="lulu";
	
	
	void bookticket() {
//		booked=true;
		System.out.println("booking status:ticket for"+moviename+"booked successfully");
	}
	void cancelticket(){
//		booked=false;
		System.out.println("booking status:ticket for"+moviename+"Cancelled successfully");
	}
	 void displayticketdetails() {
		 System.out.println("theatrename:"+theatrename);
		 System.out.println("moviename:"+ moviename);
		 System.out.println("seatno:"+ Seatno);
		 bookticket();
	     cancelticket();
	 }
	 static void theatrename() {
		theatrename="pvr";
	 }
	
	public static void main(String[] args) {
		
		Movieticket m = new Movieticket();
		m.moviename="billa";
		m.Seatno=25;
		m.booked=true;
		m.displayticketdetails();
		
		System.out.println("-------------------------------------");
		
		Movieticket m1=new Movieticket();
		m1.moviename="munna";
		m1.Seatno=26;
		theatrename();
		m1.displayticketdetails();
	}

}
