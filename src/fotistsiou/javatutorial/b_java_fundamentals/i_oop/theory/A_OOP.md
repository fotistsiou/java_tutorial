# Java - What is OOP?
Object-Oriented Programming (OOP) is a programming paradigm based on the concept of "objects," which can encapsulate 
data (fields) and behavior (methods). It is one of the core principles of Java and is widely used in modern software 
development.

## Advantages of OOP in Java

1. **Faster and Easier Development**  
   OOP enables a streamlined development process, making applications faster to build and easier to execute.

2. **Clear Program Structure**  
   By organizing code into classes and objects, OOP provides a logical and modular structure, improving code readability 
   and maintainability.

3. **Code Reusability**  
   OOP encourages the DRY (Don't Repeat Yourself) principle, allowing common functionalities to be written once and 
   reused across the application.

4. **Easier Maintenance and Debugging**  
   Modular code in OOP is easier to update, debug, and extend, reducing the time and effort required for maintenance.

5. **Shorter Development Time**  
   Reusable components in OOP lead to reduced development effort, making it possible to build full applications with 
   less code.

## The Four Pillars of OOP

### For further exploration of OOP concepts in Java, consider studying the four pillars of OOP:

1. **Encapsulation**  
   - According to the data encapsulation principle, the fields of a class cannot be directly accessed from other classes. 
     The fields can be accessed only through the methods of that particular class. 
   - To access hidden fields, programmers write special types of methods: getters and setters. Getters can only read 
     fields, and setters can only write (modify) the fields. Both types of methods should be public.
   - Using these methods gives us some advantages:
     - the fields of a class can be made read-only, write-only, or both;
     - a class can have total control over what values are stored in the fields;
     - users of a class don't know how the class stores its data and don't depend on the fields.

2. **Inheritance**  
   - In Java, it is possible to inherit attributes and methods from one class to another.
   - We group the "inheritance concept" into two categories:
     - subclass (child) - the class that inherits from another class.
     - superclass (parent) - the class being inherited from.
   - "Professor" subclass extends "Academic" superclass.
   - When a class extends an abstract class must implement/override all of its abstract methods.

3. **Polymorphism**  
   Enabling objects to be treated as instances of their parent class while invoking the appropriate method implementation, 
   whether at compile time (method overloading) or runtime (method overriding).  
   **Example**: A parent class reference pointing to a child class object.

4. **Abstraction**  
   Hiding complex implementation details and exposing only the essential features through abstract classes or interfaces.  
   **Example**: Declaring an abstract class or interface with essential methods to be implemented by child classes.
