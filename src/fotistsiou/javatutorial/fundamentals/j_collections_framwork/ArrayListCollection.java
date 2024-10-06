package fotistsiou.javatutorial.fundamentals.j_collections_framwork;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListCollection {

    public static void main(String[] args) {
        /* ArrayList */
        // -> An ArrayList implements List interface.
        // -> An ArrayList is a resizable array.
        // -> Use ArrayList when you need fast access by index.

        // Create an ArrayList
        ArrayList<String> cars = new ArrayList<String>();

        // Add elements to the ArrayList
        cars.add("Toyota");
        cars.add("BMW");
        cars.addFirst("Audi");
        cars.addLast("Volvo");
        cars.add(1, "Mazda"); // Add element at a specified position without remove the existing element.

        // Print the ArrayList
        System.out.println("Cars: " + cars);

        // Access an element in the ArrayList
        System.out.println("The 2nd car: " + cars.get(1));

        // ArrayList Size
        System.out.println("Number of cars: " + cars.size());

        // Remove an element from the ArrayList
        cars.remove(1);
        System.out.println("Cars after removing the 2nd car: " + cars);

        // Modify an element of the ArrayList
        cars.set(1, "Hyundai");
        System.out.println("Cars after modification of the 2nd car: " + cars);

        // Sort the ArrayList
        Collections.sort(cars);
        System.out.println("Cars after ascending sorting: " + cars);

        // Sort the ArrayList in reverse order
        Collections.sort(cars, Collections.reverseOrder());
        System.out.println("Cars after descending sorting: " + cars);

        // Loop through the elements of the ArrayList
        int index = 0;
        for (String car : cars) {
            System.out.println("Car number " + index + ": " + car);
            index++;
        }

        // Remove all elements from the ArrayList
        cars.clear();
        System.out.println("Cars after removing all cars: " + cars);
    }
}
