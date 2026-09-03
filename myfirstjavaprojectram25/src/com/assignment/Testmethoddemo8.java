
package com.assignment;
import java.util.Scanner;

// Method With Parameters + with Return Type
public class Testmethoddemo8 {
	
	Scanner sc=new Scanner(System.in);
	
  public int getdisplay(String name, int marks) {
System.out.println("enter student name");
 name=sc.nextLine();	
System.out.println(" enter marks"); 
marks=sc.nextInt();
System.out.println("student name:"+name);
System.out.println("student marks:"+marks);

if(marks>=45) {
 System.out.println("pass");
}
 else {
	 System.out.println("fail");
 }
return marks;
}

	
	


	public static void main(String[] args) {
		Testmethoddemo8 t8=new Testmethoddemo8();
		int display=t8.getdisplay("ram",75);
		
		
	}

}


	
