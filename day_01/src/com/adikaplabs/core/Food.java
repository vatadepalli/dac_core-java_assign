package com.adikaplabs.core;

import java.util.Scanner;

class Food {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Flags
        boolean exit = false;
        int option = -1;

        // Data
        int total = 0;
        int[] prices = { 190, 130, 125, 135, 185, 165, 145, 146, 150, 140 };

        while (!exit) {
            // Display Menu
            System.out.println("*** Chaitanya Paranthas ***");
            System.out.println("1. Italian Parantha - 190");
            System.out.println("2. Punjabhi Thali - 130");
            System.out.println("3. Aalo Pantha - 125");
            System.out.println("4. Onion Parantha - 135");
            System.out.println("5. Maharaja Thali - 185");
            System.out.println("6. Paneer 65 - 165");
            System.out.println("7. Veg Manchurian - 145");
            System.out.println("8. Veg 65 - 146");
            System.out.println("9. Mushroom Chilli - 150");
            System.out.println("10. Golden Finger - 140");
            System.out.print("\nAdd food to cart \n(0 - To generate Bill): ");

            option = sc.nextInt();

            if (option == 0) {
                System.out.println("Your bill is: " + total);
                return;
            }

            if (option <= 10) {
                total += prices[option - 1];
                System.out.println("Item Added to List");
            }

        }

    }
}