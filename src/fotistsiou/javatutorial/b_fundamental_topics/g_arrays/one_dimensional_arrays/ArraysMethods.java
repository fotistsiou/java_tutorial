package fotistsiou.javatutorial.b_fundamental_topics.g_arrays.one_dimensional_arrays;

import java.util.Arrays;

/**
 * Arrays.fill()
 * -> The Arrays.fill() method fills an array with a specified value.
 * -> Syntax:
 *    - Arrays.fill(array, value)
 *    - Arrays.fill(array, start, end, value)
 * -> Parameter Values:
 *    - array : Required. The array to be filled.
 *    - start : Optional. The index position of the first element (inclusive) to be filled.
 *    - end   : Optional. The index position of the last element (exclusive) to be filled.
 *    - value : Required. The value to fill in the array
 * ---------------------------------------------------------------------------------------
 * System.arraycopy()
 * -> The System.arraycopy() method copies an array from the specified source array, beginning at the specified position,
 *    to the specified position of the destination array.
 * -> Syntax:
 *    - System.arraycopy(source_arr, source_pos, dest_arr, dest_pos, len);
 * -> Parameter Values:
 *    - source_arr : Required. Array to be copied from.
 *    - source_pos : Required. Starting position in source array from where to copy.
 *    - dest_arr   : Required. Array to be copied in.
 *    - dest_pos   : Required. Starting position in destination array, where to copy in.
 *    - len        : Required. Total number of components to be copied.
 * ---------------------------------------------------------------------------------------
 * Arrays.stream()
 * -> The Arrays.stream() method returns a sequential stream of the specified array, allowing the use of Java Stream API
 *    operations on the array's elements, such as filtering, mapping, and reduction.
 * -> Syntax:
 *    - Arrays.stream(array)
 *    - Arrays.stream(array, start, end)
 * -> Parameter Values:
 *    - array : Required. The array from which a stream will be created.
 *    - start : Optional. The starting index (inclusive) from where the stream should start.
 *    - end   : Optional. The ending index (exclusive) up to where the stream should include elements.
 * -> Return Value:
 *    - Returns a stream of the specified type (e.g., IntStream for int arrays, DoubleStream for double arrays, etc.).
 */

public class ArraysMethods {

    public static void main(String[] args) {
        // Arrays.fill()
        int size = 10;
        char[] characters = new char[size];
        Arrays.fill(characters, 0, size / 2, 'A');
        Arrays.fill(characters, size / 2, size, 'F');
        System.out.println(Arrays.toString(characters));

        // System.arraycopy()
        int[] source_arr = {10, 20, 30, 40, 50};
        int len = source_arr.length;
        int[] dest_arr = new int[len];
        System.arraycopy(source_arr, 0, dest_arr, 0, len);
        System.out.println(Arrays.toString(dest_arr));

        // Arrays.stream()
        int[] int_arr = {1, 2, 3, 4, 5};
        Arrays.stream(int_arr).forEach(i -> System.out.print(i + " "));
        int sum = Arrays.stream(int_arr).sum();
        System.out.println(" -> sum = " + sum);
    }
}
