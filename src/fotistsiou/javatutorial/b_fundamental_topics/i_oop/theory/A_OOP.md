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

Object-Oriented Programming (OOP) in Java is centered around four key principles that promote better organization,
modularity, and maintainability of code. These principles are **Encapsulation**, **Inheritance**, **Polymorphism**, and
**Abstraction**. Let's explore each of these concepts with code examples and further clarification.

### 1. **Encapsulation**

Encapsulation refers to the bundling of data (fields) and methods (functions) that operate on the data into a single
unit or class. Additionally, it hides the internal state of the object from the outside world, allowing access only
through public methods.

#### Benefits

- Protects the integrity of data.
- Provides a controlled interface to interact with data.
- Promotes modularity.

#### Example

```java
public class Person {
    private String name;  // Private field

    // Getter method for name
    public String getName() {
        return name;
    }

    // Setter method for name
    public void setName(String name) {
        this.name = name;
    }
}

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("John Doe");
        System.out.println(person.getName());  // Accessing the name via getter
    }
}
```

In this example, the `name` field is encapsulated and can only be accessed or modified using the `getName()` and
`setName()` methods.

### 2. **Inheritance**

Inheritance allows a class to inherit properties and methods from another class. It promotes code reusability and
establishes a natural hierarchy between classes.

#### Key Points:

- A subclass inherits the public and protected members of its superclass.
- Constructors are not inherited, but a subclass can call a superclass constructor using the `super` keyword.
- Java supports single inheritance, meaning a class can only inherit from one superclass.

#### Example

```java
class Animal {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal = new Dog();  // Dog is an Animal
        animal.sound();  // Outputs "Dog barks"
    }
}
```

Here, the `Dog` class extends the `Animal` class, inheriting its method `sound()` and overriding it to provide a more
specific implementation.

### 3. **Polymorphism**

Polymorphism allows objects to be treated as instances of their parent class, while still invoking the correct method
based on the actual object's type. This can occur in two main ways:

- **Method Overloading** (Compile-time Polymorphism): The ability to define multiple methods with the same name but
  different parameters.
- **Method Overriding** (Runtime Polymorphism): The ability for a subclass to provide a specific implementation of a
  method that is already defined in the superclass.

#### Examples

##### Example of Method Overloading (Compile-time Polymorphism):

```java
class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(5, 10));         // Calls int add method
        System.out.println(calc.add(5.5, 10.2));    // Calls double add method
    }
}
```

Here, the `add` method is overloaded, and the correct version is called based on the argument types.

##### Example of Method Overriding (Runtime Polymorphism):

```java
class Animal {
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal = new Dog();  // Polymorphism: Animal reference, Dog object
        animal.makeSound();  // Outputs "Dog barks"
    }
}
```

In this case, the `makeSound()` method in `Dog` overrides the method in `Animal`. Despite `animal` being of type
`Animal`, the method in `Dog` is invoked at runtime, demonstrating polymorphism.

### 4. **Abstraction**

Abstraction involves hiding the implementation details and exposing only the necessary parts of an object. This is often
done through abstract classes or interfaces.

- **Abstract Classes**: A class that cannot be instantiated on its own but can be extended by other classes.
- **Interfaces**: A contract that defines methods that the implementing class must provide.

#### Examples

##### Example of Abstraction with an Abstract Class:

```java
abstract class Animal {
    abstract void makeSound();  // Abstract method
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.makeSound();  // Outputs "Dog barks"
    }
}
```

The `Animal` class is abstract and contains an abstract method `makeSound()`, which must be implemented by any subclass
like `Dog`.


