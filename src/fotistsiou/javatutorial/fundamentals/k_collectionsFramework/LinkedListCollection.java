package fotistsiou.javatutorial.fundamentals.k_collectionsFramework;

import java.util.Collections;
import java.util.LinkedList;

/**
 * LinkedList
 * -> A LinkedList implements List interface, as an ArrayList.
 * -> A LinkedList is a collection which can contain many objects of the same type.
 * -> A LinkedList have the same methods as an ArrayList.
 * -> A LinkedList can be used in the same way as an ArrayList.
 * -> A LinkedList contains elements with a reference to the next and previous element.
 * -> Use LinkedList when you frequently add or remove elements.
 */

public class LinkedListCollection {

    public static void main(String[] args) {
        // Create an LinkedList
        LinkedList<String> cars = new LinkedList<String>();

        // Add elements to the LinkedList
        cars.add("Toyota");
        cars.add("BMW");
        cars.addFirst("Audi");
        cars.addLast("Volvo");
        cars.add(1, "Mazda"); // Add element at a specified position without remove the existing element.

        // Print the LinkedList
        System.out.println("Cars: " + cars);

        // Access an element in the ArrayList
        System.out.println("The 2nd car: " + cars.get(1));

        // LinkedList Size
        System.out.println("Number of cars: " + cars.size());

        // Remove an element from the LinkedList
        cars.remove(1);
        System.out.println("Cars after removing the 2nd car: " + cars);

        // Modify an element of the LinkedList
        cars.set(1, "Hyundai");
        System.out.println("Cars after modification of the 2nd car: " + cars);

        // Sort the LinkedList
        Collections.sort(cars);
        System.out.println("Cars after ascending sorting: " + cars);

        // Sort the LinkedList in reverse order
        Collections.sort(cars, Collections.reverseOrder());
        System.out.println("Cars after descending sorting: " + cars);

        // Loop through the elements of the LinkedList
        int index = 0;
        for (String car : cars) {
            System.out.println("Car number " + index + ": " + car);
            index++;
        }

        // Remove all elements from the LinkedList
        cars.clear();
        System.out.println("Cars after removing all cars: " + cars);
    }
}
