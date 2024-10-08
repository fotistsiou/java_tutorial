package fotistsiou.javatutorial.fundamentals.h_arrays;

/* One-Dimensional Arrays */
// -> They are used to store multiple values of the same type in a single variable.
// -> They are useful for managing collections of data efficiently.
// -> The size of a One-Dimensional Array cannot be modified.

import java.util.Arrays;

public class OneDimensionalArrays {

    public static void main(String[] args) {
        // Create an One-Dimensional Arrays
        // -> To declare an array, define the variable type with square brackets.
        // -> To insert values to it, you can place the values in a comma-separated list, inside curly braces.
        String[] cars = {"Toyota", "Hyundai", "Opel"};

        // Print the One-Dimensional Array
        System.out.println("Cars: " + Arrays.toString(cars));

        // Access the Elements of the One-Dimensional Array
        System.out.println("The 1st car is " + cars[0]);

        // Change an Element of the One-Dimensional Array
        cars[2] = "Volvo";
        System.out.println("The 3rd car is " + cars[2]);

        // One-Dimensional Array Length
        System.out.println("There are " + cars.length + " cars.");

        // Loop Through the One-Dimensional Array
        // -> With For Loop
        System.out.println("Loop Through the One-Dimensional Array With Nested For Loop:");
        for (int i = 0; i < cars.length; i++) {
            System.out.println("Car " + i + ": " + cars[i]);
        }
        // -> With For-Each Loop
        System.out.println("Loop Through the One-Dimensional Array With For-Each Loop:");
        int index = 0;
        for (String car : cars) {
            System.out.println("Car " + index + ": " + car);
            index++;
        }
    }
}
