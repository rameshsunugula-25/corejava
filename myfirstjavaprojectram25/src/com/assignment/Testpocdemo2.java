package com.assignment;

import java.util.Scanner;

public class Testpocdemo2 {

	public static void main(String[] args) {
		System.out.println("RS Rental Houses");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name");
		String name=sc.nextLine();
		System.out.println("Enter monthly salary");
		double salary=sc.nextDouble();
	
		if(salary>=15000 && salary<=35000) {
			System.out.println("its okay discussion continue");
			
			System.out.println("Enter age");
			int age=sc.nextInt();
			if(age>=25&&age<=30) {
				System.out.println("u r married ");
				
				System.out.println("number of the family member");
				int num=sc.nextInt();
				if(num>=0&&num<=6){
					System.out.println(" its  a small family ");
					sc.nextLine();
					
					
						
					System.out.println("you have a pet");
					String pet=sc.nextLine();
					if(pet.equals("dog")|| pet.equals("cat")) {
						System.out.println(" its is friendly");
						
						System.out.println("you r rent budget");
						double rent=sc.nextDouble();
						if(rent<=10000&&rent>=5000) {
							System.out.println(" it is ok rent ");
						
							
							System.out.println("what is your job");
							String job=sc.next();
							if(job.equals("private emp")||job.equals("govt emp")) {
								System.out.println(" ok nyc!!!");
							}else {
								System.out.println(" ok good");
							}
						}else {
							System.out.println("it's not good rent to this house"); 
						}
						
					}else {
						System.out.println("it's dangerous");
						
					}
					
				}else {
					System.out.println(" it's is very bg family");
				}
				
			}else {
				System.out.println("age is not sutiable");
			}
	
			
			
		}else {
			
		}System.out.println("you are eligilble for rs rental houses");
		
		
		
	

	}
		
		}


