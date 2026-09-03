package com.langfunda;

public class Shoppingcart {
	String storename;
	String customername;
	String productname;
	double price;
	int quantity;
	double totalprice;
	double discount;

	void addproduct(String productname, double price, int quantity) {
		this.productname = productname;
		this.price = price;
		this.quantity = quantity;
		System.out.println("producname" + productname);
		System.out.println("price:" + price);
		System.out.println("quantity:" + quantity);

	}

	void calculatedtotal(double discount) {
		double discountAmount = (price * discount) / 100;
		totalprice = (price - discountAmount) * quantity;

		System.out.println("Total Price: " + totalprice);
		System.out.println("Discount Amount: " + discountAmount);
	}

	void displaycart() {
		System.out.println("storename:" + storename);
		System.out.println("customer:" + customername);
	}

	public static void main(String[] args) {
		Shoppingcart sc = new Shoppingcart();
		sc.storename = "V STORES";
		sc.customername = "Ram";
		sc.displaycart();
		sc.addproduct("checkshirt", 2500, 2);
		sc.calculatedtotal(15);
		System.out.println("*****************************************************");
		Shoppingcart sc1 = new Shoppingcart();
		sc1.storename = "V STORES";
		sc1.customername = "Raj";
		sc1.displaycart();
		sc1.addproduct("PANT", 3000, 2);
		sc1.calculatedtotal(45);

	}

}
