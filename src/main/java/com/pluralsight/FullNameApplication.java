package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {
        // Puts first and last name together. Will include middle name and suffix if provided.

        Scanner scanner = new Scanner(System.in);

        // Asks the user for information

        System.out.println("Please enter your name.");

        System.out.print("First name: ");
        String firstName = scanner.nextLine().trim();

        System.out.print("Middle name: ");
        String middleName = scanner.nextLine().trim();

        System.out.print("Last name: ");
        String lastName = scanner.nextLine().trim();

        System.out.print("Suffix: ");
        String suffix = scanner.nextLine().trim();

        String fullName = getFullName(firstName, middleName, lastName, suffix);
        System.out.println(fullName);


    }

    public static String getFullName(String firstName, String middleName, String lastName, String suffix) {
        String middleFirstLetter = "";
        if (middleName.length() > 0) {
            middleFirstLetter = middleName.substring(0, 1).toUpperCase() + ".";
        }
        return (suffix.length() > 0) ? firstName + middleFirstLetter + lastName + ", " + suffix :
                firstName + middleFirstLetter + lastName;


    }
}
