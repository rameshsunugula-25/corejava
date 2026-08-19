package com.langfunda;

public class Vandeexpress {
	String passengername;
	int age;
	String source;
	String destination;
	int numberofticket;
	static int totalticketsbought;
	static int totalamount;
	static int price = 500;
	static {
		System.out.println("WELCOME TO VANDE EXPRESS THANK YOU FOR CHOOSING US");

	}
	void bookticket() {
		totalticketsbought+=numberofticket;
		totalamount+=numberofticket*price;
	}

	void displaybookingdetails() {
		
		System.out.println("passengername:" + passengername);
		System.out.println("age:" + age);
		System.out.println("journey at starting point:" + source);
		System.out.println("journey at endingpoint:" + destination);
		System.out.println("price:" + price);
		System.out.println("numberofticket:" + numberofticket);

	}

	static void ticketcounter() {

		System.out.println("total ticket booked by all passenger:" + totalticketsbought);
		System.out.println("totalamountcollected" + totalamount);
	}

	public static void main(String[] args) {
		Vandeexpress v = new Vandeexpress();
		v.passengername = "RAM";
		v.age = 23;
		v.source = "Tadepalligudem";
		v.destination = "Vizag";
		v.numberofticket = 2;
		v.displaybookingdetails();
		v.bookticket();
		
		System.out.println("********************************************************************");
		Vandeexpress v1 = new Vandeexpress();
		v1.passengername = "Raj";
		v1.age = 25;
		v1.source = "Tadepalligudem";
		v1.destination = "guntur";
		v1.numberofticket = 2;
		v1.displaybookingdetails();
		v1.bookticket();
	
		System.out.println("********************************************************************");
		ticketcounter();

	}

}
