package fotistsiou.javatutorial.b_java_fundamentals.h_methods.problems;

import java.util.Scanner;

/**
 * Phantom phonics and spectral syllables
 * --------------------------------------
 * Create a Halloween-themed ghost counter that counts the number of 'boo's in a given string.
 * The program should take a string as input and output the count of 'boo's (case-insensitive).
 * --------------------------------------
 * Write a program in Java without change the main method.
 */

public class PhantomPhonics {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();

        int count = countBoos(input);
        System.out.println(count);
    }

    public static int countBoos(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }

        int count = 0;
        String wordToCount = "boo";

        // Convert the string to lowercase for case-insensitive matching
        str = str.toLowerCase();

        // Split by non-word characters (anything that's not a letter or digit)
        String[] words = str.split("\\W+");

        for (String word : words) {
            // Use the "contains" method instead of the "equals" method for the case "boo" is part of a word.
            if (word.contains(wordToCount)) {
                count++;
            }
        }

        return count;
    }
}
