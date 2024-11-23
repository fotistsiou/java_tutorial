package fotistsiou.javatutorial.b_java_fundamentals.h_methods.problems;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Get first and last elements
 * ---------------------------
 * Write a method named getFirstAndLast. The method must take an array of ints and return a new array of ints.
 * The returned array must contain two elements: the first and the last elements of the input array.
 * It is guaranteed that the input array always has at least one element. 
 */

public class GetFirstLast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int[] result = getFirstAndLast(array);
        Arrays.stream(result).forEach(e -> System.out.print(e + " "));
    }

    static int[] getFirstAndLast(int[] array) {
        return new int[]{array[0], array[array.length - 1]};
    }
}
