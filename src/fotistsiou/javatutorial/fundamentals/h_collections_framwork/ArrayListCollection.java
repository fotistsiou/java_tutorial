package fotistsiou.javatutorial.fundamentals.h_collections_framwork;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListCollection {

    public static void main(String[] args) {
        /* ArrayList */
        // -> The ArrayList class is a resizable array, which can be found in the java.util package.
        // -> The difference between a built-in array and an ArrayList in Java, is that the size of an array cannot be modified.

        // Create an ArrayList
        ArrayList<String> cars = new ArrayList<String>();

        // Add items to the ArrayList
        cars.add("Toyota");
        cars.add("BMW");
        cars.addFirst("Audi");
        cars.addLast("Volvo");
        cars.add(1, "Mazda"); // Add item at a specified position without remove the existing element.

        // Print the ArrayList
        System.out.println("Cars: " + cars);

        // Access an item in the ArrayList
        System.out.println("The 2nd car: " + cars.get(1));

        // ArrayList Size
        System.out.println("Number of cars: " + cars.size());

        // Remove an item from the ArrayList
        cars.remove(1);
        System.out.println("Cars after removing the 2nd car: " + cars);

        // Modify an item of the ArrayList
        cars.set(1, "Hyundai");
        System.out.println("Cars after modification of the 2nd car: " + cars);

        // Sort the ArrayList
        Collections.sort(cars);
        System.out.println("Cars after ascending sorting: " + cars);

        // Sort the ArrayList in reverse order
        Collections.sort(cars, Collections.reverseOrder());
        System.out.println("Cars after descending sorting: " + cars);

        // Loop through the items of the ArrayList
        int index = 0;
        for (String car : cars) {
            System.out.println("Car number " + index + ": " + car);
            index++;
        }

        // Remove all items from the ArrayList
        cars.clear();
        System.out.println("Cars after removing all cars: " + cars);
    }
}
