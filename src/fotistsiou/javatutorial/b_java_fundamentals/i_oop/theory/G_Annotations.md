# Annotations in Java

## What are Annotations?

Annotations are metadata added to Java code to provide information to the compiler or runtime.
They do not change the program's behavior directly but can influence its execution through tools, libraries,
or frameworks.

## Common Uses of Annotations

- **Provide metadata** about classes, methods, fields, or other code elements.
- **Signal instructions** to the compiler, such as suppressing warnings or ensuring method overrides.
- **Facilitate frameworks** by offering configuration options directly in the code.

## Types of Annotations

### Built-in Annotations

1. **`@Override`**
    - Marks a method that overrides a superclass method.
    - This annotation can only be applied to methods.
2. **`@Deprecated`**
    - It is a simple annotation which means that the marked method (or class, field, and so on) is deprecated,
      that is, obsolete and should no longer be used.
    - This annotation causes a compiler warning if the code is used.
    - Starting from Java 9 it has two: since and forRemoval:
        - `since` requires the version (String) in which the annotated element has become deprecated. The default value
          is an empty string.
        - `forRemoval` indicates whether the annotated element is to be removed in a future version. The default value
          is false.
3. **`@SuppressWarnings`**
    - Commands the compiler to disable some compile-time warnings.
    - You specify in parameters which warnings you don't want to see.

### Meta-Annotations

Annotations that are applied to other annotations:

1. **`@Retention`**  
   Defines how long the annotation is retained (e.g., during runtime, in the class file, or only in source code).
2. **`@Target`**  
   Specifies where the annotation can be applied (e.g., on methods, fields, classes).
3. **`@Inherited`**  
   Indicates that an annotation on a class can be inherited by its subclasses.
4. **`@Documented`**  
   Ensures the annotation is included in the generated documentation (e.g., Javadoc).

## Custom Annotations

- Custom annotations can be created to serve specific use cases in applications. They often work in conjunction with
  reflection or custom frameworks.

- Custom annotations can be created by us or from an external source.
  Two common annotations from external sources are:
    - The `@NotNull` annotation that indicates either of the following two options:
        - a variable cannot be `null`
        - a method should not return `null`
    - The `@Range` annotation indicates either of the following options:
        - a variable always belongs to the specified range
        - a method returns an integer number that belongs to the specified range

## Advantages of Annotations

- **Improved clarity** by embedding metadata directly in the code.
- **Reduced boilerplate** by minimizing external configuration files.
- **Enhanced runtime flexibility** through dynamic processing of annotations.

Annotations are an essential part of Java programming, enabling robust and configurable applications while enhancing
code readability and maintainability.