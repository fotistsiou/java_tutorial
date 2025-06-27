# Introduction to generic programming

## Generic programming

There are situations when methods and classes do not depend on the **data types** on which they operate. For example,
the algorithm to find an element in an array can process arrays of strings, integers or custom classes. It does not
matter what the array stores: the algorithm is always the same. Yet we cannot write this algorithm as a single method,
because it requires different arguments (`int[]`, `String[]`, etc).

Since version 5, Java has supported **generic programming** that introduces abstraction over types. **Generic methods**
and classes can handle different types in the same general way. A concrete type is determined only when a developer
creates an object of the class or invokes the method. This approach enables us to write more abstract code and develop
reusable software libraries. Let us consider it step by step using examples written in Java.

## Type parameters

A generic type is a **generic class** (or interface) that is parameterized over types. To declare a generic class, we
need to declare a class with the **type parameter** section delimited by angle brackets `<` `>` following the class
name.

In the following example, the class `GenericType` has a single type parameter named `T`. We assume that the type `T` is
"some type" and write the class body regardless of the concrete type.

```java
class GenericType<T> {

    /**
     * A field of "some type"
     */
    private T t;

    /**
     * Takes a value of "some type" and assigns it to the field
     */
    public GenericType(T t) {
        this.t = t;
    }

    /**
     * Returns a value of "some type"
     */
    public T get() {
        return t;
    }

    /**
     * Takes a value of "some type", assigns it to a field and then returns it
     */
    public T set(T t) {
        this.t = t;
        return this.t;
    }
}
```

> A class can have any number of type parameters. But most generic classes have just one or two type parameters.

## The naming convention for type parameters

There is a naming convention that restricts type parameter name choices to single uppercase letters. Without this
convention, it would be difficult to tell the difference between a **type variable** and an ordinary class name.

The most commonly used type parameter names are:

- `T` – Type
- `S`, `U`, `V` etc. – 2nd, 3rd, 4th types
- `E` – Element (used extensively by different collections)
- `K` – Key
- `V` – Value
- `N` – Number

## Creating objects of generic classes

To create an object of a generic class (standard or custom), we need to specify the type argument following the type
name.

```java
GenericType<Integer> obj1 = new GenericType<Integer>(10);

GenericType<String> obj2 = new GenericType<String>("abc");
```

Java 7 made it possible to replace the type arguments required to invoke the constructor of a generic class with an
empty set of type arguments, as long as the compiler can infer the type arguments from the context.

```java
GenericType<Integer> obj1 = new GenericType<>(10);

GenericType<String> obj2 = new GenericType<>("abc");
```

Starting from Java 10, we can write var instead of a specific type to force automatic type inference based on the type
of assigned value.

```java
var obj1 = new GenericType<>(10);

var obj2 = new GenericType<>("abc");
```

> It is important to note that a type argument must be a **Reference Type**. **Primitive Types** like int or double are
> invalid type arguments.

After we have created an object with a specified type argument, we can invoke methods of the class that take or return
the type parameter:

```java
Integer number = obj1.get(); // 10
String string = obj2.get();  // "abc"

System.out.println(obj1.set(20));    // prints the number 20
System.out.println(obj2.set("def")); // prints the string "def"
```




