/*Q2 - Write a Java method to count all vowels in a string */

import java.util.Scanner;

public class VowelCounter {
    public static int countVowels(String input) {
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input from the user for a string
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();

        // Call the countVowels() method with user-inputted string
        int result = countVowels(input);

        // Print the result
        System.out.println("The number of vowels in the input string is: " + result);
    }
}
