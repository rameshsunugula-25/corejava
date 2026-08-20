package com.langfunda;



public class Zoomcarrental {
	String welcome(String message) {
		return message;
		
	}
String companyname(String company) {
	return company;
}
	
	int rentalcar(int rate) {
		rate=1500;
		return rate;
		
	}
	
	int insurancefee(int insurance) {
		insurance=500;
		return insurance;
	}
	int numberOfDays(int days,int rentalRate) {
		int NumberOfDaysCost = days*rentalRate;
		return NumberOfDaysCost;
	}
	int totalcost(int insurancefee,int numberOfDaysCost) {
		  int totalcost=insurancefee+numberOfDaysCost;
		 return totalcost;
	}

	void main(String[] args) {
		
		String message = welcome("Welcome to Car Rentals");
		System.out.println(message);
		
		String com = companyname("ZOOM CAR RENTALS");
		System.out.println("Company Name : "+com);
		
		int rate = rentalcar(0);
		System.out.println("DAILYRENT:"+rate);
		
		int insurance=insurancefee(0);
		System.out.println("insurancefee:"+insurance);
		
		int numberOfDays = numberOfDays(5, rate);
		System.out.println("The Amount To Be Paid FOr 5 Days is : "+numberOfDays);
		
		
		int total = totalcost(insurance, numberOfDays);
		System.out.println("The Total Amount to be Paid Is : "+total);
		
		
	}

}
