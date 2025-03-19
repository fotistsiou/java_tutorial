package fotistsiou.javatutorial.b_java_fundamentals_topics.h_methods.problems;

import java.util.Random;
import java.util.Scanner;

/**
 * Generating passwords
 * --------------------
 * A password is hard to crack if it contains at least A uppercase letters, at least B lowercase letters, at least C
 * digits and consists of exactly N symbols. Also, a password cannot contain two or more of the same characters in a row.
 * For the given numbers A, B, C, and N, you should output a password that matches these requirements.
 * It is guaranteed that A, B, C, and N are non-negative integers, and A + B + C <= N. Keep in mind that any parameter
 * can be equal to zero. It means that it's ok if the password doesn't contain symbols of such type.
 */

public class GeneratingPasswords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int N = scanner.nextInt();

        // Character pools
        char[] upperChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        char[] lowerChars = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        char[] digitChars = "0123456789".toCharArray();

        StringBuilder password = new StringBuilder();
        Random random = new Random();

        // Add at least A + B + C letters & digits
        addRandomChars(password, upperChars, A, random); // Add at least A uppercase letters
        addRandomChars(password, lowerChars, B, random); // Add at least B lowercase letters
        addRandomChars(password, digitChars, C, random); // Add at least C digits

        // Check if the password requires additional characters
        if (password.length() < N) {
            // Create new character pool from all character pools
            char[] newCharPool = createConcatPool(upperChars, lowerChars, digitChars);

            // Fill remaining length with random characters from new character pool
            addRandomChars(password, newCharPool, N - password.length(), random);
        }

        System.out.println(password);

        scanner.close();
    }

    static void addRandomChars(StringBuilder password, char[] pool, int count, Random random) {
        // Loop to add 'count' random characters to the password
        for (int i = 0; i < count; i++) {
            char nextChar; // Variable to hold the next randomly chosen character

            // Generate a random character and ensure it doesn't repeat consecutively
            do {
                nextChar = pool[random.nextInt(pool.length)]; // Select a random character from the pool
            } while (
                !password.isEmpty() // Ensure the password is not empty
                && // And
                password.charAt(password.length() - 1) == nextChar // Ensure the newly generated character is not the same as the last character in the password
            );

            // Append the valid character to the password
            password.append(nextChar);
        }
    }

    static char[] createConcatPool(char[] upperChars, char[] lowerChars, char[] digitChars) {
        String newCharPoolString = String.valueOf(upperChars) + String.valueOf(lowerChars) + String.valueOf(digitChars);
        return newCharPoolString.toCharArray();
    }
}
