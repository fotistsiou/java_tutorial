package fotistsiou.javatutorial.b_java_fundamentals_topics.g_arrays.problems.iterating_over_arrays;

import java.util.Scanner;

/**
 * Sum of multiples of 3 in an array
 * ---------------------------------
 * Write a program that accomplishes the following tasks:
 * 1. Accepts an integer 'n' as input which indicates the number of elements to be in the array.
 * 2. Afterward, accepts 'n' number of integers as input for elements of the array.
 * 3. The program should then calculate the sum of all the elements in the array which are multiples of 3.
 * 4. Print the sum of these numbers as output.
 */

public class SumOfMultiples {

    public static void main(String[] args) {
        // 1. Accepts an integer 'n' as input which indicates the number of elements to be in the array.
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        // 2. Afterward, accepts 'n' number of integers as input for elements of the array.
        for (int i = 0; i < n; i++){
            arr[i] = scanner.nextInt();
        }

        // 3. The program should then calculate the sum of all the elements in the array which are multiples of 3.
        int sum = 0;
        for (int i = 0; i < n; i++){
            if (arr[i] % 3 == 0){
                sum += arr[i];
            }
        }

        // 4. Print the sum of these numbers as output.
        System.out.println(sum);

        scanner.close();
    }
}
