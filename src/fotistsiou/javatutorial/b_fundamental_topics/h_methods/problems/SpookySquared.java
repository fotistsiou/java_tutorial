package fotistsiou.javatutorial.b_fundamental_topics.h_methods.problems;

import java.util.Scanner;

/**
 * Spooky squared: A haunted sum
 * -----------------------------
 * You're planning a Halloween haunted house with N rooms.
 * Each room has a different number of ghosts.
 * Write a program that takes N as input and calculates the total number of ghosts if each room has i^2 ghosts,
 * where i is the room number (1 to N).
 * Print the total number of ghosts.
 * -----------------------------
 * Write a program in Java.
 */

public class SpookySquared {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int totalGhosts = 0;

        for (int i = 1; i <= N; i++) {
            totalGhosts += (int) Math.pow(i, 2);
        }

        System.out.println(totalGhosts);
        scanner.close();
    }
}
