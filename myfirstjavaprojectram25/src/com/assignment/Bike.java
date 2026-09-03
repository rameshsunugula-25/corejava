package com.assignment;

public class Bike {
	String model;
	String brand;
	String colour;
	double price;
	double year;

	Bike() {
		this("unknown");
		System.out.println("no arg constructor");
		
	}

	Bike(String model) {
		this(model,"unknown");
		System.out.println("one arg constructor");
		
	}
	Bike(String model,String brand) {
		this(model,brand, "white");
		System.out.println("two arg constructor");
		
	}
	Bike(String model,String brand,String colour) {
		this(model,brand,colour,0.0);
		System.out.println("3 arg constructor");

	}
	Bike(String model,String brand,String colour,double price) {
		this(model,brand,colour,price,2026);
		
		System.out.println("4 arg constructor");

	}
	Bike(String model,String brand,String colour,double price,double year) {
		System.out.println("5 arg constructor");
this.model=model;
this.brand=brand;
this.colour=colour;
this.model=model;
this.model=model;
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		Bike b = new Bike();
		b.bikeinfo();
	Bike b1 = new Bike("R15");
		b1.bikeinfo();
	Bike b2 = new Bike("R15","yamaha");
	b2.bikeinfo();
	Bike b3 = new Bike("R15","yamaha","violent");
	b3.bikeinfo();
	}

	void bikeinfo() {
		System.out.println("***********************************");
		System.out.println("model of the bike:" + model);
		System.out.println("brand of the bike:" + brand);
		System.out.println(" colur of the bike:" + colour);
		System.out.println("price of the bike:" + price);
		System.out.println("year of the bike:" + year);
	}
}
