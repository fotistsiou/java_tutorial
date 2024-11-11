package fotistsiou.javatutorial.fundamentals.j_collectionsFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/**
 * Iterator
 * -> An Iterator is an object that can be used to loop through collections, like ArrayList and HashSet.
 */

public class IteratorCollection {
    public static void main(String[] args) {
        // Make a collection
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Toyota");
        cars.add("BMW");
        cars.add("Audi");
        cars.add("Volvo");
        cars.add("Mazda");

        // Get the iterator
        Iterator<String> iteratorCars1 = cars.iterator();

        // Print the first element
        System.out.println("The 1st car is " + iteratorCars1.next());

        // Looping Through a Collection
        int index = 0;
        while(iteratorCars1.hasNext()) {
            System.out.println("Car " + index + ": " + iteratorCars1.next());
            index++;
        }

        // Removing elements from a Collection
        // -> Use while loop to remove elements.
        // -> A for loop or a for-each loop would not work correctly because the collection is changing size at the same
        //    time that the code is trying to loop.
        Iterator<String> iteratorCars2 = cars.iterator();
        while(iteratorCars2.hasNext()) {
            String car = iteratorCars2.next();
            if(Objects.equals(car, "Mazda")) {
                iteratorCars2.remove();
            }
        }
        System.out.println("Cars: " + cars);
    }
}
