/*Q3 - Write a Java method to display the middle character of a string.
Note: a) If the length of the string is even there will be two middle characters.
b) If the length of the string is odd there will be one middle character. */

import java.util.Scanner;

public class MiddleCharacter {
    public static void displayMiddleCharacter(String input) {
        // Get the length of the input string
        int length = input.length();

        // Calculate the index of the middle character(s)
        int middleIndex = length / 2;

        // Check if the length of the string is even or odd
        if (length % 2 == 0) {
            // If the length is even, display the two middle characters
            char middleChar1 = input.charAt(middleIndex - 1);
            char middleChar2 = input.charAt(middleIndex);
            System.out.println("The middle characters of the input string are: " + middleChar1 + ", " + middleChar2);
        } else {
            // If the length is odd, display the middle character
            char middleChar = input.charAt(middleIndex);
            System.out.println("The middle character of the input string is: " + middleChar);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        displayMiddleCharacter(input);
    }
}

