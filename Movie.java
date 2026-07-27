
package com.javaintro;
 
public class Movie {
	static String MovieName;
	static int ReleasedYear;
	static int TicketPrice;
	
	int HeroId;
	String HeroName;

	public static void main(String[] args) {
		MovieName = "salaar";
		ReleasedYear = 2023;
		TicketPrice = 250;
		System.out.println("MovieName:" + MovieName);
		System.out.println("ReleasedYear:" + ReleasedYear);
		System.out.println("TicketPrice:" +TicketPrice );
 Movie prabhas = new Movie();
 prabhas.HeroId=25;
 prabhas.HeroName="prabhas";
 System.out.println("HeroId:" + prabhas.HeroId);
 System.out.println("HeroName:" +prabhas.HeroName);
	}
	}


