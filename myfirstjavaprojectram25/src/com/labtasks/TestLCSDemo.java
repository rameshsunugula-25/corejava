package com.labtasks;
import java.util.Scanner;

public class TestLCSDemo{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char continueChoice = 0;

        do {
            
            System.out.println("  WEICOME TO FOOD COURT ");
            System.out.println("1. Burger  - ₹120");
            System.out.println("2. Pizza   - ₹250");
            System.out.println("3. Biryani - ₹180");
            System.out.println("4. Dosa    - ₹80");
            System.out.println("5. Idly    - ₹50");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            String item = "";
            int price = 0;

            switch (choice) {
                case 1:
                    item = "Burger";
                    price = 120;
                    break;

                case 2:
                    item = "Pizza";
                    price = 250;
                    break;

                case 3:
                    item = "Biryani";
                    price = 180;
                    break;

                case 4:
                    item = "Dosa";
                    price = 80;
                    break;

                case 5:
                    item = "Idly";
                    price = 50;
                    break;

                default:
                    System.out.println("Invalid choice!");
                    continue;
            }
System.out.println("*******************************************");
            System.out.println("You selected: " + item);
            System.out.println("Price: ₹" + price);
            System.out.println("*******************************************");
            System.out.print("Do you want to continue? Y/N: ");
            continueChoice = sc.next().charAt(0);

            System.out.println();

        } while (continueChoice == 'Y' || continueChoice == 'y');

        System.out.println("Thank you for visiting!");

        sc.close();
    }
}



