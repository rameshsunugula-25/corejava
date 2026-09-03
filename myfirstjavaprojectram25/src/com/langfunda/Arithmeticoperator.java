package com.langfunda;

public class Arithmeticoperator {
	void add(int a,int b) {
		int sum=a+b;
		System.out.println("add:"+sum);
		sub(sum,10);
	}
	void sub(int a,int b) {
		int sub= a-b;
		System.out.println("dif:"+sub);
		mul(sub,6);
	}
	void mul(int a,int b) {
		int mul= a * b;
		System.out.println("pro:"+mul);       
		div(mul,4);
	}
	void div(int a,int b) {
		int quo=a/b;
		System.out.println("div:"+quo);
		
	System.out.println("*************************************************************************"); 
	}
	
	int add1(int a,int b) {
		int sum=a+b;
		System.out.println("add:"+sum);
		return sum;
	}
	int sub1(int a,int b) {
		int sub= a-b;
		System.out.println("dif:"+sub);
		return sub;
	}
	int mul1(int a,int b) {
		int mul= a * b;
		System.out.println("pro:"+mul);       
		return mul;
		
	}
	int div1(int a,int b) {
		int quo=a/b;
		System.out.println("div:"+quo);
		return quo;
	}
	
		
		
	public static void main(String[] args) {
		Arithmeticoperator a=new Arithmeticoperator();
		a.add(10, 20);
		
		int a1 = a.add1(20, 20);
		int a2= a.sub1(a1,30);
		int a3=a.mul1(a2, 4);
		int a4=a.div1(a3, 5);
		
		
	}

}
