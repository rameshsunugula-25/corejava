package com.langfunda;

public class Courier {
	String customername;
	int courierid;
	String source;
	String destination;
	double weight;
	double deliveryamount;
	static int totalcourier;
	static double totalweight;
	static double totalamountcollected;
	static int priceperkg=100;
	void display() {
		System.out.println("WELOCOME TO QUICKSHIP COURIER!!!!");
	}
	void bookcourier() {
	totalcourier++;
	totalweight+=weight;
	 totalamountcollected= totalweight*priceperkg;
	 System.out.println(" SUCEESSFULLY BOOKING ");
	}
	void displaycourierdetails() {
		
		System.out.println("customername:"+customername);
		System.out.println("courierid:"+courierid);
		System.out.println("source:"+source);
		System.out.println("destination:"+destination);
		System.out.println("weight:"+weight);
		System.out.println("deliveryamount:"+weight*priceperkg);
		
		
		
		}
	 static void todaycollected() {
		System.out.println("total courier booked:"+totalcourier);
		System.out.println("total weight of courier :"+totalweight);
		System.out.println("totalamountcollected:"+totalamountcollected);
	}
	

	public static void main(String[] args) {
		Courier c=new Courier();
		c.customername="RAM";
		c.courierid=3735;
		c.source="Tadepalligudem";
		c.destination="vizag";
		c.weight=40;
		c.display();
		
		c.displaycourierdetails();
		c.bookcourier();
		
		
		System.out.println("******************************************************");
	
		Courier c1=new Courier();
		c1.customername="VASU";
		c1.courierid=7879;
		c1.source="Tadepalligudem";
		c1.destination="VIJAYAWADA";
		c1.weight=55;
		c1.display();

		c1.displaycourierdetails();
		c1.bookcourier();
		System.out.println("******************************************************");
		
		todaycollected();
		
		
		
		

	}

}
