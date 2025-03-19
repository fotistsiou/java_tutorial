package fotistsiou.javatutorial.b_java_fundamentals_topics.g_arrays.one_dimensional_arrays;

import java.util.Arrays;

/**
 * Ways To Create An Array
 * -----------------------
 * To create an array filled with elements we should:
 * - Declare a variable of an array type (declaration).
 * - Create an instance of the array object (instantiation).
 * - Initialize the array by some values (initialization).
 * Java provides several ways to create an array with specified elements.
 * - 1. Creating an array with specified elements.
 * - 2. Creating an array using the "new" keyword.
 */

public class WaysToCreateAnArray {

    public static void main(String[] args) {
        /* 1. Creating an array with specified elements */

        // 1.1. The simplest way to instantiate and initialize an array is to enumerate all its elements.
        int[] numbers1 = { 1, 2, 3, 4 };
        System.out.println("numbers1 > " + Arrays.toString(numbers1));

        // 1.2. Another way is to initialize an array using variables.
        int a = 1, b = 2, c = 3, d = 4;
        int[] numbers2 = { a, b, c, d };
        System.out.println("numbers2 > " + Arrays.toString(numbers2));


        /* 2. Creating an array using the "new" keyword */

        // 2.1. The most general way to create an array is to use the special keyword new
        //      and specify the necessary number of elements.
        int n = 4;
        int[] numbers3 = new int[n];
        for (int i = 0; i < n; i++) {
            numbers3[i] = i + 1;
        }
        System.out.println("numbers3 > " + Arrays.toString(numbers3));
    }
}
