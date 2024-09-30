package fotistsiou.javatutorial.fundamentals.h_collections_framwork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class HashSetCollection {

    public static void main(String[] args) {
        /* HashMap */
        // -> A HashSet is a collection which can contain many objects of the same type as a LinkedList and an ArrayList.
        // -> A HasSet contains unique items without duplicates.
        // -> A HasSet implements different interface than a LinkedList and an ArrayList.
        // -> Use HashSet when you need uniqueness of elements and fast access times for add, remove, and contains operations.

        // Create a HashSet
        HashSet<String> cars = new HashSet<String>();

        // Add items to the HashSet
        // -> A HashSet does not provide the addFirst and the addLast methods.
        // -> A HashSet does not provide direct add by index.
        cars.add("Toyota");
        cars.add("BMW");
        cars.add("Audi");
        cars.add("Volvo");
        cars.add("Mazda");

        // Print the HashSet
        System.out.println("Cars: " + cars);

        // Access an item in the HashSet
        // -> A HashSet does not provide direct access by index
        // -> A HashSet can check if an item exists
        if (cars.contains("Toyota")) {
            System.out.println("The car 'Toyota' is exists.");
        }

        // HashSet Size
        System.out.println("Number of cars: " + cars.size());

        // Remove an item from the HashSet
        // -> A HashSet does not provide direct remove by index.
        // -> A HashSet can remove an item by value.
        cars.remove("Mazda");
        System.out.println("Cars after removing the 'Mazda' car: " + cars);

        // Modify an item of the HashSet
        // -> A HashSet does not provide direct modify by index.
        // -> A HashSet can check if an item exists, then remove it and finally add another item.
        if (cars.contains("Volvo")) {
            cars.remove("Volvo");
            cars.add("Mazda");
        }
        System.out.println("Cars after modification of the 'Volvo' car: " + cars);

        // Sort the HashSet
        // -> A HashSet does not maintain any order of its elements, as it is an unordered collection.
        // -> If you need to sort the elements of a HashSet, you can convert it into a List to sort the elements.
        List<String> sortedCars = new ArrayList<>(cars);
        Collections.sort(sortedCars);
        System.out.println("Cars after ascending sorting: " + sortedCars);

        // Sort the HashSet in reverse order
        // -> A HashSet does not maintain any order of its elements, as it is an unordered collection.
        // -> If you need to sort the elements of a HashSet, you can convert it into a List to sort the elements.
        List<String> reverseSortedCars = new ArrayList<>(cars);
        Collections.sort(reverseSortedCars, Collections.reverseOrder());
        System.out.println("Cars after descending sorting: " + reverseSortedCars);

        // Loop through the items of the ArrayList
        int index = 0;
        for (String car : cars) {
            System.out.println("Car number " + index + ": " + car);
            index++;
        }

        // Remove all items from the HashSet
        cars.clear();
        System.out.println("Cars after removing all cars: " + cars);
    }
}
