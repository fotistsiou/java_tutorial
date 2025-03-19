package fotistsiou.javatutorial.b_java_fundamentals_topics.h_methods.problems;

import java.util.Scanner;

/**
 * Number of occurrences
 * ---------------------
 * Write a program that finds the frequency of occurrences of a substring in a given string. Substrings cannot overlap:
 * for example, the string ababa contains only one substring aba.
 * ---------------------
 * Input data format
 * The first input line contains a string, the second one contains a substring.
 */

public class NumberOfOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String substr = scanner.nextLine();

        // With use split
        System.out.println((str.split(substr, -1).length) - 1);

        // With use indexOf
        int count = 0;
        int lastIndex = 0;
        while (lastIndex != -1) {
            lastIndex = str.indexOf(substr, lastIndex);
            if (lastIndex != -1) {
                count++;
                lastIndex += substr.length();
            }
        }
        System.out.println(count);

        scanner.close();
    }
}
