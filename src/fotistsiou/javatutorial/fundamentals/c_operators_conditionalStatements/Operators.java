package fotistsiou.javatutorial.fundamentals.c_operators_conditionalStatements;

import java.util.Scanner;

public class Operators {

    public static void main(String[] args) {
        /* Operators */
        // The most common groups of Java operators are the following:
        // - Arithmetic operators: +, -, *, /, %, ++, --
        // - Assignment operators: =, +=, -=, *=, /=, %=, &=, |=, ^=, >>=, <<=
        // - Comparison operators: ==, !=, >, <, >=, <=
        // - Logical operators: &&, ||, !

        // Write a program that:
        // - Reads a three-digit number.
        // - Then, calculates the new number by reversing its digits.
        // - Finally, prints the new number.

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
