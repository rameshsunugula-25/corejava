package com.langfunda;

public class Website {
String items;
double totalamount;
boolean orderplaced;
static String websitename;
void additem() {
	System.out.println("order place is added to cart");
}
void placeorder() {
	//if(orderplaced==true) {
		System.out.println("order place successfully");
	}
//}
void displaycart() {
	System.out.println("websitename:"+ websitename);
	System.out.println("items:"+ items);
	System.out.println("totalamount:"+ totalamount);

}
static void changewebsitename() {
	websitename="hotspot";
}
	public static void main(String[] args) {
		Website w =new Website();
		
		w.websitename="pizzahut";
		w.items="nonvegpizza";
		w.totalamount=250;
		//w.orderplaced=true;
		w.displaycart();
		w.additem();
		w.placeorder();
		System.out.println("-------------------------------------");

		changewebsitename();
		Website w1 =new Website();
		w1.items="nonvegpizza";
		w1.totalamount=150;
		//w.orderplaced=true;
		w1.displaycart();
		w1.additem();
		w1.placeorder();
	}

}
