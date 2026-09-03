package com.casestudy;


public class Movietheatre {
	String moviename;
	String language;
	double priceticket;
	
	Movietheatre(String moviename,String language,double priceticket){
		System.out.println("parameterized constructor");
		this.moviename=moviename;
		this.language=language;
		this.priceticket=priceticket;
		
	}
	Movietheatre(Movietheatre m){
		this.moviename=m.moviename;
		this.language=m.language;
		this.priceticket=m.priceticket;
	}
	
	
	void displaymoviedetails() {
		System.out.println("Moviename:"+moviename);
		System.out.println("language:"+language);
		System.out.println("priceticket:"+priceticket);


	}
 
	
	public static void main(String[] args) {
		Movietheatre m1=new Movietheatre("BB2","TELUGU", 1200);
		m1.displaymoviedetails();
		System.out.println("*************************************");
		Movietheatre m2=new Movietheatre(m1);
		m2.priceticket=1000;
		m2.displaymoviedetails();
		
	}

}
