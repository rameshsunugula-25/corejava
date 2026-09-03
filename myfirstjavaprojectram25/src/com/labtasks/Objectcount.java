package com.labtasks;

public class Objectcount {
	static int count; 

	Objectcount() {
		count++;
	}
	Objectcount(int id){
		count++;
		 
	 }
	Objectcount(String name){
		 count++;
	 }
	Objectcount (int id, String name){
		count++;
	}
	static int method(int count) {
		return count;
	}

	
	public static void main(String[] args) {
		Objectcount c1 = new Objectcount();
		Objectcount c2 = new Objectcount();
		Objectcount c3 = new Objectcount();
		
		
		 method(count);
		System.out.println("Objects Count : "+count);
	}

}
