package fotistsiou.javatutorial.b_fundamental_topics.h_methods.methods_user_defined;

import java.util.Arrays;

/**
 * Arrays as parameters
 * --------------------
 * Passing arrays to methods
 * -> A method can have parameters of any types including arrays, strings, primitive types, and so on.
 * -> In the body of the method, we can process the input array in any way.
 * -> When you pass a value of a primitive type to a method, a copy of the value is created.
 *    When you pass an array to a method, a copy of the reference is created, but the value is the same.
 *    It means that if you change the actual value in the body of a method, you will see these changes outside the method.
 * Varargs
 * -> It's possible to pass an arbitrary number of the same type of arguments to a method using a special syntax named
 *    varargs (variable-length arguments).
 * -> These arguments are specified by three dots after the type.
 * -> In the body of the method, you can process this parameter as a regular array of the specified type.
 * -> If a method has more than one parameter, the vararg parameter must be the last one in the declaration of the method.
 */

public class ArrayAsParameters {

    public static void main(String[] args) {
        // Passing arrays to methods
        int[] numbers = { 1, 2, 3, 4, 5 };
        System.out.println(Arrays.toString(numbers));
        swapFirstAndLastElements(numbers);
        System.out.println(Arrays.toString(numbers));

        // Varargs
        printNumberOfArguments(1);
        printNumberOfArguments(1, 2);
        printNumberOfArguments(1, 2, 3);
        printNumberOfArguments(new int[] { });
        printNumberOfArguments(new int[] { 1, 2 });
    }

    public static void swapFirstAndLastElements(int[] nums) {
        if (nums.length < 1) {
            return;
        }
        int temp = nums[nums.length - 1];
        nums[nums.length - 1] = nums[0];
        nums[0] = temp;
    }

    public static void printNumberOfArguments(int... numbers) {
        System.out.println(numbers.length);
    }
}
