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
   Indicates that a method overrides another method from a superclass.

2. **`@Deprecated`**  
   Marks a method, field, or class as outdated and discourages its use.

3. **`@SuppressWarnings`**  
   Instructs the compiler to ignore specific warnings during compilation.

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
Custom annotations can be created to serve specific use cases in applications. They often work in conjunction with 
reflection or custom frameworks.

## Advantages of Annotations
- **Improved clarity** by embedding metadata directly in the code.
- **Reduced boilerplate** by minimizing external configuration files.
- **Enhanced runtime flexibility** through dynamic processing of annotations.

Annotations are an essential part of Java programming, enabling robust and configurable applications while enhancing 
code readability and maintainability.
