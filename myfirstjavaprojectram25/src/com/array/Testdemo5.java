package com.array;

import java.util.Scanner;

public class Testdemo5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] a = new int[n];

        System.out.println("Enter the elements:");

        // Reading elements
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        // Printing elements
        System.out.println("Array elements are:");

        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }

        sc.close();
    }
}