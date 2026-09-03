package com.langfunda;

public class Restaurant {
int tablenumber;
int seats;
boolean reversed;
 static String restaurantname="vcube";
 
 Restaurant(int tablenumber, int seats, boolean reversed) {
	 this.tablenumber=tablenumber;
	 this.seats=seats;
	 this.reversed=reversed;
 }

void reversetable() {
	reversed=true;
	
}
void cancelreversetable() {
	reversed=false;
	
}
void displaytabledetails() {
	System.out.println("restaurantname:"+ restaurantname);
	System.out.println("tablenuumber"+ tablenumber);
	System.out.println("seats"+ seats);
	System.out.println("reversed"+ reversed);
}


static void  change

	public static void main(String[] args) {
	

	}

}
