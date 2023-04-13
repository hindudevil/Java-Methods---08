/*Q1 - Write a Java method to compute the average of three numbers */

import java.util.Scanner;

public class AverageCalculator {
    public static double computeAverage(double num1, double num2, double num3) {
        // Compute the sum of three numbers
        double sum = num1 + num2 + num3;

        // Compute the average by dividing the sum by 3
        double average = sum / 3;

        // Return the computed average
        return average;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input from the user for three numbers
        System.out.println("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.println("Enter the second number: ");
        double num2 = scanner.nextDouble();

        System.out.println("Enter the third number: ");
        double num3 = scanner.nextDouble();

        // Call the computeAverage() method with user-inputted values
        double result = computeAverage(num1, num2, num3);

        // Print the result
        System.out.println("The average of " + num1 + ", " + num2 + ", and " + num3 + " is: " + result);
    }
}

