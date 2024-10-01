package fotistsiou.javatutorial.fundamentals.d_operators_conditionalStatements;

import java.util.Scanner;

public class Operators {

    public static void main(String[] args) {
        /* Operators */
        // The most common groups of Java operators are the following:
        // - Arithmetic Operators: +, -, *, /, %, ++, --
        // - Assignment Operators: =, +=, -=, *=, /=, %=, &=, |=, ^=, >>=, <<=
        // - Comparison Operators: ==, !=, >, <, >=, <=
        // - Logical Operators: &&, ||, !

        // Arithmetic Operators
        // -> '+': Addition (Adds together two values)
        // -> '-': Subtraction (Subtracts one value from another)
        // -> '*': Multiplication (Multiplies two values)
        // -> '/': Division (Divides one value by another)
        // -> '%': Modulus (Returns the division remainder)

        // Exercise 1 (Arithmetic Operators)
        // Write a program that:
        // - Reads a three-digit number.
        // - Then, calculates the new number by reversing its digits.
        // - Finally, prints the new number.
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

        // Increment (++) & Decrement (--) Operators
        // -> Both operators have two very important forms, when using the result in the current statement:
        //    - The prefix form (++n or --n) increases or decreases the value of a variable before it is used.
        //    - The postfix form (n++ or n--) increases or decreases the value of a variable after it is used.

        // Exercise 2 (Increment & Decrement Operators)
        // Find the values of 'result' variable.
        int a = 4;                          // Current Statement: a == 4
        int b = a++;                        // Current Statement: a == 5, b == 4
        int c = --a + b++;                  // Current Statement: a == 4, b == 5, c == 8, Calculation: c = 4 + 4 = 8
        int result = ++a - (c++ - b) + c;   // Current Statement: a == 5, b == 5, c == 9, Calculation: result = 5 - (8 - 5) + 9 = 11
        System.out.println("The result is " + result);
    }
}
