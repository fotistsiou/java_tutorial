# Variables

- Variables are containers for storing data values.
- To create a variable, you must specify the type, declare a variable name and assign it a value.
- You can also declare a variable without assigning the value, and assign the value later.
- To declare more than one variable of the same type, you can use a comma-separated list.

# Data Types

- The Java Data Types are divided into two groups:
    - Primitive Data Types (byte, short, int, long, float, double, boolean & char)
    - Reference Data Types (Arrays, Strings, Wrapper Classes, Classes, Interface etc.)
- The basic difference between primitive and reference types is how the types are stored.
    - There are two main memory spaces: stack and heap.
    - All values of primitive types are stored in stack memory.
    - Variables of reference types store addresses of objects located in heap memory.

# Wrapper Classes

Wrapper Classes provide a way to use primitive data types as objects. Each primitive type has a class dedicated to it.
These classes are known as wrappers and they are immutable (just like strings).

Wrapper classes can be used in different situations:
- when a variable can be null (absence of a value)
- when you need to store values in generic collections (will be considered in the next topics)
- when you want to use special methods of these classes

- byte -> Byte
- short -> Short
- int -> Integer
- long -> Long
- float -> Float
- double -> Double
- boolean -> Boolean
- char -> Character

# Type Casting

- In Java, there are 2 types of casting:
    - Widening Casting (automatically) - converting a smaller type to a larger type size:
      byte -> short -> char -> int -> long -> float -> double
    - Narrowing Casting (manually) - converting a larger type to a smaller size type:
      double -> float -> long -> int -> char -> short -> byte
