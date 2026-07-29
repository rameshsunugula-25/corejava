package com.javaintro;

public class Pencilpurchase {

	public static void main(String[] args) {
		int money=100;
		int pencilcost=7;
		int pencils = money /pencilcost;
		int amountleft=money %pencilcost;
		System.out.println("totalmount=" + money +"$");
		System.out.println("cost of one ="+pencilcost+"$");
		System.out.println("pencilbought="+pencils);
		System.out.println("amountleft="+amountleft+"$");
	}

}
