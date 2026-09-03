package com.labtasks;

public class Vehicle {
	String type;
	
	Vehicle(String type) {
		this.type = type;
		System.out.println("one agr constructor for vehicle");

	}

}

class Car extends Vehicle {
	String brand;
    double price;
    
    Car(String type,String brand,double price) {
    	super(type);
    	this.brand=brand;
    	this.price=price;
    	System.out.println("three agr constructor from car");
    	
    }
}
class ElectricCar extends Car{
	int battercapacity;
	ElectricCar(String type,String brand,double price,int battercapaity){
		super(type,brand,price);
		this.battercapacity=battercapacity;
		System.out.println("four agr constructor from electric car");
	}
	

public static void main(String[]agrs) {
           ElectricCar e1=new ElectricCar("engine","bmw",400000,250000);
           e1.display();
}
void display() {
	System.out.println("type of the car:"+type);
	System.out.println("brand of the car:"+brand);
	System.out.println("price of the car:"+price);
	System.out.println("battercapaity of the car:"+battercapacity);
}
}