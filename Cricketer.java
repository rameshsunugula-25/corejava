package com.javaintro;

public class Cricketer {
	//instance variable
	static int CountryId;
	static String CountryName;
	 // non static variable:
	int jerseyNo;
	 String CricketerName;

	public static void main(String[] args) {
		System.out.println("Welcome to Indian Cricket Team Info");
		CountryId=91;
		CountryName = "India";
		
 System.out.println("CountryId:" + CountryId);
 System.out.println("CountryName:" + CountryName);
 Cricketer ishan = new Cricketer();
  ishan.jerseyNo=32;
  ishan.CricketerName="Ishan kishan";
  System.out.println("JerseyNo:" + ishan.jerseyNo);
  System.out.println("CricketerName:" +ishan. CricketerName);
	}

}
