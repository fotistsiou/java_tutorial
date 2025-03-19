package fotistsiou.javatutorial.b_java_fundamentals_topics.d_operators.problems;

import java.util.Scanner;

/**
 * Arithmetic Operators
 * --------------------
 * Write a program that:
 * 1. Reads a three-digit number.
 * 2. Then, calculates the new number by reversing its digits.
 * 3. Finally, prints the new number.
 */

public class ArithmeticOperators {

    public static void main(String[] args) {
        System.out.println("Enter a three-digit number:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int hundredsOfNumber = number / 100;
        int tensOfNumber = number % 100;
        int unitsOfNumber = tensOfNumber % 10;
        tensOfNumber = (tensOfNumber - unitsOfNumber) / 10;
        int reverseNumber = unitsOfNumber * 100 + tensOfNumber * 10 + hundredsOfNumber;
        System.out.println("Your number is " + number + " and its reverse is " + reverseNumber);
        scanner.close();
    }
}
