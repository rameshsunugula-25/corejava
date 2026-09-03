package com.langfunda;

public class NRTNP5 {
	static void factorial() {
		int fact=1;
		for(int i=1;i<=10;i++) {
			fact=fact*i;
			System.out.println("factorial-"+fact);
		}
	}

	public static void main(String[] args) {
		factorial();

	}

}
