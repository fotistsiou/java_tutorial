package fotistsiou.javatutorial.b_java_fundamentals_topics.f_loops;

import java.util.Scanner;

/**
 * Loops
 * -> Looping in programming languages is a feature which facilitates the execution of a set of instructions/functions
 *    repeatedly while some condition evaluates to true.
 * -> Java provides 3 types of loop statements:
 *    - While loop: Checking if the condition is true, before execute the code block.
 *    - Do While loop: Will execute the code block once, before checking if the condition is true.
 *    - For loop: Used when you know exactly how many times you want to loop through a block of code.
 * -> There are 2 more statements, used inside the loops:
 *    - Break Statement: Can be used to jump out of a loop.
 *    - Continue Statement: Can be used to break one iteration in the loop.
 */

public class Loops {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // While Loop
        int a = 0;
        while (a < 5) {
            System.out.println(a);
            a++;
        }

        // Do While Loop
        int b = 0;
        do {
            System.out.println(b);
            b++;
        }
        while (b < 5);

        // For Loop
        for (int c = 0; c < 5; c++) {
            System.out.println(c);
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
