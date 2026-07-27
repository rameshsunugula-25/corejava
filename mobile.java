package com.javaintro;

public class mobile {
// Decalartion 
	// instance varibles
	String ModelName;
	String Ram;
	String Storage;
	// static variables
	static String companyName;
	static String operationSystem;

	public static void main(String[] args) {
		System.out.println("Vivo Company Details");
		// Initialize the data
		companyName = "Vivo";
		operationSystem = "Version8";
		// Accessing
		System.out.println("companyName :" + companyName);
		System.out.println("operationSystem :" + operationSystem);
  String ModelName = "V001";
  String Ram = "8gb";
  String Storage = "128gb";
	System.out.println("ModelName:" + ModelName);
	System.out.println("Ram :"  +  Ram);
	System.out.println("storage:" + Storage);
	}

}
