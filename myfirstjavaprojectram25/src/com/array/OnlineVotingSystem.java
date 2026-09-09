package com.array;

import java.util.Scanner;



public class OnlineVotingSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        if (age < 18) {
            System.out.println("Not Eligible");
        } else {

            System.out.print("Enter your gender (M/F): ");
            char gender = sc.next().charAt(0);

            if (gender != 'M' && gender != 'F') {
                System.out.println("Not Eligible");
            } else {
                System.out.print("Enter VoterId No: ");
                String voterIdNo = sc.next();

                if (!voterIdNo.isEmpty()) {

                   
                    System.out.println("\nChoose any one candidate:");
                    System.out.println("1. Mark Antony");
                    System.out.println("2. John Peter");
                    System.out.println("3. David Kumar");
                    System.out.println("4. Robert Smith");

                    System.out.print("Press any one option: ");
                    int option = sc.nextInt();

                    // Capture vote
                    switch (option) {
                        case 1:
                            System.out.println("Vote is Captured for Mark Antony");
                            break;

                        case 2:
                            System.out.println("Vote is Captured for John Peter");
                            break;

                        case 3:
                            System.out.println("Vote is Captured for David Kumar");
                            break;

                        case 4:
                            System.out.println("Vote is Captured for Robert Smith");
                            break;

                        default:
                            System.out.println("Thanks for Voting To NOTA");
                    }
                }
            }
        }

        sc.close();
    }
}
	


		
	


	
	

