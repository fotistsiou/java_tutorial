# Java Classes, Fields, Methods & Constructors

## Classes
- A class is a blueprint for creating objects in Java. It defines the structure and behavior of an object by grouping 
  related fields and methods. Classes are declared using the `class` keyword.
- **Example**: A `Car` class may define properties like color and model and behaviors like driving or honking.

### Anonymous Class
- It is an inner classes with no name.
- Since it has no name, we cannot directly create new instances of them later.
- We have to declare and instantiate anonymous classes in a single expression at the point of use.
- In order to create an anonymous class we have to:
1. Extend an existing class.
   - When we instantiate an anonymous class from an existent one, we use the syntax "new Class(...){...}".
   - In the parentheses, we specify the parameters that are required by the constructor of the class
     that we are extending.
   - Anonymous classes cannot have any static members except for those that are constant.
2. Implement an interface.
   - When we instantiate an anonymous class from an interface, we use the syntax "new Interface(){...}".
   - Java’s interfaces have no constructors, so the parentheses always remain empty.
### Anonymous Object
- It is an instance of a class that is created without assigning it to a named reference variable.
- This object can be an instance of either a named class or an anonymous class.


## Fields
- Fields, also known as instance variables, are used to store data or properties of a class. Each object of the class can 
 have its own copy of the fields. Fields are declared inside a class but outside any method or constructor.
- **Key Points**:
  - Fields can have different access modifiers (`private`, `protected`, `public`).
  - Fields can be of any data type (primitive or reference).

## Methods
- Methods define the behavior of a class. They contain a block of code that performs a specific task when called. 
  Methods can take parameters and return values. They are declared inside a class.
- **Key Points**:
  - Use methods to implement logic or manipulate fields.
  - A method signature includes its name, parameters, and return type.
  - Special types of methods include static methods and instance methods.

## Constructors
- A constructor is a special method used to initialize objects of a class. It has the same name as the class and does not 
  have a return type. Constructors are invoked when a new object is created using the `new` keyword.
- **Key Points**:
  - A constructor can initialize fields or perform setup tasks.
  - If no constructor is defined, Java provides a default constructor.
  - You can define multiple constructors with different parameter lists (constructor overloading).
  - We can also invoke a constructor from another one. It allows you to initialize one part of an object by one 
    constructor and another part by another constructor. 
    - Calling a constructor inside another one is done using this.
    - You should place the statement this(...) in the first statement in the body of the second constructor.

## Summary
- **Class**: The blueprint or template for objects.
- **Fields**: Variables that store the state of an object.
- **Methods**: Define the behavior or actions of an object.
- **Constructors**: Special methods for initializing objects.
- Together, these elements form the core building blocks of object-oriented programming in Java, enabling the creation and 
  manipulation of objects.
