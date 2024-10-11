package fotistsiou.javatutorial.fundamentals.g_loops;

import java.util.Scanner;

/* Loops */
// -> Looping in programming languages is a feature which facilitates the execution of a set of instructions/functions
//    repeatedly while some condition evaluates to true.
// -> Java provides 3 types of loop statements:
//    - While loop: Checking if the condition is true, before execute the code block.
//    - Do While loop: Will execute the code block once, before checking if the condition is true.
//    - For loop: Used when you know exactly how many times you want to loop through a block of code.
// -> There are 2 more statements, used inside the loops:
//    - Break Statement: Can be used to jump out of a loop.
//    - Continue Statement: Can be used to break one iteration in the loop.

public class Loops {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("----- Calculate Multiples of Number -----");

        // While Loop
        // -> Exercise 1: Calculate multiples of number
        boolean input = false;
        while (!input) {
            System.out.println("Enter an integer from 1 to 10: ");
            int n = scanner.nextInt();
            if (n >= 2 && n <= 20) {
                int i = 1;
                while (i <= 10) {
                    int multiple = i * n;
                    System.out.println(n + " x " + i + " = " + multiple);
                    i++;
                }
                input = true;
            } else {
                System.out.println("Wrong Input! Try again!");
            }
        }
        // -> Exercise 2: Write a Java program that reads a sequence of temperature readings in degrees Celsius
        //                until a reading of 100 degrees or more is encountered.
        int maxTemperature = 0;
        System.out.println("Enter a temperature: ");
        int temperature = scanner.nextInt();
        while (temperature < 100) {
            maxTemperature = Math.max(maxTemperature, temperature);
            System.out.println("Enter the next temperature: ");
            temperature = scanner.nextInt();
        }
        System.out.println("Max Temperature: " + maxTemperature);


        // Do While Loop
        // -> Exercise 1: Calculate multiples of number
        boolean input2; // I can assign a value to 'input2' variable inside the code block.
        do {
            System.out.println("Enter an integer from 1 to 10: ");
            int n = scanner.nextInt();
            if (n >= 1 && n <= 10) {
                int i = 1;
                while (i <= 10) {
                    int multiple = i * n;
                    System.out.println(n + " x " + i + " = " + multiple);
                    i++;
                }
                input2 = true;
            } else {
                System.out.println("Wrong Input! Try again!");
                input2 = false;
            }
        } while (!input2);
        // -> Exercise 2: Find the sum of all elements of a sequence, ending with the number 0.
        int sum = 0;
        int number;
        do {
            System.out.println("Enter a number: ");
            number = scanner.nextInt();
            sum += number;
        } while (number > 0);
        System.out.println("Sum of all elements of the sequence: " + sum);

        // For Loop
        // -> Exercise 1: Calculate multiples of number
        boolean input3 = false; // I need to assign a value to 'input' variable outside the code block.
        while (!input3) {
            System.out.println("Enter an integer from 2 to 20: ");
            int n = scanner.nextInt();
            if (n >= 2 && n <= 20) {
                for (int i = 1; i <= 10; i++) {
                    int multiple = i * n;
                    System.out.println(n + " x " + i + " = " + multiple);
                }
                input3 = true;
            } else {
                System.out.println("Wrong Input! Try again!");
            }
        }
        // Exercise 2: Print the sum of all integers from a to b including both.
        System.out.println("Enter 2 integers: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int sumOfInts = 0;
        for (int i = num1; i <= num2; i++) {
            sumOfInts += i;
        }
        System.out.println(sumOfInts);

        // Break Statement
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                break;
            }
            System.out.println(i);
        }

        // Continue Statement
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                continue;
            }
            System.out.println(i);
        }

        scanner.close();
    }
}
