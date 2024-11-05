package fotistsiou.javatutorial.fundamentals.h_arrays.problems;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Check if an array is sorted ascending
 * --------------
 * Input data format
 * 1. The first line contains the size of an array.
 * 2. The second line contains elements of the array separated by spaces.
 * Output data format
 * 1. Only a single value: true or false.
 */

public class CheckArraySorted {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        scanner.nextLine(); // Consume the leftover newline character

        int[] arr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        scanner.close();

        for (int i = 1; i < size; i++) {
            if (arr[i] < arr[i - 1]) {
                System.out.println(false);
                return;
            }
        }

        System.out.println(true);
    }
}
