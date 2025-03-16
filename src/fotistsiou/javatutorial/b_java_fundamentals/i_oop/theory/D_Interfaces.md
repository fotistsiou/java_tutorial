# Interfaces in Java

## What are Interfaces?

An **interface** in Java is a reference type that defines a contract that classes can implement. Unlike abstract
classes, an interface can only contain abstract methods (until Java 8, which introduced default and static methods).
Interfaces are used to achieve abstraction and multiple inheritance in Java.

### **Key Characteristics**

- Interfaces **cannot be instantiated** directly.
- All methods in an interface are **implicitly public and abstract**, unless they are static or default methods.
- All fields in an interface are **implicitly public, static, and final** (constants).
- Interfaces provide a way to define common behavior across multiple unrelated classes.

## Declaring Interfaces

To declare an interface, use the `interface` keyword:

```java
public interface Animal {
    void makeSound(); // Abstract method (implicitly public and abstract)
}
```

### **What Can an Interface Contain?**

| Feature             | Supported   | Notes                                |
|---------------------|-------------|--------------------------------------|
| Constant Fields     | ✅           | `public static final` (implicitly)   |
| Abstract Methods    | ✅           | `public abstract` (implicitly)       |
| Default Methods     | ✅ (Java 8+) | Requires `default` keyword           |
| Static Methods      | ✅ (Java 8+) | Requires `static` keyword            |
| Private Methods     | ✅ (Java 9+) | Can be used for helper methods       |
| Constructors        | ❌           | Not allowed in interfaces            |
| Non-constant Fields | ❌           | Fields must be `public static final` |

### **Example: Interface with Different Method Types**

```java
public interface Vehicle {
    int WHEELS = 4; // Implicitly public, static, and final

    void start(); // Abstract method

    default void honk() { // Default method with implementation
        System.out.println("Beep! Beep!");
    }

    static void displayInfo() { // Static method with implementation
        System.out.println("Vehicles can be driven.");
    }
}
```

## Interface Inheritance

### **1. Extending Multiple Interfaces**

An interface can extend multiple interfaces, allowing a flexible inheritance structure.

```java
public interface Flyable {
    void fly();
}

public interface Swimmable {
    void swim();
}

public interface Amphibious extends Flyable, Swimmable {
}
```

### **2. Implementing an Interface in a Class**

A class must provide implementations for all abstract methods of an interface it implements.

```java
public class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car is starting...");
    }
}
```

### **3. A Class Can Implement Multiple Interfaces**

```java
public class Duck implements Flyable, Swimmable {
    @Override
    public void fly() {
        System.out.println("Duck is flying.");
    }

    @Override
    public void swim() {
        System.out.println("Duck is swimming.");
    }
}
```

## Interface Usage

### **1. Polymorphism**

Interfaces enable polymorphism by allowing different classes to be treated as instances of the same type.

```java
Flyable bird = new Duck(); // A Duck is Flyable bird.

fly();
```

### **2. Multiple Inheritance**

Java does not support multiple inheritance with classes, but interfaces allow a class to inherit behavior from multiple
sources.

```java
public interface Runnable {
    void run();
}

public interface Jumpable {
    void jump();
}

public class Athlete implements Runnable, Jumpable {
    @Override
    public void run() {
        System.out.println("Athlete is running.");
    }

    @Override
    public void jump() {
        System.out.println("Athlete is jumping.");
    }
}
```

### **3. API Contracts**

Interfaces define a contract that ensures a class implements specific behavior, making them ideal for defining APIs.

```java
public interface Repository {
    void save(String data);

    String findById(int id);
}

public class DatabaseRepository implements Repository {
    @Override
    public void save(String data) {
        System.out.println("Saving data: " + data);
    }

    @Override
    public String findById(int id) {
        return "Data with ID: " + id;
    }
}
```

### **4. Default Methods (Java 8+)**

Interfaces can have methods with a default implementation, allowing new functionality to be added without breaking
existing implementations.

```java
public interface Gadget {
    default void charge() {
        System.out.println("Charging...");
    }
}
```

## Advantages of Interfaces

- **Code Reusability** – Interfaces promote modularity by allowing multiple classes to share common behavior without
  redundant code.
- **Loose Coupling** – They decouple implementation details from usage, making systems more flexible and easier to
  maintain.
- **Multiple Inheritance of Type** – A class can implement multiple interfaces, effectively inheriting multiple
  behaviors while avoiding the pitfalls of multiple class inheritance.
- **Flexible and Scalable Design** – Interfaces support scalable architecture by defining standardized interactions
  between components.
- **API Standardization** – They enforce a consistent contract across multiple classes, ensuring interoperability and
  maintainability in large codebases.

### **Conclusion**

Interfaces are a powerful tool in Java that provide abstraction, promote code reuse, and enable flexible design
patterns. By using interfaces effectively, developers can build scalable, maintainable, and well-structured
applications.

