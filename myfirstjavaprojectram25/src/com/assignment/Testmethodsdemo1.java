package com.assignment;
// no return type and no parameters!!!!!!!!!!!!!!!
public class Testmethodsdemo1 {
	
	
	void method() {
		System.out.println("hangova!!!!!!!!!!!!!!!!!!");
	}
	static void display() {
		
		System.out.println("welocome to my world");
	}

	public static void main(String[] args) {
		System.out.println("method started ");
		Testmethodsdemo1 t1=new Testmethodsdemo1();
		display();
		Testmethodsdemo1.display();
		t1.display();
		t1.method();
		
		System.out.println("method ended");

	}

}
