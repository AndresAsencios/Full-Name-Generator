package com.pluralsight;



import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        // Variables
        String firstName = "";
        String middleName = "";
        String lastName = "";
        String suffix = "";


    // Name enter
        System.out.println("Please enter your name");

        System.out.print("First name: ");
        firstName = read.nextLine().trim();
        if (!firstName.isEmpty()) {
            firstName = firstName.substring(0, 1).toUpperCase()
                    + firstName.substring(1).toLowerCase();
        }
        System.out.print("Middle Name: ");
        middleName = read.nextLine().trim();
        if (!middleName.isEmpty()) {
            middleName = middleName.substring(0, 1).toUpperCase()
                    + middleName.substring(1).toLowerCase();
        }

        System.out.print("Last Name: ");
        lastName = read.nextLine().trim();
        if (!lastName.isEmpty()) {
            lastName = lastName.substring(0, 1).toUpperCase()
                    + lastName.substring(1).toLowerCase();
        }

        System.out.print("Suffix: ");
        suffix = read.nextLine().trim();

        String fullName = firstName;

        if (!middleName.isEmpty()) {
            fullName += " " + middleName;
        }
        // Always add the last name
        fullName += " " + lastName;

        if(!suffix.isEmpty()) {
            fullName += ", " + suffix;
        }

        System.out.println("Full name: " + fullName);

        read.close();
    }
}
