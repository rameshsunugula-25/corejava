package com.assignment;

 class Flower {
 String name="jasmine";
 
String colour="white";

	public static void main(String[] args) {
		
	}

}
class rose extends Flower{
	
	String name="rose";
	 
	String colour="Red";
	
	public static void main(String[] args) {
		rose r = new rose();
		r.showrose();
		
		
		
	}
	void showrose() {
		System.out.println("flower:"+name);
		System.out.println("colour:"+colour);
	}
}