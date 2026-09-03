package com.assignment;
// no return type and with parameter

public class Testmethoddemo2 {
	int principal;
int rate;
int time;

	
	
	void simpleinterest(int principal,int rate,int time) {
		int simpleinterest= (principal*rate*time)/100;
		 System.out.println("SI:"+simpleinterest);
		
	}
	void rectangle(int l,int b) {
		System.out.println("************************");
		System.out.println("Length:"+ l);
		System.out.println("bredth:"+ b);
		System.out.println("output:"+l*b);
	}
	void percentage (int a,int b) {
		double percentage = ((double)a / b) *100;
		System.out.println("totalmarks"+ a);
		System.out.println("obtainedmarks"+ b);
		System.out.println("outpout:"+percentage+"%");

	}

	//static method
	static void add(int a,int b) {
		System.out.println("addition of two number:" + (a + b));
		
	}
	// instance method 
	void sub(int a, int b) {
		System.out.println("subration of two number:" + (a - b));
	}
void modulus(float a,double b) {
	System.out.println("modulus of two number:" + a % b);
}
	public static void main(String[] args) {
System.out.println("main method of started");
Testmethoddemo2 t2=new Testmethoddemo2();
          add(20,30);
          t2.sub(31, 10);
          t2.modulus(195,30);
          
          t2.simpleinterest(2000, 3, 4);
          t2.rectangle(5, 7);
    t2.percentage(425,500);

System.out.println("main method of ended");

	}

}
