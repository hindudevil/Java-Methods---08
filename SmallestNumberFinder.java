/*Q5 - Write a Java method to find the smallest number among three numbers. */

import java.util.Scanner;

public class SmallestNumberFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three numbers:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        int smallest = findSmallestNumber(num1, num2, num3);
        System.out.println("The smallest number is: " + smallest);

        scanner.close();
    }

    public static int findSmallestNumber(int num1, int num2, int num3) {
        int smallest = num1;
        if (num2 < smallest) {
            smallest = num2;
        }
        if (num3 < smallest) {
            smallest = num3;
        }
        return smallest;
    }
}
