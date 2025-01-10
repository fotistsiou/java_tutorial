# Interfaces in Java

## What are Interfaces?
An interface in Java is similar to an abstract class, but with the key difference that it can only contain abstract 
methods and fields (constants). Interfaces define a contract that classes can implement, specifying what methods the 
implementing class must provide. Interfaces cannot have constructors, as they cannot be instantiated.

## Key Features of Interfaces
1. **Abstract Methods**: Interfaces can only declare abstract methods (methods without a body).
2. **Public and Abstract**: Interface methods are by default abstract and public, meaning they must be implemented by 
   the classes that implement the interface.
3. **No Constructor**: An interface cannot contain a constructor since objects cannot be created from an interface.

## Interface Methods
- Interface methods do not have a body. The body is provided by the class that implements the interface.
- Interface methods are **abstract** and **public** by default.

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
