package com.labtasks;

import java.util.Scanner;

public class DominosPizza {

	double getPizzaPrice(char size) {

		double price = 0;
		if (size == 's') {
			price = 70;
		}
		if (size == 'm') {
			price = 100;
		}
		if (size == 'l') {
			price = 150;
		}
		return price;

	}

	double calculatePizzaCost(double price, int quantity) {
		double cost = price * quantity;
		return cost;

	}

	double deliveryCharge(double distance) {
		double deliveryCharge = 0;

		if (distance >= 0 && distance <= 10) {
			deliveryCharge = 50;
		}
		if (distance >= 11 && distance <= 20) {
			deliveryCharge = 100;
		}
		if (distance > 20) {
			deliveryCharge = 150;
		}
		return deliveryCharge;
	}

	double finalBill(double cost, double deliveryCharge) {
		double total = cost + deliveryCharge;
		return total;
	}

	void main(String[] args) {
		System.out.println(" WELCOME TO KR PIZZA");
		Scanner sc = new Scanner(System.in);
		System.out.println("please select pizza size : ");
		char size = sc.next().charAt(0);

		System.out.println("Enter Quantity : ");
		int quantity = sc.nextInt();

		System.out.println("enter your distance : ");
		double distance = sc.nextDouble();
		
		double price=getPizzaPrice(size);
		System.out.println("The Price Is : "+price);
		
		double cost=calculatePizzaCost(price, quantity);
		System.out.println("The cost of "+quantity+" pizzas is "+cost);
		
		double deliveryCharge = deliveryCharge(distance);
		System.out.println("The Delivery Charge Is : "+deliveryCharge);
		
		double total=finalBill(cost, deliveryCharge);
		System.out.println("The Total Amount TO Be Paid Is : "+total);
		
		sc.close();
	}
}
