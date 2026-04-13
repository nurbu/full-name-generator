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

        // Calls the getFullName and gets the full name and gets stored in fullName
        String fullName = getFullName(firstName, middleName, lastName, suffix);
        System.out.println(fullName);


    }

    public static String getFullName(String firstName, String middleName, String lastName, String suffix) {
        /*Checks if there is a middle name. If yes get the first character and add a "." to it.
        If no middle name leave it blank
        * */
        String middleFirstLetter = "";
        if (middleName.length() > 0) {
            middleFirstLetter = middleName.substring(0, 1).toUpperCase() + ".";
        }
        /* Check if there is a suffix. If yes return the full name but with a "," before the suffix.
        If no suffix you just return the rest of the name as the middle name logic is completed already.
         */
        return (suffix.length() > 0) ? firstName + middleFirstLetter + lastName + ", " + suffix :
                firstName + middleFirstLetter + lastName;


    }
}
