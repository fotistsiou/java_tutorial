# Errors in Program
Errors in program can be categorized into two broad groups: **compile-time errors** and **run-time errors**. 
Proper understanding and handling of these errors are essential to ensure the reliability and efficiency of your code.

## Compile-Time Errors
Compile-time errors are issues that prevent a program from being successfully compiled. These errors must be fixed 
before the program can run.
### Examples of Compile-Time Errors
- **Syntax errors:** Missing semicolons (`;`), incorrect keywords, or mismatched brackets.
- **File name mismatches:** Source code file names that do not match the class name in the code.
- **Invalid method calls:** Invoking methods that do not exist or have incorrect signatures.
- **Other issues:** incorrect data types, undeclared variables, and access modifier conflicts.
### How to Prevent Compile-Time Errors
- Use a modern **IDE (Integrated Development Environment)** with a **static code analyzer**.  
  Features of an IDE include:
  - Highlighting syntax errors.
  - Providing warnings for potential issues.
  - Suggesting improvements for better code quality.

## Run-Time Errors
Run-time errors, or **bugs**, occur when the program executes. These errors can lead to unexpected behavior or 
program crashes.
### Examples of Run-Time Errors
- **Logic Errors**
  - Errors in program logic that produce incorrect results. 
    Example: A program prints `"Hi!"` instead of `"Hello!"`.
- **Unhandled Exceptional Events**
  - Errors caused by unexpected conditions like:
    - Division by zero.
    - File not found.
    - Null references.
### How to Prevent Run-Time Errors
- **Debugging**: Manually test and identify errors by stepping through the program's execution.
- **Automated Testing**: Write test cases to ensure all components work as expected.
- **Code Reviews**: Have peers or senior developers inspect your code for potential issues.

---

# Exceptions in Program
Exceptions in Program are specific types of errors that occur during program execution. These errors, if unhandled, can crash 
the program.

## Hierarchy of Exceptions
All exceptions are considered objects of special classes organized into a class hierarchy.
### Simplified Hierarchy
#### The base class for all exceptions is `java.lang.Throwable`.
- This class provides a set of common methods for all exceptions:
  - `String getMessage()` returns the detailed string message of this exception object.
  - `Throwable getCause()` returns the cause of this exception or null if the cause is nonexistent or unknown.
  - `printStackTrace()` prints the stack trace on the standard error stream.
#### The Throwable class has two direct subclasses: `java.lang.Error` and `java.lang.Exception`.
- Subclasses of the `Error` class represent low-level exceptions in the JVM, for example: 
  - `OutOfMemoryError`
  - `StackOverflowError`
- Subclasses of the `Exception` class deal with exceptional events inside applications, such as:
  - `RuntimeException`
    - The `RuntimeException` class is a rather special subclass of `Exception`. It represents so-called unchecked 
      exceptions, including:
      - `ArithmeticException`
      - `NumberFormatException`
      - `NullPointerException`
  - `IOException`

## Checked and Unchecked Exceptions
- Checked exceptions are represented by the Exception class, excluding the RuntimeException subclass. 
  - The compiler checks whether the programmer expects the occurrence of such exceptions in a program or not. If a method 
    throws a checked exception, this must be marked in the declaration using the special throws keyword. Otherwise, the 
    program will not compile.
  - Example: `FileNotFoundException` 
- Unchecked exceptions are represented by the RuntimeException class and all its subclasses.
  - The compiler does not check whether the programmer expects the occurrence of such exceptions in a program.
  - Example: `NumberFormatException`

## Common Types of Exceptions
- **ArithmeticException**: Occur when a program attempts to divide by zero.
- **NumberFormatException**: Occur when a program attempts to convert an invalid string to a numeric type.
- **NullPointerException (NPE)**: Occur when a program attempts to use a variable with the null value.
- **NegativeArraySizeException**: Occur when a program attempts to create an array with a negative size.
- **ArrayIndexOutOfBoundsException**: Occur when a program attempts to access a non-existent element of the array.
- **StringIndexOutOfBoundsException**: Occur when a program attempts to access a non-existing element of a string.

## Exception Handling
To handle exceptions gracefully and ensure the program continues to operate, two main techniques are used:
### **Try-Catch-Finally Block**
- **`try`**: Defines a block of code to test for exceptions.
- **`catch`**: Defines a block of code to handle the exception if it occurs in the `try` block.
- **`finally`**: Executes code regardless of whether an exception was thrown or caught (e.g., releasing resources).
### Throw Statement
- Used to explicitly create and throw exceptions during runtime.
- Must specify an exception type to throw.
### Using Control Statements
- **`if-else` statements**: Handle exceptions based on conditions.
  - Simple Condition (e.g. `if (b == 0)`)
  - RegEx (e.g. `if (input.matches("\\d+")`)