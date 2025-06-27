package fotistsiou.javatutorial.b_fundamental_topics.d_operators;

/**
 * Operators
 * -> The most common groups of Java operators are the following:
 *    - Arithmetic Operators: +, -, *, /, %, ++, --
 *    - Assignment Operators: =, +=, -=, *=, /=, %=, &=, |=, ^=, >>=, <<=
 *    - Comparison Operators: ==, !=, >, <, >=, <=
 *    - Logical Operators: &&, ||, !
 * -> Arithmetic Operators
 *    - '+': Addition (Adds together two values)
 *    - '-': Subtraction (Subtracts one value from another)
 *    - '*': Multiplication (Multiplies two values)
 *    - '/': Division (Divides one value by another)
 *    - '%': Modulus (Returns the division remainder)
 * -> Increment & Decrement Operators
 *    - Both operators have two very important forms, when using the result in the current statement:
 *      -> The prefix form (++n or --n) increases or decreases the value of a variable before it is used.
 *      -> The postfix form (n++ or n--) increases or decreases the value of a variable after it is used.
 */

public class Operators {

    public static void main(String[] args) {
        // Arithmetic Operators
        System.out.println(13 + 25); // prints 38
        System.out.println(20 + 70); // prints 40
        System.out.println(30 - 70); // prints -40
        System.out.println(21 * 3);  // prints 63
        System.out.println(20 * 10); // prints 200
        System.out.println(8 / 3);   // prints 2
        System.out.println(41 / 5);  // prints 8
        System.out.println(10 % 3);  // prints 1, because 10 divided by 3 leaves a remainder of 1
        System.out.println(12 % 4);  // prints 0, because 12 divided by 4 leaves no remainder
        System.out.println(5 % 9);   // prints 5, because 5 divided by 9 leaves a remainder of 5

        // Writing complex expressions
        System.out.println(1 + 3 * 4 - 2); // prints 11
        System.out.println((1 + 3) * (4 - 2)); // prints 8

        // Unary operators
        System.out.println(+5);         // prints 5
        System.out.println(-8);         // prints -8
        System.out.println(-(100 + 4)); // prints -104

        // Increment & Decrement Operators
        // Using ++ and -- in Java
        int n = 10;
        n++;    // 11
        n--;    // 10
        n += 1; // 11
        n -= 1; // 10
        // Prefix and postfix forms
        int a = 4;
        int b = ++a;
        System.out.println(a); // 5
        System.out.println(b); // 5
        int c = 4;
        int d = a++;
        System.out.println(c); // 5
        System.out.println(d); // 4
    }
}
