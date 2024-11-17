package fotistsiou.javatutorial.b_java_fundamentals.h_methods.problems;

import java.util.Scanner;

/**
 * Calculating factorial of a given number
 * ---------------------------------------
 * Create a Java program that prompts the user for an integer 'n' and prints the factorial of 'n'.
 * For example, if the input is 5, the output should be 120 since 1*2*3*4*5 = 120.
 */

public class FactorialNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long number, factorial = 1;

        System.out.println("Enter a positive integer: ");
        while (true) {
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                if (number > 0) {
                    for (int i = 1; i <= number; i++) {
                        factorial *= i;
                    }
                    break;
                } else {
                    System.out.println("Invalid input. Enter a positive integer:");
                    scanner.nextLine();
                }
            } else {
                System.out.println("Invalid input. Enter a positive integer:");
                scanner.nextLine();
            }
        }

        System.out.println("The factorial of " + number + " is: " + factorial);
        scanner.close();
    }
}
