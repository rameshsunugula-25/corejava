package com.langfunda;

public class Digitalwatch {
	static String Brandname = "boult";
	static String watchtype = "display watch";
	int hours;
	int minutes;
	int second;
	int price;

	void displayTime() {
		System.out.println(hours + ":" + minutes+ ":"+second+":");

	}

	void displaywatchDetails() {
		System.out.println("watch Details:");
		System.out.println("Brandname:" + Brandname);
		System.out.println("watchtype:" + watchtype);
		System.out.println("price:"+price);

	}

	void updateHour() {
		hours = +1;

	}

	void updateminutes() {
		minutes = +5;
	}

	public static void main(String[] args) {
Digitalwatch d = new Digitalwatch();
d.price=3000;
d.hours=10;
d.minutes=30;
d.second=20;
d.displayTime();
d.displaywatchDetails();
d.updateHour();
d.updateminutes();

	}

}
