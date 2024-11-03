package fotistsiou.javatutorial.fundamentals.k_collectionsFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * HashMap
 * -> A HashSet implements Map interface.
 * -> A HashMap stores elements in "key/value" pairs, that one object is used as a key (index)
 *    to another object (value).
 * -> A HashMap can access to elements by an index of another type (e.g. a String).
 * -> Use HashMap when you need to map keys to values and retrieve values based on keys efficiently.
 */

public class HashMapCollection {

    public static void main(String[] args) {
        // Create a HashMap
        HashMap<String,String> cars = new HashMap<String, String>();

        // Add elements to the HashMap (key, value)
        cars.put("Toyota", "Yaris");
        cars.put("BMW", "X5");
        cars.put("Audi", "A6");
        cars.put("Volvo", "XC90");
        cars.put("Mazda", "Mazda3");

        // Print the HashMap
        System.out.println("Cars: " + cars);

        // Access an element in the HashMap
        System.out.println("The 'Toyota' model: " + cars.get("Toyota"));

        // HashMap Size
        System.out.println("Number of cars: " + cars.size());

        // Remove an element from the HashMap
        cars.remove("Mazda");
        System.out.println("Cars after removing the 'Mazda' car: " + cars);

        // Modify an element of the HashMap
        cars.put("BMW", "Z4");

        // Sort the HashMap by keys
        ArrayList<String> sortedByKeys = new ArrayList<String>(cars.keySet());
        Collections.sort(sortedByKeys);
        System.out.println("Cars after ascending sorting by keys: " + sortedByKeys);

        // Sort the HashMap by keys in reverse order
        ArrayList<String> reverseSortedByKeys = new ArrayList<String>(cars.keySet());
        Collections.sort(reverseSortedByKeys, Collections.reverseOrder());
        System.out.println("Cars after descending sorting by keys: " + reverseSortedByKeys);

        // Sort the HashMap by values
        // -> Create a ArrayList from elements of HashMap
        ArrayList<Map.Entry<String, String>> entrySortedByValues = new ArrayList<>(cars.entrySet());
        // -> Sort the list using a comparator that compares by values
        entrySortedByValues.sort(Map.Entry.comparingByValue());
        // -> Create a LinkedHashMap to maintain the sorted order
        LinkedHashMap<String, String> sortedByValue = new LinkedHashMap<>();
        for (Map.Entry<String, String> entry : entrySortedByValues) {
            sortedByValue.put(entry.getKey(), entry.getValue());
        }
        // -> Print the sorted map by values
        System.out.println("Cars after ascending sorting by values: " + sortedByValue);

        // Sort the HashMap by values in reverse order
        // -> Create a ArrayList from elements of HashMap
        ArrayList<Map.Entry<String, String>> entryReverseSortedByValues = new ArrayList<>(cars.entrySet());
        // -> Sort the list using a comparator that compares reversed by values
        entryReverseSortedByValues.sort(Map.Entry.<String, String>comparingByValue().reversed());
        // -> Create a LinkedHashMap to maintain the reversed sorted order
        LinkedHashMap<String, String> reverseSortedByValues = new LinkedHashMap<>();
        for (Map.Entry<String, String> entry : entryReverseSortedByValues) {
            reverseSortedByValues.put(entry.getKey(), entry.getValue());
        }
        // -> Print the reversed sorted map by values
        System.out.println("Cars after descending sorting by values: " + reverseSortedByValues);

        // Loop through the elements of the HashMap
        int indexKeys = 0, indexValues = 0, indexKeyValues = 0;
        // -> Print keys
        for (String car : cars.keySet()) {
            System.out.println("Car number " + indexKeys + ": " + car);
            indexKeys++;
        }
        // -> Print values
        for (String model : cars.values()) {
            System.out.println("Model number " + indexValues + ": " + model);
            indexValues++;
        }
        // -> Print keys & values
        for (String i : cars.keySet()) {
            System.out.println(indexKeyValues + ". Car: " + i + ", Model: " + cars.get(i));
            indexKeyValues++;
        }

        // Remove all elements from the HashMap
        cars.clear();
        System.out.println("Cars after removing all cars: " + cars);
    }
}
