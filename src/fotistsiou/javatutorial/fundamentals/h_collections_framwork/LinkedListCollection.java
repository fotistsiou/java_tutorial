package fotistsiou.javatutorial.fundamentals.h_collections_framwork;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListCollection {

    public static void main(String[] args) {
        /* LinkedList */
        // -> The similarities between the LinkedList class and the ArrayList class:
        //    - They are collections which can contain many objects of the same type.
        //    - They have the same methods.
        //    - They can be used in the same way.
        // -> The differences between the LinkedList class and the ArrayList class:
        //    - They are built very differently.
        //    - ArrayList used for storing and accessing data and LinkedList used to manipulate data.

        // Create an LinkedList
        LinkedList<String> cars = new LinkedList<String>();

        // Add items to the LinkedList
        cars.add("Toyota");
        cars.add("BMW");
        cars.addFirst("Audi");
        cars.addLast("Volvo");
        cars.add(1, "Mazda"); // Add item at a specified position without remove the existing element.

        // Print the LinkedList
        System.out.println("Cars: " + cars);

        // Access an item in the ArrayList
        System.out.println("The 2nd car: " + cars.get(1));

        // LinkedList Size
        System.out.println("Number of cars: " + cars.size());

        // Remove an item from the LinkedList
        cars.remove(1);
        System.out.println("Cars after removing the 2nd car: " + cars);

        // Modify an item of the LinkedList
        cars.set(1, "Hyundai");
        System.out.println("Cars after modification of the 2nd car: " + cars);

        // Sort the LinkedList
        Collections.sort(cars);
        System.out.println("Cars after ascending sorting: " + cars);

        // Sort the LinkedList in reverse order
        Collections.sort(cars, Collections.reverseOrder());
        System.out.println("Cars after descending sorting: " + cars);

        // Loop through the items of the LinkedList
        int index = 0;
        for (String car : cars) {
            System.out.println("Car number " + index + ": " + car);
            index++;
        }

        // Remove all items from the LinkedList
        cars.clear();
        System.out.println("Cars after removing all cars: " + cars);
    }
}
