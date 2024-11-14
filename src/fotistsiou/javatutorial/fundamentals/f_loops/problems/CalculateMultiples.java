package fotistsiou.javatutorial.fundamentals.f_loops.problems;

import java.util.Scanner;

/**
 * Calculate Multiples
 * -------------------
 * Write a Java program that calculate multiples of input number:
 * 1. Using while loop.
 * 2. Using do-while loop.
 * 3. Using for loop.
 */

public class CalculateMultiples {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Using while loop.
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

        // 2. Using do-while loop.
        boolean input2;
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

        // 3. Using for loop.
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

        scanner.close();
    }
}
