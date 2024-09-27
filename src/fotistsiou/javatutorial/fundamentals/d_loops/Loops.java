package fotistsiou.javatutorial.fundamentals.d_loops;

import java.util.Scanner;

public class Loops {

    public static void main(String[] args) {
        /* Loops */

        Scanner scanner = new Scanner(System.in);
        System.out.println("----- Calculate Multiples of Number -----");

        // While Loop
        // Checking if the condition is true, before execute the code block.
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
        // Will execute the code block once, before checking if the condition is true.
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

        // Break / Continue
        // The break statement can be used to jump out of a loop.
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                break;
            }
            System.out.println(i);
        }
        // The continue statement breaks one iteration (in the loop), if a specified condition occurs, and continues with the next iteration in the loop.
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                continue;
            }
            System.out.println(i);
        }

        scanner.close();
    }
}

