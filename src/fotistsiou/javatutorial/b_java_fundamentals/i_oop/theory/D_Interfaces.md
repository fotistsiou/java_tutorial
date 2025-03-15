# Interfaces in Java

## What are Interfaces?

An interface in Java is similar to an abstract class, but with the key difference that it can only contain abstract
methods and fields (constants).
Interfaces define a contract that classes can implement, specifying what methods the implementing class must provide.

## Declaring interfaces

- An interface can be considered a special kind of class that can't be instantiated.
- To declare an interface, you should write the keyword interface instead of class before the name of the interface.
- An interface can contain:
    - **Constant fields** → Fields `public static final` (implicitly)
    - **Abstract methods** → Methods without a body/implementation (implicitly `public abstract`)
    - **Default methods** → Methods with a body using the `default` keyword (the keyword `default` is required)
    - **Static methods** → Methods with a body using the `static` keyword (the keyword `static` is required)
    - **Private methods** → Methods with implementation
- An interface cannot contain:
    - **Constructors**
    - **Non-public abstract methods**
    - **Non-constants field** (other than `public static final`)

## Interface Inheritance

1. **Extending Multiple Interfaces**: An interface can extend multiple interfaces, allowing a more flexible inheritance
   structure.
2. **Cannot Extend a Class**: An interface cannot extend a class, as it is designed to be implemented by classes, not
   inherited.
3. **Class Inheritance**: A class can extend only one class but can implement multiple interfaces.

## Advantages of Interfaces

- **Code Reusability**: Classes can implement multiple interfaces, promoting code reuse.
- **Loose Coupling**: Interfaces allow classes to interact without needing to know the specifics of each other, enabling
  a more flexible and maintainable design.
- **Multiple Inheritance of Type**: Through interfaces, a class can inherit multiple types (behavior), overcoming the
  limitation of single inheritance in Java classes.

Interfaces are a powerful way to define common behavior across different classes, ensuring consistency while promoting
flexibility.
