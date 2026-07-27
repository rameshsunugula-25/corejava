package com.javaintro;

public class Methods {
	static void method1() {
		method2();
	int a=10;
	int b=10;
	 int sum=a+b;
		System.out.println("sum :" + sum);

	}
		static void method2() {
			Methods m = new Methods();
			m.method3();
			int a=30;
			int b=10;
			int diff=a-b;
			System.out.println("diff :" + diff);
			
		}
		void method3() {
			method4();
			int a=10;
			int b=2;
			int diff=a*b;
			System.out.println("diff:"+ diff);
		}
		void method4() {
			int a=40;
			int b=2;
			int div=a/b;
			System.out.println("div:"+div);
		}

	public static void main(String[] args) {
		System.out.println("main method started");
		method1();
		System.out.println("main method ended");

	}

}
