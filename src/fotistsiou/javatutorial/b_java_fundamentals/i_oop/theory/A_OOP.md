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
     - The fields of a class can be made read-only, write-only, or both.
     - A class can have total control over what values are stored in the fields.
     - Users of a class don't know how the class stores its data and don't depend on the fields.

2. **Inheritance**
   - Inheritance is a mechanism for deriving a new class from another class (base class).
   - When it comes to inheritance, there are several terms:
     - A class derived from another class is called a subclass (it's also known as a derived class, extended class or 
       child class).
     - The class from which the subclass is derived is called a superclass (also a base class or a parent class).
   - To derive a new class from another, the keyword extends is used.
   - There are important points about inheritance in Java:
     - Java doesn't support multiple-class inheritance, meaning that a class can only inherit from a single superclass.
     - A class hierarchy can have multiple levels (class C can extend class B that extends class A).
     - A superclass can have more than one subclass.
     - A subclass:
       - Inherits all public and protected fields and methods from the superclass.
       - Can also add new fields and methods.
       - Doesn't inherit private fields and methods from the superclass. 
         - However, if the superclass has public or protected methods for accessing its private fields, these members 
           can be used inside subclasses.
     - Constructors are not inherited, but the superclass's constructor can be invoked from the subclass using the 
       special keyword super. 
     - When a class extends an abstract class must implement/override all of its abstract methods.
     - If a class is declared with the keyword final, it cannot have subclasses at all.


3. **Polymorphism** 
   Enabling objects to be treated as instances of their parent class while invoking the appropriate method implementation, 
   whether at compile time (method overloading) or runtime (method overriding).  
   **Example**: A parent class reference pointing to a child class object.

4. **Abstraction**  
   Hiding complex implementation details and exposing only the essential features through abstract classes or interfaces.  
   **Example**: Declaring an abstract class or interface with essential methods to be implemented by child classes.
