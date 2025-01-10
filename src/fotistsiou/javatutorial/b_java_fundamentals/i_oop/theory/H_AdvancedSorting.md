# Advanced Sorting in Java

## What is Advanced Sorting?
In Java, to sort objects, you need to define a rule that specifies how the objects should be arranged. This is done 
through the `Comparator` and `Comparable` interfaces, which allow you to customize the sorting behavior.

## Comparable Interface
The `Comparable` interface allows an object to specify its own sorting rule by implementing the `compareTo()` method.
- The `compareTo()` method compares the current object with another object of the same type.
- It returns:
    - **Negative** if the current object should go first in the list.
    - **Positive** if the other object should go first.
    - **Zero** if the order does not matter.

This interface is used when the natural ordering of objects is needed (e.g., sorting objects based on their inherent 
properties).

## Comparator Interface
The `Comparator` interface allows you to create a separate class to define the sorting rule for objects.
- The `compare()` method is used to compare two objects.
- It returns:
    - **Negative** if the first object should go first in the list.
    - **Positive** if the second object should go first.
    - **Zero** if the order does not matter.

`Comparator` is useful when you need to provide different sorting criteria for the same object type.

## Key Differences Between Comparable and Comparator
- **Comparable**: The sorting rule is defined within the class itself (through `compareTo()`).
- **Comparator**: The sorting rule is defined externally (through a separate comparator class with `compare()`).

Both interfaces allow flexibility in sorting objects, with `Comparable` being used for natural ordering and `Comparator` 
providing custom sorting options.
