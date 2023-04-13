/*Q4 - Write a Java method to check whether a year (integer) entered by the user is a leap year or not. */

import java.util.Scanner;

public class LeapYearChecker {
    public static boolean isLeapYear(int year) {
        boolean isLeap = false;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    isLeap = true;
                }
            } else {
                isLeap = true;
            }
        }
        return isLeap;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input from the user for a year
        System.out.println("Enter a year: ");
        int year = scanner.nextInt();

        // Call the isLeapYear() method with user-inputted year
        boolean result = isLeapYear(year);

        // Print the result
        if (result) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}
