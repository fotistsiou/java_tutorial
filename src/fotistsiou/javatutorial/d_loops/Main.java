package fotistsiou.javatutorial.d_loops;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* Loops */

        Scanner scanner = new Scanner(System.in);

        // While Loop
        System.out.println("----- Calculate Multiples of Number -----");
        boolean input = false;
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

        // For Loop

        // Break / Continue
    }
}

