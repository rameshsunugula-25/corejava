package com.labtasks;

public class Count {
static int count; 

	 Count() {
		count++;
	}
	 Count(int id){
		count++;
		 
	 }
	 Count(String name){
		 count++;
	 }
	 Count(int id, String name){
		 count++;
	 }
static int method(int count) {
	return count;
}
		 	
	 
		
	

	public static void main(String[] args) {
Count c1 =new Count();
System.out.println("object count:"+count);
	}

}
