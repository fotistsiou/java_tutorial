package fotistsiou.javatutorial.fundamentals.h_collections_framwork;

import java.util.*;

public class HashMapCollection {

    public static void main(String[] args) {
        /* HashMap */
        // -> A HashMap stores items in "key/value" pairs, and you can access them by an index of another type (e.g. a String).

        // Create a HashMap
        HashMap<String,String> cars = new HashMap<String, String>();

        // Add items to the HashMap (key, value)
        cars.put("Toyota", "Yaris");
        cars.put("BMW", "X5");
        cars.put("Audi", "A6");
        cars.put("Volvo", "XC90");
        cars.put("Mazda", "Mazda3");

        // Print the HashMap
        System.out.println("Cars: " + cars);

        // Access an item in the HashMap
        System.out.println("The 'Toyota' model: " + cars.get("Toyota"));

        // HashMap Size
        System.out.println("Number of cars: " + cars.size());

        // Remove an item from the HashMap
        cars.remove("Mazda");
        System.out.println("Cars after removing the 'Mazda' car: " + cars);

        // Modify an item of the HashMap
        cars.put("BMW", "Z4");

        // Sort the HashMap by keys
        TreeMap<String, String> sortedByKeys = new TreeMap<>(cars);
        System.out.println("Cars after ascending sorting by keys: " + sortedByKeys);

        // Sort the HashMap by keys in reverse order
        TreeMap<String, String> reverseSortedByKeys = new TreeMap<>(Collections.reverseOrder());
        reverseSortedByKeys.putAll(cars);
        System.out.println("Cars after descending sorting by keys: " + reverseSortedByKeys);

        // Sort the HashMap by values
        // -> Create a List from the HashMap's Entries
        List<Map.Entry<String, String>> entrySortedByValues = new ArrayList<>(cars.entrySet());
        // -> Sort the list using a comparator that compares by values
        entrySortedByValues.sort(Map.Entry.comparingByValue());
        // -> Create a linked hashmap to maintain the sorted order
        LinkedHashMap<String, String> sortedByValue = new LinkedHashMap<>();
        for (Map.Entry<String, String> entry : entrySortedByValues) {
            sortedByValue.put(entry.getKey(), entry.getValue());
        }
        // -> Print the sorted map by values
        System.out.println("Cars after ascending sorting by values: " + sortedByValue);

        // Sort the HashMap by values in reverse order
        List<Map.Entry<String, String>> entryReverseSortedByValues = new ArrayList<>(cars.entrySet());
        entryReverseSortedByValues.sort(Map.Entry.<String, String>comparingByValue().reversed());
        LinkedHashMap<String, String> reverseSortedByValues = new LinkedHashMap<>();
        for (Map.Entry<String, String> entry : entryReverseSortedByValues) {
            reverseSortedByValues.put(entry.getKey(), entry.getValue());
        }
        System.out.println("Cars after descending sorting by values: " + reverseSortedByValues);

        // Loop through the items of the HashMap
        int index = 0;
        // -> Print keys
        for (String car : cars.keySet()) {
            System.out.println("Car number " + index + ": " + car);
        }
        // -> Print values
        for (String model : cars.values()) {
            System.out.println("Model number " + index + ": " + model);
        }
        // -> Print keys & values
        for (String i : cars.keySet()) {
            System.out.println("Car: " + i + ", Model: " + cars.get(i));
        }

        // Remove all items from the HashMap
        cars.clear();
        System.out.println("Cars after removing all cars: " + cars);
    }
}
