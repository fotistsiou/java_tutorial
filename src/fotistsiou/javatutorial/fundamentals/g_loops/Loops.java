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
        boolean input = false; // I need to assign a value to 'input' variable outside the code block.
        while (!input) {
            System.out.println("Enter an integer from 2 to 20: ");
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

        // Do While Loop
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

        // For Loop
        boolean input3 = false;
        while (!input3) {
            System.out.println("Enter an integer from 1 to 10: ");
            int num = scanner.nextInt();
            int i, factorial = 1;
            if (num >= 1 && num <= 10) {
                for (i = 1; i <= num; i++) {
                    factorial *= i;
                }
                System.out.println("Factorial of " + num + " is: " + factorial);
                input3 = true;
            } else {
                System.out.println("Wrong Input! Try again!");
            }
        }

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
