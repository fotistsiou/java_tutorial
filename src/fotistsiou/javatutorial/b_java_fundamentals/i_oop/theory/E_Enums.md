# Enums in Java

## What are Enums?
An enum is a special type of class that represents a group of constants (unchangeable variables, like `final` variables).
Enums are used when a variable can only take one of a limited set of values, providing better type safety and clarity.

## Key Features of Enums
1. **Attributes and Methods**: Enums can have attributes and methods, allowing them to store additional data and define 
   behavior.
2. **Interfaces**: Enums can implement interfaces, enabling additional functionality.
3. **No Object Creation**: Enums cannot be used to create objects directly; they are predefined constants.
4. **Cannot Extend Classes**: Enums cannot extend other classes but implicitly extend `java.lang.Enum`.

## Defining an Enum
To define an enum:
- Use the `enum` keyword.
- Separate the constants with a comma.

## Enum Constants
- Enum constants should be written in **uppercase letters** to follow Java naming conventions.
- They are **public**, **static**, and **final** (i.e., unchangeable and cannot be overridden).

## Methods for processing Enums
- Initialize a variable of the Enum type:
  - ELevel verbalGrading = ELevel.INSUFFICIENT;
- Accessed by using the method name():
  - System.out.println(verbalGrading.name());
- Access an enumeration instance by its name:
  - ELevel verbalGrading = ELevel.valueOf("INSUFFICIENT");

## Advantages of Enums
- Enums provide type safety, ensuring only valid values are used.
- They make the code more readable and maintainable, especially for a fixed set of related constants.
- Enums can have fields, methods, and constructors to store additional data and functionality.

Enums are ideal for scenarios where a variable can have only a limited number of predefined values.
