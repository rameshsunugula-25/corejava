package com.assignment;

import java.util.Scanner;

public class TestTCdemo1 {

    static double totalcost = 0;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String yn;

        do {

            System.out.println("Enter category (vegetables/fruits):");
            String cat = sc.next();

            switch (cat) {

            case "vegetables" -> {

                String vyn = "";
                double totalvegetablescost = 0;

                do {

                    System.out.println("Enter item:");
                    String item = sc.next();

                    switch (item) {

                    case "potato" -> {
                        System.out.println("Potato per kg is 50");
                        double potprice = 50;
                        totalvegetablescost += potprice;
                    }

                    case "tomato" -> {
                        System.out.println("Tomato per kg is 40");
                        double tomprice = 40;
                        totalvegetablescost += tomprice;
                    }

                    case "onion" -> {
                        System.out.println("Onion per kg is 60");
                        double onionprice = 60;
                        totalvegetablescost += onionprice;
                    }

                    case "carrot" -> {
                        System.out.println("Carrot per kg is 80");
                        double carrotprice = 80;
                        totalvegetablescost += carrotprice;
                    }

                    case "brinjal" -> {
                        System.out.println("Brinjal per kg is 45");
                        double brinjalprice = 45;
                        totalvegetablescost += brinjalprice;
                    }

                    case "cabbage" -> {
                        System.out.println("Cabbage per kg is 35");
                        double cabbageprice = 35;
                        totalvegetablescost += cabbageprice;
                    }

                    case "beans" -> {
                        System.out.println("Beans per kg is 70");
                        double beansprice = 70;
                        totalvegetablescost += beansprice;
                    }

                    case "peas" -> {
                        System.out.println("Peas per kg is 90");
                        double peasprice = 90;
                        totalvegetablescost += peasprice;
                    }

                    case "spinach" -> {
                        System.out.println("Spinach per kg is 30");
                        double spinachprice = 30;
                        totalvegetablescost += spinachprice;
                    }

                    case "cauliflower" -> {
                        System.out.println("Cauliflower per kg is 55");
                        double cauliflowerprice = 55;
                        totalvegetablescost += cauliflowerprice;
                    }

                    default -> System.out.println("This vegetable is not available.");
                    }

                    System.out.println("Do you want to continue vegetables? Enter y/n:");
                    vyn = sc.next();

                } while (vyn.equalsIgnoreCase("y"));

                System.out.println("Your total vegetable cost is: " + totalvegetablescost);

                totalcost += totalvegetablescost;

                System.out.println("Exit from vegetables category.");
            }

            case "fruits" -> {

                String fyn = "";
                double totalfruitscost = 0;

                do {

                    System.out.println("Enter item:");
                    String item = sc.next();

                    switch (item) {

                    case "apple" -> {
                        System.out.println("Apple per kg is 90");
                        double appprice = 90;
                        totalfruitscost += appprice;
                    }

                    case "banana" -> {
                        System.out.println("Banana per kg is 50");
                        double bananaprice = 50;
                        totalfruitscost += bananaprice;
                    }

                    case "mango" -> {
                        System.out.println("Mango per kg is 120");
                        double mangoprice = 120;
                        totalfruitscost += mangoprice;
                    }

                    case "orange" -> {
                        System.out.println("Orange per kg is 80");
                        double orangeprice = 80;
                        totalfruitscost += orangeprice;
                    }

                    case "grapes" -> {
                        System.out.println("Grapes per kg is 90");
                        double grapesprice = 90;
                        totalfruitscost += grapesprice;
                    }

                    case "papaya" -> {
                        System.out.println("Papaya per kg is 60");
                        double papayaprice = 60;
                        totalfruitscost += papayaprice;
                    }

                    case "guava" -> {
                        System.out.println("Guava per kg is 70");
                        double guavaprice = 70;
                        totalfruitscost += guavaprice;
                    }

                    case "pineapple" -> {
                        System.out.println("Pineapple per kg is 80");
                        double pineappleprice = 80;
                        totalfruitscost += pineappleprice;
                    }

                    case "watermelon" -> {
                        System.out.println("Watermelon per kg is 40");
                        double watermelonprice = 40;
                        totalfruitscost += watermelonprice;
                    }

                    case "pomegranate" -> {
                        System.out.println("Pomegranate per kg is 150");
                        double pomegranateprice = 150;
                        totalfruitscost += pomegranateprice;
                    }

                    default -> System.out.println("This fruit is not available.");
                    }

                    System.out.println("Do you want to continue fruits? Enter y/n:");
                    fyn = sc.next();

                } while (fyn.equalsIgnoreCase("y"));

                System.out.println("Your total fruit cost is: " + totalfruitscost);

                totalcost += totalfruitscost;

                System.out.println("Exit from fruits category.");
            }

            default -> System.out.println("This category is not available.");
            }

            System.out.println("Do you want to continue shopping? Enter y/n:");
            yn = sc.next();

        } while (yn.equalsIgnoreCase("y"));

        System.out.println("Your total cost is: " + totalcost);
        System.out.println("Exit from invoice.");

        sc.close();
    }
}
