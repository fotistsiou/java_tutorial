package fotistsiou.javatutorial.b_fundamental_topics.f_loops.problems;

import java.util.Scanner;

/**
 * Sum Of Integers Sequence
 * ---------------
 * Read 2 integers and print the sum of integers from 1st input integer to 2nd input integer, including both.
 * 1. Using do-while loop.
 * 2. Using for loop.
 */

public class SumOfIntegers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 2 integers: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        // 1. Using do-while loop.
        int sum = 0;
        int tempNum = num1;
        do {
            sum += tempNum;
            tempNum++;
        } while (tempNum <= num2);
        System.out.println("Sum with do-while loop: " + sum);

        // 2. Using for loop.
        int sum2 = 0;
        for (int i = num1; i <= num2; i++) {
            sum2 += i;
        }
        System.out.println("Sum with for loop: " + sum2);

        scanner.close();
    }
}
