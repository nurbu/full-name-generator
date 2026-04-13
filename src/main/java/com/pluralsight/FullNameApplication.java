package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {
        // Variables used
        String firstName = "";
        String lastName = "";
        String middleName, suffix, fullName;

        // Puts first and last name together. Will include middle name and suffix if provided.

        Scanner scanner = new Scanner(System.in);

        // Asks the user for information

        System.out.println("Please enter your name.");
        // Make sures we get a first name.
        while (firstName.length() == 0) {
            System.out.print("First name: ");
            firstName = scanner.nextLine().trim();
        }
        System.out.print("Middle name: ");
        middleName = scanner.nextLine().trim();
        // Make sures we get a last name.
        while (lastName.length() == 0) {
            System.out.print("Last name: ");
            lastName = scanner.nextLine().trim();
        }
        System.out.print("Suffix: ");
        suffix = scanner.nextLine().trim();

        // Calls the getFullName and gets the full name and gets stored in fullName
        fullName = getFullName(firstName, middleName, lastName, suffix);
        System.out.println("Full name: " + fullName);

        scanner.close();

    }

    public static String getFullName(String firstName, String middleName, String lastName, String suffix) {
        /*Checks if there is a middle name. If yes, get the first character of middle name and add a "." to it.
        If no middle name leave it blank.
        */
        String middleFirstLetter = " ";
        // Check to see if they put full middle name.
        if (middleName.length() > 2) {
            middleFirstLetter = " " + middleName.substring(0, 1).toUpperCase() + ". ";
        }
        // Check if they put the middle name initial with "."
        else if (middleName.length() == 2) {
            middleFirstLetter = " " + middleName + " ";
        }
        /* Check if there is a suffix. If yes return the full name but with a "," before the suffix.
        If no suffix, just returns the rest of the name as the middle name logic is completed already.
         */
        return (suffix.length() > 0) ? firstName + middleFirstLetter + lastName + ", " + suffix :
                firstName + middleFirstLetter + lastName;


    }
}
