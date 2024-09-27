package fotistsiou.javatutorial.fundamentals.h_collections_framwork;

/* LinkedList */
// -> The LinkedList class is a collection which can contain many objects of the same type, just like the ArrayList.
// -> The LinkedList class has all the same methods as the ArrayList class (add, get, set, remove, clear etc).
// -> However, while the ArrayList class and the LinkedList class can be used in the same way, they are built very differently:
//    - The ArrayList class:
//      -> Has a regular array inside it.
//      -> When an element is added, it is placed into the array.
//      -> If the array is not big enough, a new, larger array is created to replace the old one and the old one is removed.
//    - The LinkedList class:
//      -> Stores its items in "containers."
//      -> The list has a link to the first container and each container has a link to the next container in the list.
//      -> To add an element to the list, the element is placed into a new container and that container is linked to one of the other containers in the list.
// -> Use an ArrayList for storing and accessing data, and LinkedList to manipulate data.

import java.util.LinkedList;

public class LinkedListCollection {

    public static void main(String[] args) {
        // Create an LinkedList object called cars that will store strings.
        LinkedList<String> cars = new LinkedList<String>();

        // Adds an item to the beginning/end of the LinkedList, use the addFirst/addLast method.
        cars.addFirst("Toyota");
        cars.addLast("BMW");
        cars.addLast("Audi");
        cars.addLast("Volvo");
        System.out.println("Cars: " + cars);

        // Get the item at the beginning/end of the list, use the getFirst/getLast method.
        System.out.println(cars.getFirst());
        System.out.println(cars.getLast());

        // Remove an item from the beginning of the list, use the removeFirst/removeLast method.
        System.out.println(cars.removeFirst());
        System.out.println(cars.removeLast());
        System.out.println("Cars: " + cars);
    }
}
