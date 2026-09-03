package com.assignment;

public class Testdemo2 {
	int eid;
	String ename;
	double esal;
	Testdemo2(){
		System.out.println("no agr constructors");
		eid=100;
		ename="knows";
		esal=2000000;
	}
	Testdemo2(int eid,String ename,double esal){
		System.out.println("parameterize constructors");
		this.eid=eid;
		this.ename=ename;
		this.esal=esal;
	
	}
	void show() {
		System.out.println(eid);
		System.out.println(ename);
		System.out.println(esal);
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		Testdemo2 t=new Testdemo2();
		t.show();
		 System.out.println("******************************");
		Testdemo2 t1=new Testdemo2(101,"ram",30000);
		t1.show();
		System.out.println("main method ended");
	}

}
