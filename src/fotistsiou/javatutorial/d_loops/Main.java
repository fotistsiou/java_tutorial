package fotistsiou.javatutorial.d_loops;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* Loops */

        Scanner scanner = new Scanner(System.in);
        System.out.println("----- Calculate Multiples of Number -----");

        // While Loop
        // Checking if the condition is true, before execute the code block.
        boolean input = false; // I need to assign a value to 'input' variable outside the code block.
        while (!input) {
            System.out.println("Enter an integer N from 2 to 20: ");
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

        // Break / Continue
    }
}

